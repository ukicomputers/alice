
import org.lgna.story.*;
import org.lgna.story.resources.prop.RailroadTrackResource;

class RailroadTrack extends Prop {

    /* Construct new RailroadTrack */
    public RailroadTrack(RailroadTrackResource resource) {
        super(resource);
    }

    public SJoint getNextTrackMarker() {
        return this.getJoint(RailroadTrackResource.NEXT_TRACK_MARKER);
    }

    public SJoint[] getPathArray() {
        return this.getJointArray(RailroadTrackResource.PATH_ARRAY);
    }

    public void setRailroadTrackResource(RailroadTrackResource railroadTrackResource) {
        this.setJointedModelResource(railroadTrackResource);
    }
}
