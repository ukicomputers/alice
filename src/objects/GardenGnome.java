
import org.lgna.story.resources.prop.GardenGnomeResource;

class GardenGnome extends Prop {

    /* Construct new GardenGnome */
    public GardenGnome(GardenGnomeResource resource) {
        super(resource);
    }

    public void setGardenGnomeResource(GardenGnomeResource gardenGnomeResource) {
        this.setJointedModelResource(gardenGnomeResource);
    }
}
