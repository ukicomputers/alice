import org.lgna.story.AddKeyPressListener;
import org.lgna.story.Key;
import org.lgna.story.Move;
import org.lgna.story.MoveDirection;
import org.lgna.story.MultipleEventPolicy;
import org.lgna.story.SScene;
import org.lgna.story.SThing;
import org.lgna.story.Say;
import org.lgna.story.Turn;
import org.lgna.story.TurnDirection;
import org.lgna.story.event.KeyEvent;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.event.StartCollisionEvent;

import static org.lgna.common.ThreadUtilities.doTogether;

class Scene2 extends SScene {
    private final Scene2Config config = new Scene2Config();

    boolean gameRunning = true;
    Runnable restart;

    private void initializeEventListeners() {
        this.addSceneActivationListener((SceneActivationEvent event) -> {
            this.myFirstMethod();
        });
    }

    private void initializeRuntimeListeners() {
        this.addKeyPressListener((KeyEvent event) -> {
            if (gameRunning) {
                if (event.isKey(Key.LEFT)) {
                    this.config.humvee().turn(TurnDirection.LEFT, 0.005, Turn.duration(0.1));
                }
                if (event.isKey(Key.RIGHT)) {
                    this.config.humvee().turn(TurnDirection.RIGHT, 0.005, Turn.duration(0.1));
                }
                if (event.isKey(Key.UP)) {
                    this.config.humvee().move(MoveDirection.FORWARD, 3.0, Move.duration(1.0));
                }
                if (event.isKey(Key.DOWN)) {
                    this.config.humvee().move(MoveDirection.BACKWARD, 1.0, Move.duration(1.0));
                }

                if (event.isKey(Key.C)) {
                    // cheat code
                    gameRunning = false;
                    this.config.humvee().say("Cheat activated", Say.duration(1.0));
                    this.config.humvee().moveTo(this.config.kapija());
                }
            }
        }, AddKeyPressListener.multipleEventPolicy(MultipleEventPolicy.COMBINE));

        this.addCollisionStartListener((StartCollisionEvent event) -> {
            if (gameRunning) {
                gameRunning = false;
                doTogether(
                    () -> this.config.humvee().say("O, ne, toonemmm...", Say.duration(4)),
                    () -> this.config.humvee().move(MoveDirection.DOWN, 2.0, Move.duration(4.0))
                );

                // restart scene
                restart.run();
            }
        }, new SThing[]{this.config.humvee()}, this.config.boxes());

        this.addCollisionStartListener((StartCollisionEvent event) -> {
            gameRunning = false;
            this.config.castleGate().say("You shall not pass!", Say.duration(3.0));

            doTogether(
                () -> this.config.humvee().say("Abrakadabra!", Say.duration(4.0)),
                () -> this.config.castleGate().getLeftGate().turn(TurnDirection.LEFT, 0.5, Turn.duration(4.0)),
                () -> this.config.castleGate().getRightGate().turn(TurnDirection.RIGHT, 0.5, Turn.duration(4.0))
            );

            // nova scena
        }, new SThing[]{this.config.humvee()}, new SThing[]{this.config.kapija()});
    }

    public void myFirstMethod() {
        this.config.humvee().say("Trebam poći na put.", Say.duration(2.0));
        this.config.humvee().say("Ukoliko skrenem izvan puta, umreću.", Say.duration(2.0));
        this.config.humvee().say("Moram ići hrabro i jako samo unapred!", Say.duration(2.0));
        initializeRuntimeListeners();
    }

    @Override
    public void handleActiveChanged(Boolean isActive, Integer activationCount) {
        if (!isActive) {
            preserveStateAndEventListeners();
            return;
        }

        if (activationCount != 1) {
            restoreStateAndEventListeners();
            return;
        }

        this.config.performGeneratedSetUp(this);
        initializeEventListeners();
    }
}
