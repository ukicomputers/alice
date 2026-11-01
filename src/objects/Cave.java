
import org.lgna.story.resources.prop.CaveResource;

class Cave extends Prop {

    /* Construct new Cave */
    public Cave(CaveResource resource) {
        super(resource);
    }

    public void setCaveResource(CaveResource caveResource) {
        this.setJointedModelResource(caveResource);
    }
}
