package game.player.bullet;

import base.GameObject;
import base.Vector2D;
import game.enemy.Enemy;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import physic.RunHitObject;
import renderer.ImageRenderer;

import java.awt.*;

public class BulletPlayer extends GameObject implements PhysicBody, HitObject{
    public BoxCollider boxCollider;
    public Vector2D velocity;
    private RunHitObject runHitObject;

    // constructor
    public BulletPlayer() {
        this.velocity = new Vector2D();
        this.renderer = new ImageRenderer("resources/images/star.png", 8, 8, Color.RED);
        this.boxCollider = new BoxCollider(10,10);
        this.runHitObject = new RunHitObject(
            Enemy.class
        );
    }

    @Override
    public void run() {
        super.run();
        this.position.addUp(this.velocity);
        this.boxCollider.position.set(this.position);
        this.runHitObject.run(this);
    }

    @Override
    public void getHit(GameObject gameObject) {
        this.isAlive = false;
    }


    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
