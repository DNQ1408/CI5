package game.enemy;

import base.GameObject;
import base.GameObjectManager;
import game.player.Player;
import physic.BoxCollider;
import renderer.ImageRenderer;


public class Enemy extends GameObject {
    public BoxCollider boxCollider;
    public EnemyShoot enemyShoot;
    public EnemyMove enemyMove;

    public Enemy() {
        this.enemyMove = new EnemyMove();
        this.renderer = new ImageRenderer("resources/images/circle.png", 10,10);
        this.enemyShoot = new EnemyShoot();
        this.boxCollider = new BoxCollider(10, 10);
    }

    @Override
    public void run() {
        super.run();
        this.boxCollider.position.set(this.position);
        this.enemyMove.run(this);
        this.enemyShoot.run(this);
        this.checkCollision();
    }

    public void checkCollision(){
        Player player = GameObjectManager.instance.checkCollisionPlayer(this.boxCollider);
        if (player != null) {
            player.getHit();
            this.getHit();
        }
    }

    public void getHit() {
        this.isAlive = false;
    }

}