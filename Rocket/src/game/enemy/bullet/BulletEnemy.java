package game.enemy.bullet;

import base.GameObject;
import base.GameObjectManager;
import base.Vector2D;

import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import renderer.ImageRenderer;

import java.awt.*;

public class BulletEnemy extends GameObject implements PhysicBody, HitObject{
    public BoxCollider boxCollider;
    public Vector2D velocity;


    public BulletEnemy() {
        this.velocity = new Vector2D();
        this.renderer = new ImageRenderer("resources/images/star.png", 3, 3, Color.YELLOW);
        this.boxCollider = new BoxCollider(3,3);
    }

    public void run() {
        super.run();
        this.position.addUp(this.velocity);
        this.boxCollider.position.set(this.position);
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