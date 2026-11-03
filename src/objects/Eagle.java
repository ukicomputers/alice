
import org.lgna.story.*;
import org.lgna.story.resources.flyer.EagleResource;

class Eagle extends Flyer {

    /* Construct new Eagle */
    public Eagle() {
        super(EagleResource.DEFAULT);
    }

    public SJoint getLeftHindfoot() {
        return this.getJoint(EagleResource.LEFT_HINDFOOT);
    }

    public SJoint getLeftHindtoe() {
        return this.getJoint(EagleResource.LEFT_HINDTOE);
    }

    public SJoint getRightHindfoot() {
        return this.getJoint(EagleResource.RIGHT_HINDFOOT);
    }

    public SJoint getRightHindtoe() {
        return this.getJoint(EagleResource.RIGHT_HINDTOE);
    }

    public void flyingPose() {
        this.strikePose(EagleResource.FLYING_POSE);
    }
}
