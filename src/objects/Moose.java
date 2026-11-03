
import org.lgna.story.*;
import org.lgna.story.resources.quadruped.MooseResource;

class Moose extends Quadruped {

    /* Construct new Moose */
    public Moose() {
        super(MooseResource.DEFAULT);
    }

    public SJoint getRightHorn() {
        return this.getJoint(MooseResource.RIGHT_HORN);
    }

    public SJoint getRightHornTip() {
        return this.getJoint(MooseResource.RIGHT_HORN_TIP);
    }

    public SJoint getLeftHorn() {
        return this.getJoint(MooseResource.LEFT_HORN);
    }

    public SJoint getLeftHornTip() {
        return this.getJoint(MooseResource.LEFT_HORN_TIP);
    }

    @Override
    public SJoint getTail() {
        return this.getJoint(MooseResource.TAIL);
    }

    public SJoint getTailTip() {
        return this.getJoint(MooseResource.TAIL_TIP);
    }
}
