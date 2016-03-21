package decouple.command.data;

import decouple.command.bl.FileDir;
import decouple.command.bl.FilePos;

/**
 * Created by zzt on 3/21/16.
 * <p>
 * Usage:
 */
public class EditFile implements EditDataService {
    public static final int INIT_CAPACITY = 1024;
    private static EditFile ourInstance = new EditFile();
    private final StringBuilder buffer;
    private int cursor = 0;

    public static EditFile getInstance() {
        return ourInstance;
    }

    private EditFile() {
        buffer = new StringBuilder(INIT_CAPACITY);
    }

    @Override
    public synchronized boolean add(String msg) {
        buffer.append(msg);
        cursor = buffer.length();
        return true;
    }

    @Override
    public synchronized String delete(int num) {
        if (cursor < num) {
            return null;
        }
        String res = buffer.substring(cursor - num, cursor);
        buffer.delete(cursor - num, cursor);
        return res;
    }

    @Override
    public synchronized boolean moveCursor(long dis, FilePos pos, FileDir dir) {
        if (dis < 0) {
            return false;
        }
        switch (pos) {
            case START:
                cursor = 0;
                break;
            case END:
                cursor = buffer.length();
                break;
            case NOW:
                break;
        }
        if (dir == FileDir.BACKWARD) {
            dis = -dis;
        }
        if (cursor + dis < 0 || cursor + dis >= buffer.length()) {
            return false;
        }
        cursor += dis;
        return true;
    }

}
