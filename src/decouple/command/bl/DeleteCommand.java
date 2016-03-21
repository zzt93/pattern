package decouple.command.bl;

/**
 * Created by zzt on 3/21/16.
 * <p>
 * Usage:
 */
public class DeleteCommand implements Command {
    @Override
    public boolean doEdit(String msg) {
        return false;
    }

    @Override
    public boolean redo() {
        return false;
    }

    @Override
    public boolean undo() {
        return false;
    }
}
