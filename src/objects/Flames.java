
import org.lgna.story.*;
import org.lgna.story.resources.prop.FlamesResource;

class Flames extends Prop {

    /* Construct new Flames */
    public Flames() {
        super(FlamesResource.DEFAULT);
    }

    public SJoint getFlameBase() {
        return this.getJoint(FlamesResource.FLAME_BASE);
    }

    public SJoint[] getFlameFourArray() {
        return this.getJointArray(FlamesResource.FLAME_FOUR_ARRAY);
    }

    public SJoint[] getFlameNineArray() {
        return this.getJointArray(FlamesResource.FLAME_NINE_ARRAY);
    }

    public SJoint[] getFlameTenArray() {
        return this.getJointArray(FlamesResource.FLAME_TEN_ARRAY);
    }

    public SJoint[] getFlameElevenArray() {
        return this.getJointArray(FlamesResource.FLAME_ELEVEN_ARRAY);
    }

    public SJoint[] getFlameThreeArray() {
        return this.getJointArray(FlamesResource.FLAME_THREE_ARRAY);
    }

    public SJoint[] getFlameSevenArray() {
        return this.getJointArray(FlamesResource.FLAME_SEVEN_ARRAY);
    }

    public SJoint[] getFlameFiveArray() {
        return this.getJointArray(FlamesResource.FLAME_FIVE_ARRAY);
    }

    public SJoint[] getFlameTwoArray() {
        return this.getJointArray(FlamesResource.FLAME_TWO_ARRAY);
    }

    public SJoint[] getFlameOneArray() {
        return this.getJointArray(FlamesResource.FLAME_ONE_ARRAY);
    }

    public SJoint[] getFlameSixArray() {
        return this.getJointArray(FlamesResource.FLAME_SIX_ARRAY);
    }

    public SJoint[] getFlameEightArray() {
        return this.getJointArray(FlamesResource.FLAME_EIGHT_ARRAY);
    }
}
