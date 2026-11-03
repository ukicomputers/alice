
import org.lgna.story.resources.quadruped.BillyGoatResource;

class BillyGoat extends Quadruped {

    /* Construct new BillyGoat */
    public BillyGoat(BillyGoatResource resource) {
        super(resource);
    }

    public void setBillyGoatResource(BillyGoatResource billyGoatResource) {
        this.setJointedModelResource(billyGoatResource);
    }
}
