import java.awt.*;

public class Background {
    public Vector2D position;
    public BackgroundRenderer backgroundrenderer;

    public Background() {
        this.position = new Vector2D();
        this.backgroundrenderer = new BackgroundRenderer(this.position);
    }

    public void render(Graphics graphics) {
        this.backgroundrenderer.render(graphics);
    }
}
