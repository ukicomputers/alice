
import org.lgna.story.resources.prop.CircusTentResource;

class CircusTent extends Prop {

    /* Construct new CircusTent */
    public CircusTent(CircusTentResource resource) {
        super(resource);
    }

    public void setCircusTentResource(CircusTentResource circusTentResource) {
        this.setJointedModelResource(circusTentResource);
    }
}
