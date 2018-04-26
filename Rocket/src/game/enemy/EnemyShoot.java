package game.enemy;

import base.FrameCounter;
import base.GameObjectManager;
import base.Vector2D;
import game.enemy.bullet.BulletEnemy;

public class EnemyShoot {
    private FrameCounter frameCounter;

    public EnemyShoot() {
        this.frameCounter = new FrameCounter(100);
    }

    public void run(Enemy enemy){
        if (this.frameCounter.run()) {
            for (int i = 0; i < 6; i++){
                BulletEnemy bulletEnemy  = new BulletEnemy();
                bulletEnemy.position.set(enemy.position);
                bulletEnemy.velocity.set(new Vector2D(7,0 ).rotate(i * 60));
                GameObjectManager.instance.add(bulletEnemy);
            }
            this.frameCounter.reset();
        }
    }
}