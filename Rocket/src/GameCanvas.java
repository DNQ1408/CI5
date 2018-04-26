import base.GameObjectManager;
import game.background.Background;
import game.enemy.EnemySqwaner;
import game.player.Player;
import game.star.StarSqwaner;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class GameCanvas extends JPanel {

    private BufferedImage backBuffered;
    private Graphics graphics;
    public Player player;

    public GameCanvas() {
        this.setSize(1024, 600);
        this.setupBackBuffered();
        GameObjectManager.instance.add(new Background());
        this.setupPlayer();
        GameObjectManager.instance.add(new EnemySqwaner());
        GameObjectManager.instance.add(new StarSqwaner());
        this.setVisible(true);
    }

    private void setupBackBuffered() {
        this.backBuffered = new BufferedImage(1024, 600, BufferedImage.TYPE_4BYTE_ABGR); //khoi tao object
        this.graphics = this.backBuffered.getGraphics();
    }

    private void setupPlayer() {
        this.player = new Player();
        this.player.position.set(200, 200);
        GameObjectManager.instance.add(this.player);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(this.backBuffered, 0, 0, null);
    }

    public void renderAll() {
        GameObjectManager.instance.renderAll(this.graphics);
        this.repaint();
    }

    public void runAll() {
        GameObjectManager.instance.runAll();
        Input.KeyInput.instance.reset();
    }



}
