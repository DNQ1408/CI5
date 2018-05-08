package game.enemy;

import base.GameObject;
import game.enemy.explosion.EffectExplosion;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import renderer.ImageRenderer;

import java.awt.*;


public class Enemy extends GameObject implements PhysicBody, HitObject{
    public BoxCollider boxCollider;
    public EnemyShoot enemyShoot;
    public EnemyMove enemyMove;

    public Enemy() {
        this.enemyMove = new EnemyMove();
        this.renderer = new ImageRenderer("resources/images/circle.png", 15,15, Color.ORANGE);
        this.enemyShoot = new EnemyShoot();
        this.boxCollider = new BoxCollider(10, 10);
    }

    @Override
    public void run() {
        super.run();
        this.boxCollider.position.set(this.position);
        this.enemyMove.run(this);
        this.enemyShoot.run(this);
    }

    @Override
    public void getHit(GameObject gameObject) {
        this.isAlive = false;
        EffectExplosion effectExplosion = new EffectExplosion();
        effectExplosion.position = this.position;
        effectExplosion.run();
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}