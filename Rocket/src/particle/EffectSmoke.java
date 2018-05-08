package particle;

import base.FrameCounter;
import base.GameObjectManager;
import base.Vector2D;
import game.player.Player;

public class EffectSmoke {
    private FrameCounter frameCounter;


    public EffectSmoke() {
        this.frameCounter = new FrameCounter(20);

    }

    public void run(Player player) {
        if (this.frameCounter == null) {
            this.frameCounter = new FrameCounter(20);
        }

        if (this.frameCounter.run()) {
            Particle particle = GameObjectManager.instance.recycle(Particle.class);
            particle.position.set(player.position);
            Vector2D rotate = new Vector2D(-2.5f, 0).rotate(player.playerMove.angle);
            particle.velocity.set(rotate);
            this.frameCounter.reset();
        }
    }
}
