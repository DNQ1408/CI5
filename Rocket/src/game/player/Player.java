package game.player;

import base.GameObject;
import base.Vector2D;
import game.enemy.Enemy;
import game.enemy.bullet.BulletEnemy;
import particle.EffectSmoke;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import physic.RunHitObject;
import renderer.PolygonRenderer;

import java.awt.*;

public class Player extends GameObject implements PhysicBody, HitObject{
    public BoxCollider boxCollider;
    public PlayerMove playerMove;
    public PlayerShoot playerShoot;
    private RunHitObject runHitObject;
    public EffectSmoke effectSmoke;

    public Player() {
        this.position = new Vector2D();
        this.renderer = new PolygonRenderer(Color.RED,
                new Vector2D(),
                new Vector2D(0, 16),
                new Vector2D(20, 8)
        );
        this.playerMove = new PlayerMove();
        this.playerShoot = new PlayerShoot();
        this.boxCollider = new BoxCollider(20, 16);
        this.runHitObject = new RunHitObject(
                Enemy.class,
                BulletEnemy.class
        );
        this.effectSmoke = new EffectSmoke();
    }

    @Override
    public void run() {
        super.run();
        this.boxCollider.position.set(this.position);
        this.playerMove.run(this);
        ((PolygonRenderer)this.renderer).angle = this.playerMove.angle;
        this.playerShoot.run(this);
        this.runHitObject.run(this);
        this.effectSmoke.run(this);
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
