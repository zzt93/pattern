package variance.bridge;

/**
 * Created by zzt on 3/18/16.
 * <p>
 * Usage:
 */
public class Line extends Shape {

    public Line(DrawTool drawTool) {
        super(drawTool);
    }

    @Override
    public void draw() {
        super.drawLine();
    }
}
