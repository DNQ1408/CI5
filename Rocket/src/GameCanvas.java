import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameCanvas extends JPanel {
    private Random random = new Random();

    private List<Star> stars;
    private List<Enemy> enemies;
    private Player player;

    private BufferedImage backBuffered;
    private Graphics graphics;
    private Background background;

    private int countStar;
            int countEnemy;


    public GameCanvas() {
        // Set size
        this.setSize(1024, 600);
        // Khoi tao back buffer
        this.setupBackBuffered();
        // Load Image
        this.stars = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.setVisible(true);
    }

//    private void setupStar() {
//        this.star = new Star( 900, 600, this.loadImage("resources/images/star.png"), 3,3,2);
//    }

    private void setupBackBuffered() {
        this.backBuffered = new BufferedImage(1024, 600, BufferedImage.TYPE_4BYTE_ABGR);
        /*Khai bao graphic: but ve cua Buffer*/
        this.graphics = this.backBuffered.getGraphics();
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Noi ve toan bo moi thu
        // front
        g.drawImage(this.backBuffered, 0, 0, null);
    }

    public void renderAll() {
        this.drawBackground();
        this.stars.forEach(star -> star.render(graphics));
        this.enemies.forEach(enemy -> enemy.render(graphics));
        this.player.render(graphics);
        this.repaint();
    }

    public void runAll() {
        // cap nhat tat ca moi thu
        //star
        this.creatStar();
        this.stars.forEach(star -> star.run());
        //enemy (circle)
        this.creatEnemy();
        this.enemies.forEach(enemy -> enemy.run());
        //player
        this.creatPlayer();
        this.player.run();
    }

    private void creatPlayer() {
        int[] xpoints = {100, 100, 140};
        int[] ypoints = {260, 280, 270};

        this.player = new Player(xpoints, ypoints,10, Color.WHITE);
    }

    private void creatStar() {
        if (this.countStar == 20) {
            Star star = new Star(1024, random.nextInt(600) + 1, this.loadImage("resources/images/star.png"), 3, 3, random.nextInt(4) + 1);
            this.stars.add(star);
            this.countStar = 0;
        } else {
            this.countStar += 1;
        }
    }

    private void creatEnemy() {
        if (this.countEnemy == 20) {
            Enemy enemy = new Enemy(random.nextInt(1024)+1, 0, this.loadImage("resources/images/circle.png"), 10, 10, random.nextInt(2) + 1);
            this.enemies.add(enemy);
            this.countEnemy = 0;
        } else {
            this.countEnemy += 1;
        }
    }

    public void drawBackground() {
        this.background = new Background(1024, 600, Color.BLACK, 0, 0);
        this.background.render(this.graphics);
    }

    private BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
