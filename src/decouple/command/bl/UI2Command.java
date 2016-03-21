package decouple.command.bl;

import java.util.ArrayList;

/**
 * Created by zzt on 3/21/16.
 * <p>
 * Usage:
 */
public class UI2Command {
    private ArrayList<Command> commands = new ArrayList<>();
    private ArrayList<Command> redos = new ArrayList<>();

    public void add(String msg) {
        AddCommand addCommand = new AddCommand(new EditBL());
        addCommand.doEdit(msg);
        commands.add(addCommand);
    }

    public void undo() {
        Command remove = commands.remove(commands.size() - 1);
        redos.add(remove);
        remove.undo();
    }

    public void redo() {
        Command remove = redos.remove(redos.size() - 1);
        commands.add(remove);
        remove.redo();
    }
}
