import java.util.ArrayList;
import java.util.List;

public class PlayerShoot {
    public List<BulletPlayer> bulletPlayers;
    public boolean shooting = false;
    private FrameCounter frameCounter;

    public PlayerShoot(){
        this.bulletPlayers = new ArrayList<>();
        this.frameCounter = new FrameCounter(10);
    }
    public void run(Player player) {
        if (this.shooting) {
            if (this.frameCounter.run()) {
                BulletPlayer bulletPlayer = new BulletPlayer();
                bulletPlayer.position.set(player.position);
                bulletPlayer.velocity.set(new Vector2D(7,0).rotate(player.playerMove.angle));
                this.bulletPlayers.add(bulletPlayer);
                this.frameCounter.reset();
            }
        } else {
            this.frameCounter.reset();
        }
    }
}
