import java.awt.*;

public class Background {
    public int width;
    public int height;
    public Color color;

    public int x;
    public int y;

    public Background(int width, int height, Color color, int x, int y) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void render(Graphics g){
        g.setColor(this.color);
        g.fillRect(x,y,width,height);
    }
}