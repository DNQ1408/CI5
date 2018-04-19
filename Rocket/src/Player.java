import java.awt.*;

public class Player {
    public Vector2D position;
    private PolygonRenderer renderer;
    PlayerMove playerMove;
//    private PlayerShoot playerShoot;


    public Player() {
        this.position = new Vector2D();
        this.renderer = new PolygonRenderer(Color.RED,
                new Vector2D(),
                new Vector2D(0, 16),
                new Vector2D(20, 8)
                );
        this.playerMove = new PlayerMove();
//        this.playerShoot = new PlayerShoot();
    }

    public void render(Graphics graphics) {
        this.renderer.render(graphics, this.position);
//        this.playerShoot.render(graphics);
    }

    public void run(){
        this.playerMove.run(this);
//        this.playerShoot.run();
        this.renderer.angle = this.playerMove.angle;
    }

}
