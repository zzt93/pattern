package variance.bridge;

/**
 * Created by zzt on 3/18/16.
 * <p>
 * Usage:
 */
public abstract class Shape {

    private DrawTool drawTool;

    public Shape(DrawTool drawTool) {
        this.drawTool = drawTool;
    }

    public abstract void draw();

    protected void drawLine() {
        drawTool.drawLine();
    }

    protected void drawCircle() {
        drawTool.drawCircle();
    }

}
