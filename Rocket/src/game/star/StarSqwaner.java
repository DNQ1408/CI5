package game.star;

import action.*;
import base.FrameCounter;
import base.GameObject;
import base.GameObjectManager;

import java.util.Random;

public class StarSqwaner extends GameObject {

    private Random random = new Random();

    public void creatAction() {
        Action waitAction = new WaitAction(30);
        Action creatAction = new ActionAdapter() {
            @Override
            public boolean run(GameObject owner) {
                Star star = GameObjectManager.instance.recycle(Star.class);
                star.position.set(1024, random.nextInt(600));
                star.velocity.set(random.nextInt(2) + 1 , 0);
                return true;
            }
        };

        Action sequenceAction = new SequenceAction(
                waitAction,
                creatAction
        );

        Action repeatAction = new RepeatActionForever(sequenceAction);
        this.addAction(repeatAction);
    }


}
