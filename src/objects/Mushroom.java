
import org.lgna.story.resources.prop.MushroomResource;

class Mushroom extends Prop {

    /* Construct new Mushroom */
    public Mushroom(MushroomResource resource) {
        super(resource);
    }

    public void setMushroomResource(MushroomResource mushroomResource) {
        this.setJointedModelResource(mushroomResource);
    }
}
