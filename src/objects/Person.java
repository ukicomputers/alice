
import org.lgna.story.*;
import org.lgna.story.resources.sims2.PersonResource;

import static org.lgna.common.ThreadUtilities.doTogether;

class Person extends Biped {

    /* Construct new Person */
    public Person(PersonResource resource) {
        super(resource);
    }

    public void walk(Double stepSize, Double stepDuration) {
        doTogether(
            () -> this.playAudio(new AudioSource(Resources.korak)),
            () -> {
                doTogether(() -> {
                    this.getLeftShoulder().turn(TurnDirection.RIGHT, 0.125, Turn.duration(stepDuration));
                }, () -> {
                    this.getLeftHip().turn(TurnDirection.BACKWARD, 0.125, Turn.duration(stepDuration));
                }, () -> {
                    this.getLeftKnee().turn(TurnDirection.FORWARD, 0.125, Turn.duration(stepDuration));
                });

                doTogether(() -> {
                    this.getLeftShoulder().turn(TurnDirection.LEFT, 0.125, Turn.duration(stepDuration));
                }, () -> {
                    this.getLeftHip().turn(TurnDirection.FORWARD, 0.125, Turn.duration(stepDuration));
                }, () -> {
                    this.getLeftKnee().turn(TurnDirection.BACKWARD, 0.125, Turn.duration(stepDuration));
                }, () -> {
                    this.move(MoveDirection.FORWARD, stepSize / 2.0, Move.duration(stepDuration));
                });

                doTogether(() -> {
                    this.getRightShoulder().turn(TurnDirection.LEFT, 0.125, Turn.duration(stepDuration));
                }, () -> {
                    this.getRightHip().turn(TurnDirection.BACKWARD, 0.125, Turn.duration(stepDuration));
                }, () -> {
                    this.getRightKnee().turn(TurnDirection.FORWARD, 0.125, Turn.duration(stepDuration));
                });
                
                doTogether(() -> {
                    this.getRightShoulder().turn(TurnDirection.RIGHT, 0.125, Turn.duration(stepDuration));
                }, () -> {
                    this.getRightHip().turn(TurnDirection.FORWARD, 0.125, Turn.duration(stepDuration));
                }, () -> {
                    this.getRightKnee().turn(TurnDirection.BACKWARD, 0.125, Turn.duration(stepDuration));
                }, () -> {
                    this.move(MoveDirection.FORWARD, stepSize / 2.0, Move.duration(stepDuration));
                });
            }
        );
    }

    public void walkTo(SMovableTurnable object, Double stepSize, Double stepDuration) {
        while (this.getDistanceInFrontOf(object) > stepSize) {
            doTogether(() -> {
                this.walk(stepSize, stepDuration);
            }, () -> {
                this.turnToFace(object, TurnToFace.duration(stepDuration));
            });
        }
    }
}
