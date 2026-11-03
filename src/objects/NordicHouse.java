
import org.lgna.story.resources.prop.NordicHouseResource;

class NordicHouse extends Prop {

    /* Construct new NordicHouse */
    public NordicHouse(NordicHouseResource resource) {
        super(resource);
    }

    public void setNordicHouseResource(NordicHouseResource nordicHouseResource) {
        this.setJointedModelResource(nordicHouseResource);
    }
}
