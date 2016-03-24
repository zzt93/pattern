package decouple.command.bl;

/**
 * Created by zzt on 3/24/16.
 * <p>
 * Usage:
 */
public class CursorCommand implements Command {

    private EditBLService edit = new EditBL();
    private FileDir dir;
    private FilePos pos;
    private long dis;

    public CursorCommand(FileDir dir, FilePos pos, long dis) {
        this.dir = dir;
        this.pos = pos;
        this.dis = dis;
    }

    @Override
    public boolean doEdit(String msg) {
        edit.moveCursor(dis, pos, dir);
        return false;
    }

    @Override
    public boolean redo() {
        edit.moveCursor(dis, pos, dir.getOpposite());
        return false;
    }

    @Override
    public boolean undo() {
        return edit.moveCursor(dis, pos, dir);
    }
}
