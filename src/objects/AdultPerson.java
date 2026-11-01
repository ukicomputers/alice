
import org.lgna.story.resources.sims2.AdultPersonResource;

class AdultPerson extends Person {

    /* Construct new AdultPerson */
    public AdultPerson(AdultPersonResource resource) {
        super(resource);
    }

    public void setAdultPersonResource(AdultPersonResource adultPersonResource) {
        this.setJointedModelResource(adultPersonResource);
    }
}
