
import org.lgna.story.resources.quadruped.BearResource;

class Bear extends Quadruped {

    /* Construct new Bear */
    public Bear(BearResource resource) {
        super(resource);
    }

    public void setBearResource(BearResource bearResource) {
        this.setJointedModelResource(bearResource);
    }
}
