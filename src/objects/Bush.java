
import org.lgna.story.resources.prop.BushResource;

class Bush extends Prop {

    /* Construct new Bush */
    public Bush(BushResource resource) {
        super(resource);
    }

    public void setBushResource(BushResource bushResource) {
        this.setJointedModelResource(bushResource);
    }
}
