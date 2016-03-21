package decouple.command.bl;

/**
 * Created by zzt on 3/20/16.
 * <p>
 * Usage:
 */
public interface EditBLService {

    boolean add(String msg);

    String delete(int num);

    boolean moveCursor(long dis, FilePos pos, FileDir dir);

}
