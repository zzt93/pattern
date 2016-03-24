package decouple.command.bl;

/**
 * Created by zzt on 3/20/16.
 * <p>
 * Usage:
 */
public enum FileDir {
    FORWARD {
        @Override
        public long getDistance(long dis) {
            return dis;
        }

        @Override
        public FileDir getOpposite() {
            return BACKWARD;
        }
    },
    BACKWARD {
        @Override
        public long getDistance(long dis) {
            return -dis;
        }

        @Override
        public FileDir getOpposite() {
            return FORWARD;
        }
    },
    ;

    public abstract long getDistance(long dis);
    public abstract FileDir getOpposite();
}
