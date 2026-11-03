
import org.lgna.story.resources.biped.YetiBabyResource;

class YetiBaby extends Biped {

    /* Construct new YetiBaby */
    public YetiBaby(YetiBabyResource resource) {
        super(resource);
    }

    public void setYetiBabyResource(YetiBabyResource yetiBabyResource) {
        this.setJointedModelResource(yetiBabyResource);
    }
}
