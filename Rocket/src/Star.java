import java.awt.*;
import java.awt.image.BufferedImage;

public class Star extends GameObject{
    public Vector2D velocity;

    // constructor
    public Star() {
        this.velocity = new Vector2D();
        this.renderer = new ImageRenderer("resources/images/star.png", 3,3);
    }

    @Override
    public void run() {
        super.run();
        this.position.subtractBy(this.velocity);
    }

}
