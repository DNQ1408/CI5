package game.player.bullet;

import base.GameObject;
import base.GameObjectManager;
import base.Vector2D;
import game.enemy.Enemy;
import physic.BoxCollider;
import renderer.ImageRenderer;

public class BulletPlayer extends GameObject {
    public BoxCollider boxCollider;
    public Vector2D velocity;

    // constructor
    public BulletPlayer() {
        this.velocity = new Vector2D();
        this.renderer = new ImageRenderer("resources/images/star.png", 4, 4);
        this.boxCollider = new BoxCollider(4,4);
    }

    @Override
    public void run() {
        super.run();
        this.position.addUp(this.velocity);
        this.boxCollider.position.set(this.position);
        this.checkCollision();
    }

    public void checkCollision(){
        Enemy enemy = GameObjectManager.instance.checkCollision(this.boxCollider);
        if (enemy != null) {
            enemy.getHit();
            this.getHit();
        }
    }

    private void getHit() {
        this.isAlive = false;
    }

}
