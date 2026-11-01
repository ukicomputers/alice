
import org.lgna.story.resources.prop.FirTreeTrunkResource;

class FirTreeTrunk extends Prop {

    /* Construct new FirTreeTrunk */
    public FirTreeTrunk(FirTreeTrunkResource resource) {
        super(resource);
    }

    public void setFirTreeTrunkResource(FirTreeTrunkResource firTreeTrunkResource) {
        this.setJointedModelResource(firTreeTrunkResource);
    }
}
