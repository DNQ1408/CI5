package game.enemy.explosion;

import base.FrameCounter;
import base.GameObject;
import base.GameObjectManager;
import base.Vector2D;

public class EffectExplosion extends GameObject {
    private FrameCounter frameCounter;

    public EffectExplosion() {
        this.frameCounter = new FrameCounter(20);
    }

    @Override
    public void run() {
        super.run();
        Vector2D vector2D = new Vector2D(4, 0);
        for (int i = 0; i < 4; i++) {
            if(this.frameCounter.run()) {
                for (int j = 0; j < 9; j++) {
                    ExplosionEnemy explosionEnemy = GameObjectManager.instance.recycle(ExplosionEnemy.class);
                    explosionEnemy.position.set(this.position);
                    Vector2D rotate = vector2D.rotate(j * 40);
                    explosionEnemy.velocity.set(rotate);
                    this.frameCounter.reset();
                }
            }
        }
    }
}
