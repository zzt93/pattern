package decouple.command.bl;

import decouple.command.data.EditDataService;
import decouple.command.data.EditFile;

/**
 * Created by zzt on 3/21/16.
 * <p>
 * Usage:
 */
public class EditBL implements EditBLService {

    private final EditDataService dataService;

    public EditBL() {
        dataService = EditFile.getInstance();
    }

    @Override
    public boolean add(String msg) {
        return dataService.add(msg);
    }

    @Override
    public String delete(int num) {
        return dataService.delete(num);
    }

    @Override
    public boolean moveCursor(long dis, FilePos pos, FileDir dir) {
        return dataService.moveCursor(dis, pos, dir);
    }

}
