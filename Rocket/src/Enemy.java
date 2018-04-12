import java.awt.*;
import java.awt.image.BufferedImage;

public class Enemy {
    public int x;
    public int y;

    public BufferedImage image;
    public int width;
    public int height;
    public int velocityY;

    //constructor
    public Enemy(int x, int y, BufferedImage image, int width, int height, int velocityY) {
        this.x = x;
        this.y = y;
        this.image = image;
        this.width = width;
        this.height = height;
        this.velocityY = velocityY;
    }

    public void run() {
        this.y += this.velocityY;
    }

    public void render(Graphics graphics) {
        graphics.drawImage(image, x, y, width, height, null);
    }
}
