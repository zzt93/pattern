package decouple.command.bl;

/**
 * Created by zzt on 3/21/16.
 * <p>
 * Usage:
 */
public class DeleteCommand implements Command {

    private EditBLService edit = new EditBL();
    private String msg;

    @Override
    public boolean doEdit(String msg) {
        this.msg = msg;
        edit.delete(msg.length());
        return false;
    }

    @Override
    public boolean redo() {
        edit.delete(msg.length());
        return false;
    }

    @Override
    public boolean undo() {
        edit.add(msg);
        return false;
    }
}
