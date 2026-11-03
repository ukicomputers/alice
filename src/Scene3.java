import org.lgna.story.Key;
import org.lgna.story.SScene;
import org.lgna.story.Say;
import org.lgna.story.SetOpacity;
import org.lgna.story.TurnDirection;
import org.lgna.story.event.KeyEvent;
import org.lgna.story.event.SceneActivationEvent;

import static org.lgna.common.ThreadUtilities.doTogether;

class Scene3 extends SScene {
    private final Scene3Config config = new Scene3Config();
    Boolean gameStarted = false;
    Runnable restart;

    // Event listeners
    private void initializeEventListeners() {
        this.addSceneActivationListener((SceneActivationEvent event) -> {
            this.myFirstMethod();
        });

        this.addKeyPressListener((KeyEvent event) -> {
            if (gameStarted) {
                if (event.isKey(Key.UP)) {
                    this.config.teenPerson().walk(2.0, 0.5);
                } else {
                    if (event.isKey(Key.LEFT)) {
                        this.config.teenPerson().turn(TurnDirection.LEFT, 0.025);
                    } else {
                        if (event.isKey(Key.RIGHT)) {
                            this.config.teenPerson().turn(TurnDirection.RIGHT, 0.025);
                        } else {
                            if (event.isKey(Key.DOWN)) {
                                this.config.teenPerson().turn(TurnDirection.LEFT, 0.5);
                            }
                        }
                    }
                }
            }
        });
    }

    // Main scene code
    public void myFirstMethod() {
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
