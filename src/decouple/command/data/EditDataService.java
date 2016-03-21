package decouple.command.data;

import decouple.command.bl.FileDir;
import decouple.command.bl.FilePos;

/**
 * Created by zzt on 3/21/16.
 * <p>
 * Usage:
 */
public interface EditDataService {

    boolean add(String msg);

    String delete(int num);

    boolean moveCursor(long dis, FilePos pos, FileDir dir);

}
