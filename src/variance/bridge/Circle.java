package variance.bridge;

/**
 * Created by zzt on 3/18/16.
 * <p>
 * Usage:
 */
public class Circle extends Shape {

    public Circle(DrawTool drawTool) {
        super(drawTool);
    }

    @Override
    public void draw() {
        super.drawCircle();
    }
}
