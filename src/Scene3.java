import org.lgna.story.Key;
import org.lgna.story.MoveDirection;
import org.lgna.story.Place;
import org.lgna.story.SScene;
import org.lgna.story.Say;
import org.lgna.story.TextStyle;
import org.lgna.story.Color;
import org.lgna.story.Move;
import org.lgna.story.SetOpacity;
import org.lgna.story.SpatialRelation;
import org.lgna.story.AudioSource;
import org.lgna.story.SThing;
import org.lgna.story.TurnDirection;
import org.lgna.story.event.KeyEvent;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.event.EnterProximityEvent;

import org.lgna.common.RandomUtilities;
import static org.lgna.common.ThreadUtilities.doTogether;

class Scene3 extends SScene {
    private final Scene3Config config = new Scene3Config();
    boolean gameStarted = false;
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

        this.addProximityEnterListener((EnterProximityEvent event) -> {
            gameStarted = false;
            this.config.teenPerson().turnToFace(this.config.santa());

            this.config.teenPerson().say("Zdravo Deda Mraze!", Say.duration(2.5));
            this.config.santa().say("Zdravo dečače! Šta te vodi danas ovde?", Say.duration(4.0));
            this.config.teenPerson().say("Grinč me je poslao! Rekao je da ti treba kokakola, ali ostala mi je u autu!", Say.duration(7.0));
            this.config.teenPerson().say("Ne zaboravi, trebaš da spaseš Božić!", Say.duration(4.0));
            this.config.santa().say("Hohoho! Hvala ti puno dečače! Neka te sreća prati!", Say.duration(5.0));

            doTogether(
                () -> this.config.santa().say("Sad mogu deci širom sveta da poboljšam božić ovim čarobnim gaziranim pićem! Kao nagrada - evo malo muzike!", Say.duration(12.0), Say.textStyle(TextStyle.ITALIC), Say.fontColor(Color.WHITE), Say.bubbleFillColor(Color.RED)),
                () -> this.playAudio(new AudioSource(Resources.zvono))
            );
        }, new SThing[]{this.config.teenPerson()}, new SThing[]{this.config.santa()}, 4.0);
    }

    // Main scene code
    public void myFirstMethod() {
        doTogether(
            () -> this.config.teenPerson().move(MoveDirection.LEFT, 3.0, Move.duration(2.0)),
            () -> this.config.teenPerson().setOpacity(1.0, SetOpacity.duration(2.0))
        );

        this.config.gardenGnome().setOpacity(1.0, SetOpacity.duration(2.0));
        this.config.gardenGnome().say("Ho, ho, ho! Ko se usuđuje da dođe kod Deda Mraza!", Say.duration(5.0));
        this.config.teenPerson().say("Trebam mu doneti kokakolu kako bi je dostavio deci za Božić!", Say.duration(6.0));
        this.config.gardenGnome().say("NE VERUJEM!", Say.duration(2.0));
        this.config.gardenGnome().say("Možeš proći samo ako rešiš jednačinu tačno!", Say.duration(5.0));

        // nasumicna jednacina (2x + n = 0)
        final Integer broj = RandomUtilities.nextIntegerFromAToBInclusive(2, 9);
        final double resenje = -broj / 2.0;
        this.config.gardenGnome().say("Koliko je 2x + " + broj + " = 0?", Say.duration(3.0));

        if (this.config.gardenGnome().getDoubleFromUser("Rešenje?") == resenje) {
            this.config.gardenGnome().say("Tačno!", Say.duration(2.0));
            this.config.gardenGnome().say("Sad znam da si pravi!", Say.duration(3.0));
            this.config.gardenGnome().say("Možeš proći!", Say.duration(2.5));
            this.config.gardenGnome().move(MoveDirection.DOWN, 5.0, Move.duration(2.0));
        } else {
            this.config.gardenGnome().say("HAHAHAHA! GOTOV SI", Say.duration(2.5));
            this.config.eagle().place(SpatialRelation.ABOVE, this.config.teenPerson(), Place.duration(3.0));
            this.config.teenPerson().setVehicle(this.config.eagle());
            this.config.eagle().move(MoveDirection.UP, 5.0, Move.duration(1.0));
            this.config.gardenGnome().say("Nemoj se zameravati sa patuljkom!", Say.duration(4.0));
            restart.run();
        }

        // pocinje scena
        gameStarted = true;
        this.config.camera().setVehicle(this.config.teenPerson());
        this.config.bear().say("Samo napred čoveče!", Say.duration(3.0));
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
