package decouple.command.bl;

/**
 * Created by zzt on 3/20/16.
 * <p>
 * Usage:
 */
public class AddCommand implements Command {
    @Override
    public boolean doEdit() {
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
