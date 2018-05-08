package particle;

import base.GameObject;
import base.Vector2D;
import renderer.ImageRenderer;

import java.awt.*;

public class Particle extends GameObject {
    public Vector2D velocity;

    public Particle() {
        this.velocity = new Vector2D();
        ImageRenderer imageRenderer = new ImageRenderer("resources/images/circle.png", 10, 10, Color.LIGHT_GRAY, true, 15);
        imageRenderer.deltaSize = 1;
        this.renderer = imageRenderer;
    }



    @Override
    public void run() {
        super.run();
        this.position.addUp(velocity);
        if (this.renderer instanceof ImageRenderer) {
            int width = ((ImageRenderer)this.renderer).width;
            int height = ((ImageRenderer)this.renderer).height;
            if (width == 0 || height == 0) {
                this.isAlive = false;
            }
        }
    }

}
