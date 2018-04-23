public class BulletPlayer extends GameObject{

    public Vector2D velocity;

    // constructor
    public BulletPlayer() {
        this.velocity = new Vector2D();
        this.renderer = new ImageRenderer("resources/images/circle.png", 4,4);
    }


    public void run() {
        super.run();
        this.position.addUp(this.velocity);
    }
}
