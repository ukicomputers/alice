
import org.lgna.story.resources.prop.ConiferTreeResource;

class ConiferTree extends Prop {

    /* Construct new ConiferTree */
    public ConiferTree(ConiferTreeResource resource) {
        super(resource);
    }

    public void setConiferTreeResource(ConiferTreeResource coniferTreeResource) {
        this.setJointedModelResource(coniferTreeResource);
    }
}
