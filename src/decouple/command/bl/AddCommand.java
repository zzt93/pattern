package decouple.command.bl;

/**
 * Created by zzt on 3/20/16.
 * <p>
 * Usage:
 */
public class AddCommand implements Command {

    EditBLService editBLService;
    private String msg;

    public AddCommand(EditBLService editBLService) {
        this.editBLService = editBLService;
    }

    @Override
    public boolean doEdit(String msg) {
        this.msg = msg;
        return editBLService.add(msg);
    }

    @Override
    public boolean redo() {
        return editBLService.add(msg);
    }

    @Override
    public boolean undo() {
        String delete = editBLService.delete(msg.length());
        return delete != null;
    }
}
