
import org.lgna.story.*;
import org.lgna.story.resources.prop.ColaBottleResource;

class ColaBottle extends Prop {

    /* Construct new ColaBottle */
    public ColaBottle() {
        super(ColaBottleResource.DEFAULT);
    }

    public SJoint getCap() {
        return this.getJoint(ColaBottleResource.CAP);
    }
}
