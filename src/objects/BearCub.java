
import org.lgna.story.resources.quadruped.BearCubResource;

class BearCub extends Quadruped {

    /* Construct new BearCub */
    public BearCub(BearCubResource resource) {
        super(resource);
    }

    public void setBearCubResource(BearCubResource bearCubResource) {
        this.setJointedModelResource(bearCubResource);
    }
}
