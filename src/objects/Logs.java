
import org.lgna.story.resources.prop.LogsResource;

class Logs extends Prop {

    /* Construct new Logs */
    public Logs(LogsResource resource) {
        super(resource);
    }

    public void setLogsResource(LogsResource logsResource) {
        this.setJointedModelResource(logsResource);
    }
}
