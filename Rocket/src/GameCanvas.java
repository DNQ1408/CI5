import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameCanvas extends JPanel {

    private List<Star> stars;
    private List<Enemy> enemies;

    private BufferedImage backBuffered;
    private Background background;
    private Graphics graphics;
    private Random random;
    private FrameCounter frameCounterS, frameCounterE;
    public static Player player;


    public GameCanvas() {
        // Set size
        this.setSize(1024, 600);
        this.setupBackBuffered();
        this.stars = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.random = new Random();
        this.background = new Background();
        this.background.position.set(0,0);
        this.frameCounterE = new FrameCounter(30);
        this.frameCounterS = new FrameCounter(30);
        this.player = new Player();
        this.player.position.set(200,200);
        this.setVisible(true);
    }

    private void setupBackBuffered() {
        this.backBuffered = new BufferedImage(1024, 600, BufferedImage.TYPE_4BYTE_ABGR); //khoi tao object
        this.graphics = this.backBuffered.getGraphics();
        BufferedImage back2 = this.backBuffered; //dang tro cung den mot object (cung chua mot dia chi)
        back2.setRGB(20, 20, 255);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(this.backBuffered, 0, 0, null);
    }

    public void renderAll() {
        this.background.render(this.graphics);
        this.stars.forEach(star -> star.render(graphics));
        this.player.render(this.graphics);
        this.enemies.forEach(enemy -> enemy.render(graphics));
        this.repaint();
    }

    public void runAll() {
        // cap nhat tat ca moi thu
        this.createStar();
        this.creatEnemy();
        this.stars.forEach(star -> star.run());
        this.enemies.forEach(enemy -> enemy.run());

        this.player.run();

        this.enemies.forEach(enemy -> enemy.velocity.set(
                        player.position
                                .subtract(enemy.position)
                                .normalize()
                ).multiply(2)
        );
    }

    private void createStar() {
        if (this.frameCounterS.run()) {
            Star star = new Star();
            star.position.set(1024, this.random.nextInt(600));
            star.velocity.set(new Vector2D(this.random.nextInt(2) + 1, 0));
            this.stars.add(star);
            this.frameCounterS.reset();
        }
    }

    private void creatEnemy() {
        if (this.frameCounterE.run()) {
            Enemy enemy = new Enemy();
            enemy.position.set(new Vector2D(random.nextInt(1024), random.nextInt(600)));
            this.enemies.add(enemy);
            this.frameCounterE.reset();
        }
    }

}
