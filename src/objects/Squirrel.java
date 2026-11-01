
import org.lgna.story.*;
import org.lgna.story.resources.quadruped.SquirrelResource;

class Squirrel extends Quadruped {

    /* Construct new Squirrel */
    public Squirrel() {
        super(SquirrelResource.DEFAULT);
    }

    public SJoint getLeftEarMiddle() {
        return this.getJoint(SquirrelResource.LEFT_EAR_MIDDLE);
    }

    public SJoint getRightEarMiddle() {
        return this.getJoint(SquirrelResource.RIGHT_EAR_MIDDLE);
    }

    public void standingPose() {
        this.strikePose(SquirrelResource.STANDING_POSE);
    }

    public void eatingPose() {
        this.strikePose(SquirrelResource.EATING_POSE);
    }

    public void alertPose() {
        this.strikePose(SquirrelResource.ALERT_POSE);
    }

    public SJoint[] getLeftToeArray() {
        return this.getJointArray(SquirrelResource.LEFT_TOE_ARRAY);
    }

    public SJoint[] getRightToeArray() {
        return this.getJointArray(SquirrelResource.RIGHT_TOE_ARRAY);
    }

    public SJoint[] getRightEarArray() {
        return this.getJointArray(SquirrelResource.RIGHT_EAR_ARRAY);
    }

    public SJoint[] getLeftEarArray() {
        return this.getJointArray(SquirrelResource.LEFT_EAR_ARRAY);
    }
}
