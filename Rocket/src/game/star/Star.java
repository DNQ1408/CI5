package game.star;

import base.GameObject;
import base.Vector2D;
import renderer.ImageRenderer;

import java.awt.*;

public class Star extends GameObject {
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
