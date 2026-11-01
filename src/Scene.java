import org.lgna.story.Key;
import org.lgna.story.SScene;
import org.lgna.story.Say;
import org.lgna.story.SetOpacity;
import org.lgna.story.TurnDirection;
import org.lgna.story.event.KeyEvent;
import org.lgna.story.event.SceneActivationEvent;

import static org.lgna.common.ThreadUtilities.doTogether;

class Scene extends SScene {
    // on finished runnable
    Runnable onFinished;

    // Scene objects
    private final SceneConfig config = new SceneConfig();

    // Event listeners
    private void initializeEventListeners() {
        this.addSceneActivationListener((SceneActivationEvent event) -> {
            this.myFirstMethod();
        });

        this.addKeyPressListener((KeyEvent event) -> {
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
        });
    }

    // Main scene code
    public void myFirstMethod() {
        // postavka za animacije
        final double stepDuration = 0.5;

        // grinc seta
        while (this.config.teenPerson().getDistanceTo(this.config.grinc()) > 4.0) {
            doTogether(
                () -> this.config.grinc().walk(1.0, stepDuration),
                () -> this.config.grinc().turn(TurnDirection.RIGHT, 0.25),
                () -> this.config.grinc().say("Treba mi pomoć, kad bi mi neko pomogao...", Say.duration(1.0))
            );
        }

        // pocinje razgovor
        doTogether(
            () -> this.config.grinc().turnToFace(this.config.teenPerson()),
            () -> this.config.teenPerson().turnToFace(this.config.grinc())
        );

        this.config.grinc().say(
            "Došlo je do nestašice kokakole! Treba neko ko će mi dostaviti ovu kokakolu Deda Mrazu!",
            Say.duration(4.0)
        );

        if (this.config.grinc().getBooleanFromUser("Da li ćeš mi pomoći?")) {
            this.config.teenPerson().say("Mogu ja. Daj mi kokakolu da je dostavim.", Say.duration(2.0));
        } else {
            this.config.teenPerson().say("Izvini ali ja ne mogu.", Say.duration(2.0));
            this.config.grinc().say("Moras kako bi spasao Božić!", Say.duration(2.0));
        }

        this.config.grinc().say("Evo izvoli", Say.duration(2.0));

        // uzima kokakolu
        doTogether(
            () -> this.config.grinc().turnToFace(this.config.colaBottle()),
            () -> this.config.teenPerson().turnToFace(this.config.colaBottle())
        );

        this.config.grinc().walkTo(this.config.colaBottle(), 2.0, stepDuration);

        doTogether(
            () -> this.config.colaBottle().moveTo(this.config.grinc().getRightHand()),
            () -> this.config.grinc().getRightWrist().turn(TurnDirection.LEFT, 0.25),
            () -> this.config.grinc().say("Abrakadabra!")
        );

        this.config.colaBottle().setVehicle(this.config.grinc().getRightHand());
        this.config.grinc().walkTo(this.config.teenPerson(), 2.0, stepDuration);

        this.config.grinc().say(
            "Večeras, moraš odneti kokakolu kod deda mraza kako bi on mogao da napravi ovaj srećan napitak za decu...",
            Say.duration(4.0)
        );

        this.config.grinc().say(
            "Put je jako strm, tako da ćeš morati da se paziš - sa strane je močvara, ako loše skreneš gotovo je",
            Say.duration(4.0)
        );

        // daje kokakolu
        this.config.grinc().say("Uzmi kokakolu i neka te sreća prati!");

        doTogether(
            () -> this.config.grinc().say("Abrakadabra!"),
            () -> this.config.grinc().setOpacity(0.0, SetOpacity.duration(4.0)),
            () -> this.config.teenPerson().getLeftWrist().turn(TurnDirection.RIGHT, 0.25),
            () -> this.config.colaBottle().moveTo(this.config.teenPerson().getLeftHand())
        );

        this.config.colaBottle().setVehicle(this.config.teenPerson().getLeftHand());

        // menja scenu
        this.config.teenPerson().say("Eh, šta ću ja sada...", Say.duration(2.0));
        onFinished.run();
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
