import java.awt.*;

public class PlayerShoot {
    public Vector2D position;
    public Vector2D velocity;
    private ImageRenderer renderer;

    public PlayerShoot() {
        this.position = GameCanvas.player.position;
        this.velocity = new Vector2D(3,0);
        this.renderer = new ImageRenderer("resources/images/circle.png",1,1);
    }


    public void render(Graphics graphics) {
        this.renderer.render(graphics, this.position);
    }
    public void run(){
        this.position.addUp(this.velocity);
    }
}
