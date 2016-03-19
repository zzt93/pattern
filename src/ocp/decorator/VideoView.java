package ocp.decorator;

/**
 * Created by zzt on 3/19/16.
 * <p>
 * Usage:
 */
public class VideoView implements UIComponent{
    @Override
    public void draw() {
        System.out.println("draw view of video");
    }
}
