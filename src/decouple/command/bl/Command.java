package decouple.command.bl;

/**
 * Created by zzt on 3/20/16.
 * <p>
 * Usage:
 */
public interface Command {

    boolean doEdit();
    boolean redo();
    boolean undo();

}
