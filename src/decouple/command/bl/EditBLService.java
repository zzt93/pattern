package decouple.command.bl;

/**
 * Created by zzt on 3/20/16.
 * <p>
 * Usage:
 */
public interface EditBLService {

    boolean add(String msg);
    boolean delete(String msg);
    boolean moveCursor(long dis, FileDir dir);

}
