
import org.lgna.story.*;
import org.lgna.story.resources.prop.ArmoireResource;

class Armoire extends Prop {

    /* Construct new Armoire */
    public Armoire(ArmoireResource resource) {
        super(resource);
    }

    public SJoint getRightDoor() {
        return this.getJoint(ArmoireResource.RIGHT_DOOR);
    }

    public SJoint getLeftDoor() {
        return this.getJoint(ArmoireResource.LEFT_DOOR);
    }

    public void setArmoireResource(ArmoireResource armoireResource) {
        this.setJointedModelResource(armoireResource);
    }
}
