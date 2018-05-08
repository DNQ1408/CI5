package game.player;

import base.FrameCounter;
import base.GameObjectManager;
import base.Vector2D;
import game.player.bullet.BulletPlayer;

import java.util.ArrayList;
import java.util.List;

public class PlayerShoot {
    public boolean shooting = false;
    private FrameCounter frameCounter;

    public PlayerShoot(){
        this.frameCounter = new FrameCounter(10);
    }
    public void run(Player player) {
        if (this.shooting) {
            if (this.frameCounter.run()) {
                BulletPlayer bulletPlayer = GameObjectManager.instance.recycle(BulletPlayer.class);
                bulletPlayer.position.set(player.position);
                bulletPlayer.velocity.set(new Vector2D(7,0).rotate(player.playerMove.angle));
                this.frameCounter.reset();
            }
        } else {
            this.frameCounter.reset();
        }
    }
}
