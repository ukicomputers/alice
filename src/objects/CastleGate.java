
import org.lgna.story.*;
import org.lgna.story.resources.prop.CastleGateResource;

class CastleGate extends Prop {

    /* Construct new CastleGate */
    public CastleGate() {
        super(CastleGateResource.DEFAULT);
    }

    public SJoint getLeftGate() {
        return this.getJoint(CastleGateResource.LEFT_GATE);
    }

    public SJoint getRightGate() {
        return this.getJoint(CastleGateResource.RIGHT_GATE);
    }
}
