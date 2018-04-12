import java.awt.*;

public class Player {
    public int[] xpoints;
    public int[] ypoints;
    public int npoints;
    public int velocityX;
    public Color color;

    public Player(int[] xpoints, int[] ypoints, int velocityX, Color color) {
        this.xpoints = xpoints;
        this.ypoints = ypoints;
        this.npoints = xpoints.length;
        this.velocityX = velocityX;
        this.color = color;
    }

    public void run() {
        for (int i = 0; i < xpoints.length; i++) {
            this.xpoints[i] += velocityX;
        }
        System.out.println("Player Running");
    }

    public void render(Graphics graphics) {
        Polygon p = new Polygon(xpoints, ypoints, npoints);
        graphics.setColor(color);
        graphics.fillPolygon(p);
    }

}