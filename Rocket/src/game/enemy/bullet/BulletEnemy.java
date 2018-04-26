package game.enemy.bullet;

import base.GameObject;
import base.GameObjectManager;
import base.Vector2D;
import game.player.Player;
import physic.BoxCollider;
import renderer.ImageRenderer;

public class BulletEnemy extends GameObject {
    public BoxCollider boxCollider;
    public Vector2D velocity;

    public BulletEnemy() {
        this.velocity = new Vector2D();
        this.renderer = new ImageRenderer("resources/images/star.png", 3, 3);
        this.boxCollider = new BoxCollider(3,3);
    }

    public void run() {
        super.run();
        this.position.addUp(this.velocity);
        this.boxCollider.position.set(this.position);
        this.checkCollision();
    }

    public void checkCollision(){
        Player player = GameObjectManager.instance.checkCollisionPlayer(this.boxCollider);
        if (player != null) {
            player.getHit();
            this.getHit();
        }
    }

    private void getHit() {
        this.isAlive = false;
    }

}