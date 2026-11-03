import org.lgna.story.Color;
import org.lgna.story.Orientation;
import org.lgna.story.Position;
import org.lgna.story.SCamera;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.SGround;
import org.lgna.story.Size;
import org.lgna.story.resources.prop.BoulderResource;
import org.lgna.story.resources.prop.BushResource;
import org.lgna.story.resources.prop.CaveResource;
import org.lgna.story.resources.prop.ConiferTreeResource;
import org.lgna.story.resources.prop.RailroadTrackResource;

class Scene2Config {
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final RailroadTrack railroadTrack = new RailroadTrack(RailroadTrackResource.STRAIGHT_TRESTLE);
    private final RailroadTrack railroadTrack2 = new RailroadTrack(RailroadTrackResource.STRAIGHT_TRESTLE);
    private final RailroadTrack railroadTrack3 = new RailroadTrack(RailroadTrackResource.STRAIGHT_TRESTLE);
    private final RailroadTrack railroadTrack4 = new RailroadTrack(RailroadTrackResource.RIGHT_CURVE_TRESTLE);
    private final RailroadTrack railroadTrack5 = new RailroadTrack(RailroadTrackResource.STRAIGHT_TRESTLE);
    private final RailroadTrack railroadTrack6 = new RailroadTrack(RailroadTrackResource.RIGHT_CURVE_TRESTLE);
    private final RailroadTrack railroadTrack7 = new RailroadTrack(RailroadTrackResource.STRAIGHT_TRESTLE);
    private final RailroadTrack railroadTrack8 = new RailroadTrack(RailroadTrackResource.STRAIGHT_TRESTLE);
    private final RailroadTrack railroadTrack9 = new RailroadTrack(RailroadTrackResource.STRAIGHT_TRESTLE);
    private final RailroadTrack railroadTrack10 = new RailroadTrack(RailroadTrackResource.STRAIGHT_TRESTLE);
    private final AcaciaTree acaciaTree = new AcaciaTree();
    private final AcaciaTree acaciaTree2 = new AcaciaTree();
    private final Boulder boulder = new Boulder(BoulderResource.BOULDER1_GRAY);
    private final Boulder boulder2 = new Boulder(BoulderResource.BOULDER1_GRAY);
    private final Bush bush = new Bush(BushResource.TALL);
    private final Boulder boulder3 = new Boulder(BoulderResource.BOULDER2_BROWN);
    private final Boulder boulder4 = new Boulder(BoulderResource.BOULDER1_GRAY);
    private final CenturyPlant centuryPlant = new CenturyPlant();
    private final Cave cave = new Cave(CaveResource.DEFAULT_MOSSY);
    private final Cave cave2 = new Cave(CaveResource.FLIPPED_ROCKY);
    private final ConiferTree coniferTree = new ConiferTree(ConiferTreeResource.TALL);
    private final ThistlePatch thistlePatch = new ThistlePatch();
    private final ZumaRock zumaRock = new ZumaRock();
    private final CastleGate castleGate = new CastleGate();
    private final Humvee humvee = new Humvee();
    private final Box[] boxes = createBoxes(80);
    private final Box kapija = new Box();

    private static Box[] createBoxes(int count) {
        Box[] boxes = new Box[count];
        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = new Box();
        }
        return boxes;
    }

    SGround ground() {
        return ground;
    }

    SCamera camera() {
        return camera;
    }

    RailroadTrack railroadTrack() {
        return railroadTrack;
    }

    RailroadTrack railroadTrack2() {
        return railroadTrack2;
    }

    RailroadTrack railroadTrack3() {
        return railroadTrack3;
    }

    RailroadTrack railroadTrack4() {
        return railroadTrack4;
    }

    RailroadTrack railroadTrack5() {
        return railroadTrack5;
    }

    RailroadTrack railroadTrack6() {
        return railroadTrack6;
    }

    RailroadTrack railroadTrack7() {
        return railroadTrack7;
    }

    RailroadTrack railroadTrack8() {
        return railroadTrack8;
    }

    RailroadTrack railroadTrack9() {
        return railroadTrack9;
    }

    RailroadTrack railroadTrack10() {
        return railroadTrack10;
    }

    AcaciaTree acaciaTree() {
        return acaciaTree;
    }

    AcaciaTree acaciaTree2() {
        return acaciaTree2;
    }

    Boulder boulder() {
        return boulder;
    }

    Boulder boulder2() {
        return boulder2;
    }

    Bush bush() {
        return bush;
    }

    Boulder boulder3() {
        return boulder3;
    }

    Boulder boulder4() {
        return boulder4;
    }

    CenturyPlant centuryPlant() {
        return centuryPlant;
    }

    Cave cave() {
        return cave;
    }

    Cave cave2() {
        return cave2;
    }

    ConiferTree coniferTree() {
        return coniferTree;
    }

    ThistlePatch thistlePatch() {
        return thistlePatch;
    }

    ZumaRock zumaRock() {
        return zumaRock;
    }

    CastleGate castleGate() {
        return castleGate;
    }

    Humvee humvee() {
        return humvee;
    }

    Box[] boxes() {
        return boxes;
    }

    Box kapija() {
        return kapija;
    }

    void performGeneratedSetUp(Scene2 scene) {
        scene.setAtmosphereColor(new Color(0.827, 0.827, 0.827));
        scene.setFromAboveLightColor(Color.WHITE);
        scene.setFromBelowLightColor(new Color(0.0, 1.0, 0.741));
        scene.setFogDensity(0.27);
        scene.setName("myScene");
        this.ground.setPaint(SurfaceAppearance.SWAMP);
        this.ground.setOpacity(0.7);
        this.ground.setName("ground");
        this.ground.setVehicle(scene);
        this.camera.setName("camera");
        this.camera.setVehicle(this.humvee);
        this.camera.setOrientationRelativeToVehicle(new Orientation(-0.098017, 0.0, 0.0, 0.995185));
        this.camera.setPositionRelativeToVehicle(new Position(-0.451, 7.779, 21.147));
        this.railroadTrack.setPaint(Color.WHITE);
        this.railroadTrack.setOpacity(1.0);
        this.railroadTrack.setName("railroadTrack");
        this.railroadTrack.setVehicle(scene);
        this.railroadTrack.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.railroadTrack.setPositionRelativeToVehicle(new Position(0.0, 0.0, 0.0));
        this.railroadTrack2.setPaint(Color.WHITE);
        this.railroadTrack2.setOpacity(1.0);
        this.railroadTrack2.setName("railroadTrack2");
        this.railroadTrack2.setVehicle(scene);
        this.railroadTrack2.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.railroadTrack2.setPositionRelativeToVehicle(new Position(9.931, 0.0, 1.174));
        this.railroadTrack3.setPaint(Color.WHITE);
        this.railroadTrack3.setOpacity(1.0);
        this.railroadTrack3.setName("railroadTrack3");
        this.railroadTrack3.setVehicle(scene);
        this.railroadTrack3.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.railroadTrack3.setPositionRelativeToVehicle(new Position(19.862, 0.0, 2.349));
        this.railroadTrack4.setPaint(Color.WHITE);
        this.railroadTrack4.setOpacity(1.0);
        this.railroadTrack4.setName("railroadTrack4");
        this.railroadTrack4.setVehicle(scene);
        this.railroadTrack4.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.railroadTrack4.setPositionRelativeToVehicle(new Position(29.792, 0.0, 3.523));
        this.railroadTrack5.setPaint(Color.WHITE);
        this.railroadTrack5.setOpacity(1.0);
        this.railroadTrack5.setName("railroadTrack5");
        this.railroadTrack5.setVehicle(scene);
        this.railroadTrack5.setOrientationRelativeToVehicle(new Orientation(0.0, 0.998268, 0.0, 0.05883));
        this.railroadTrack5.setPositionRelativeToVehicle(new Position(46.564, 0.0, 24.794));
        this.railroadTrack6.setPaint(Color.WHITE);
        this.railroadTrack6.setOpacity(1.0);
        this.railroadTrack6.setName("railroadTrack6");
        this.railroadTrack6.setVehicle(scene);
        this.railroadTrack6.setOrientationRelativeToVehicle(new Orientation(1.91E-4, 0.664759, 2.15E-4, 0.747058));
        this.railroadTrack6.setPositionRelativeToVehicle(new Position(62.206, 0.0, 55.884));
        this.railroadTrack7.setPaint(Color.WHITE);
        this.railroadTrack7.setOpacity(1.0);
        this.railroadTrack7.setName("railroadTrack7");
        this.railroadTrack7.setVehicle(scene);
        this.railroadTrack7.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.railroadTrack7.setPositionRelativeToVehicle(new Position(62.206, 0.0, 55.884));
        this.railroadTrack8.setPaint(Color.WHITE);
        this.railroadTrack8.setOpacity(1.0);
        this.railroadTrack8.setName("railroadTrack8");
        this.railroadTrack8.setVehicle(scene);
        this.railroadTrack8.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.railroadTrack8.setPositionRelativeToVehicle(new Position(72.137, 0.0, 57.059));
        this.railroadTrack9.setPaint(Color.WHITE);
        this.railroadTrack9.setOpacity(1.0);
        this.railroadTrack9.setName("railroadTrack9");
        this.railroadTrack9.setVehicle(scene);
        this.railroadTrack9.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.railroadTrack9.setPositionRelativeToVehicle(new Position(82.067, 0.0, 58.233));
        this.railroadTrack10.setPaint(Color.WHITE);
        this.railroadTrack10.setOpacity(1.0);
        this.railroadTrack10.setName("railroadTrack10");
        this.railroadTrack10.setVehicle(scene);
        this.railroadTrack10.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.railroadTrack10.setPositionRelativeToVehicle(new Position(91.998, 0.0, 59.408));
        this.acaciaTree.setPaint(Color.WHITE);
        this.acaciaTree.setOpacity(1.0);
        this.acaciaTree.setName("acaciaTree");
        this.acaciaTree.setVehicle(scene);
        this.acaciaTree.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.acaciaTree.setPositionRelativeToVehicle(new Position(21.752, 0.0, -7.62));
        this.acaciaTree2.setPaint(Color.WHITE);
        this.acaciaTree2.setOpacity(1.0);
        this.acaciaTree2.setName("acaciaTree2");
        this.acaciaTree2.setVehicle(scene);
        this.acaciaTree2.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.acaciaTree2.setPositionRelativeToVehicle(new Position(35.006, 0.0, 29.301));
        this.boulder.setPaint(Color.WHITE);
        this.boulder.setOpacity(1.0);
        this.boulder.setName("boulder");
        this.boulder.setVehicle(scene);
        this.boulder.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.boulder.setPositionRelativeToVehicle(new Position(30.062, 0.0, -2.15));
        this.boulder2.setPaint(Color.WHITE);
        this.boulder2.setOpacity(1.0);
        this.boulder2.setName("boulder2");
        this.boulder2.setVehicle(scene);
        this.boulder2.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.boulder2.setPositionRelativeToVehicle(new Position(16.252, 0.0, 6.049));
        this.bush.setPaint(Color.WHITE);
        this.bush.setOpacity(1.0);
        this.bush.setName("bush");
        this.bush.setVehicle(scene);
        this.bush.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.bush.setPositionRelativeToVehicle(new Position(33.428, 0.0, 8.789));
        this.boulder3.setPaint(Color.WHITE);
        this.boulder3.setOpacity(1.0);
        this.boulder3.setName("boulder3");
        this.boulder3.setVehicle(scene);
        this.boulder3.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.boulder3.setPositionRelativeToVehicle(new Position(51.572, 0.0, 41.004));
        this.boulder4.setPaint(Color.WHITE);
        this.boulder4.setOpacity(1.0);
        this.boulder4.setName("boulder4");
        this.boulder4.setVehicle(scene);
        this.boulder4.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.boulder4.setPositionRelativeToVehicle(new Position(52.94, 0.0, 22.386));
        this.centuryPlant.setPaint(Color.WHITE);
        this.centuryPlant.setOpacity(1.0);
        this.centuryPlant.setName("centuryPlant");
        this.centuryPlant.setVehicle(scene);
        this.centuryPlant.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.centuryPlant.setPositionRelativeToVehicle(new Position(26.783, 0.0, 8.179));
        this.cave.setPaint(Color.WHITE);
        this.cave.setOpacity(1.0);
        this.cave.setName("cave");
        this.cave.setVehicle(scene);
        this.cave.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.cave.setPositionRelativeToVehicle(new Position(44.253, 0.0, 57.308));
        this.cave2.setPaint(Color.WHITE);
        this.cave2.setOpacity(1.0);
        this.cave2.setName("cave2");
        this.cave2.setVehicle(scene);
        this.cave2.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.cave2.setPositionRelativeToVehicle(new Position(81.09, 0.0, 49.878));
        this.coniferTree.setPaint(Color.WHITE);
        this.coniferTree.setOpacity(1.0);
        this.coniferTree.setName("coniferTree");
        this.coniferTree.setVehicle(scene);
        this.coniferTree.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.coniferTree.setPositionRelativeToVehicle(new Position(62.277, 0.0, 46.426));
        this.thistlePatch.setPaint(Color.WHITE);
        this.thistlePatch.setOpacity(1.0);
        this.thistlePatch.setName("thistlePatch");
        this.thistlePatch.setVehicle(scene);
        this.thistlePatch.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.thistlePatch.setPositionRelativeToVehicle(new Position(94.991, 0.0, 63.782));
        this.zumaRock.setPaint(Color.WHITE);
        this.zumaRock.setOpacity(1.0);
        this.zumaRock.setName("zumaRock");
        this.zumaRock.setVehicle(scene);
        this.zumaRock.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.zumaRock.setPositionRelativeToVehicle(new Position(79.738, 0.0, 63.467));
        this.castleGate.setPaint(Color.WHITE);
        this.castleGate.setOpacity(1.0);
        this.castleGate.setName("castleGate");
        this.castleGate.setVehicle(scene);
        this.castleGate.setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.castleGate.setPositionRelativeToVehicle(new Position(101.929, 0.0, 60.582));
        this.humvee.setPaint(Color.WHITE);
        this.humvee.setOpacity(1.0);
        this.humvee.setName("humvee");
        this.humvee.setVehicle(scene);
        this.humvee.setOrientationRelativeToVehicle(new Orientation(0.0, -0.746367, 0.0, 0.665535));
        this.humvee.setPositionRelativeToVehicle(new Position(9.931, 0.0, 1.174));
        this.boxes[0].setPaint(Color.WHITE);
        this.boxes[0].setOpacity(0.0);
        this.boxes[0].setName("barijera1");
        this.boxes[0].setVehicle(scene);
        this.boxes[0].setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.boxes[0].setPositionRelativeToVehicle(new Position(15.237, 0.0, -0.673));
        this.boxes[0].setSize(new Size(1.0, 2.0, 30.09));
        this.boxes[1].setPaint(Color.WHITE);
        this.boxes[1].setOpacity(0.0);
        this.boxes[1].setName("barijera2");
        this.boxes[1].setVehicle(scene);
        this.boxes[1].setOrientationRelativeToVehicle(new Orientation(0.0, -0.747479, 0.0, 0.664285));
        this.boxes[1].setPositionRelativeToVehicle(new Position(14.644, 0.0, 4.278));
        this.boxes[1].setSize(new Size(1.0, 2.0, 30.09));
        this.boxes[2].setPaint(Color.WHITE);
        this.boxes[2].setOpacity(0.0);
        this.boxes[2].setName("barijera4");
        this.boxes[2].setVehicle(scene);
        this.boxes[2].setOrientationRelativeToVehicle(new Orientation(0.0, 0.665535, 0.0, 0.746367));
        this.boxes[2].setPositionRelativeToVehicle(new Position(48.436, 0.0, 30.006));
        this.boxes[2].setSize(new Size(10.03, 2.0, 1.0));
        this.boxes[3].setPaint(Color.WHITE);
        this.boxes[3].setOpacity(0.0);
        this.boxes[3].setName("barijera5");
        this.boxes[3].setVehicle(scene);
        this.boxes[3].setOrientationRelativeToVehicle(new Orientation(0.0, 0.665535, 0.0, 0.746367));
        this.boxes[3].setPositionRelativeToVehicle(new Position(43.233, 0.0, 29.463));
        this.boxes[3].setSize(new Size(10.03, 2.0, 1.0));
        this.boxes[4].setPaint(Color.WHITE);
        this.boxes[4].setOpacity(0.0);
        this.boxes[4].setName("barijera8");
        this.boxes[4].setVehicle(scene);
        this.boxes[4].setOrientationRelativeToVehicle(new Orientation(0.0, 0.99836, 0.0, 0.057248));
        this.boxes[4].setPositionRelativeToVehicle(new Position(82.061, 0.0, 55.532));
        this.boxes[4].setSize(new Size(40.12, 2.0, 1.0));
        this.boxes[5].setPaint(Color.WHITE);
        this.boxes[5].setOpacity(0.0);
        this.boxes[5].setName("barijera9");
        this.boxes[5].setVehicle(scene);
        this.boxes[5].setOrientationRelativeToVehicle(new Orientation(0.0, 0.998365, 0.0, 0.057161));
        this.boxes[5].setPositionRelativeToVehicle(new Position(81.27, 0.0, 60.675));
        this.boxes[5].setSize(new Size(40.12, 2.0, 1.0));
        this.kapija.setPaint(Color.WHITE);
        this.kapija.setOpacity(0.0);
        this.kapija.setName("kapija");
        this.kapija.setVehicle(scene);
        this.kapija.setOrientationRelativeToVehicle(new Orientation(0.0, 0.665535, 0.0, 0.746367));
        this.kapija.setPositionRelativeToVehicle(new Position(98.175, 0.0, 60.03));
        this.kapija.setSize(new Size(4.0, 1.0, 1.0));
        this.boxes[6].setPaint(Color.WHITE);
        this.boxes[6].setOpacity(0.0);
        this.boxes[6].setName("box2");
        this.boxes[6].setVehicle(scene);
        this.boxes[6].setOrientationRelativeToVehicle(new Orientation(0.0, -0.062524, 0.0, 0.998043));
        this.boxes[6].setPositionRelativeToVehicle(new Position(31.468, 0.0, 1.201));
        this.boxes[6].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[7].setPaint(Color.WHITE);
        this.boxes[7].setOpacity(0.0);
        this.boxes[7].setName("box3");
        this.boxes[7].setVehicle(scene);
        this.boxes[7].setOrientationRelativeToVehicle(new Orientation(0.0, -0.044864, 0.0, 0.998993));
        this.boxes[7].setPositionRelativeToVehicle(new Position(33.081, 0.0, 1.442));
        this.boxes[7].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[8].setPaint(Color.WHITE);
        this.boxes[8].setOpacity(0.0);
        this.boxes[8].setName("box4");
        this.boxes[8].setVehicle(scene);
        this.boxes[8].setOrientationRelativeToVehicle(new Orientation(0.0, 0.995201, 0.0, 0.097848));
        this.boxes[8].setPositionRelativeToVehicle(new Position(34.55, 0.0, 1.814));
        this.boxes[8].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[9].setPaint(Color.WHITE);
        this.boxes[9].setOpacity(0.0);
        this.boxes[9].setName("box5");
        this.boxes[9].setVehicle(scene);
        this.boxes[9].setOrientationRelativeToVehicle(new Orientation(0.0, -0.115467, 0.0, 0.993311));
        this.boxes[9].setPositionRelativeToVehicle(new Position(36.018, 0.0, 2.267));
        this.boxes[9].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[10].setPaint(Color.WHITE);
        this.boxes[10].setOpacity(0.0);
        this.boxes[10].setName("box6");
        this.boxes[10].setVehicle(scene);
        this.boxes[10].setOrientationRelativeToVehicle(new Orientation(0.0, -0.224112, 0.0, 0.974563));
        this.boxes[10].setPositionRelativeToVehicle(new Position(37.37, 0.0, 2.794));
        this.boxes[10].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[11].setPaint(Color.WHITE);
        this.boxes[11].setOpacity(0.0);
        this.boxes[11].setName("box7");
        this.boxes[11].setVehicle(scene);
        this.boxes[11].setOrientationRelativeToVehicle(new Orientation(0.0, -0.229101, 0.0, 0.973403));
        this.boxes[11].setPositionRelativeToVehicle(new Position(38.701, 0.0, 3.365));
        this.boxes[11].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[12].setPaint(Color.WHITE);
        this.boxes[12].setOpacity(0.0);
        this.boxes[12].setName("box8");
        this.boxes[12].setVehicle(scene);
        this.boxes[12].setOrientationRelativeToVehicle(new Orientation(0.0, -0.273179, 0.0, 0.961963));
        this.boxes[12].setPositionRelativeToVehicle(new Position(39.926, 0.0, 4.147));
        this.boxes[12].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[13].setPaint(Color.WHITE);
        this.boxes[13].setOpacity(0.0);
        this.boxes[13].setName("box9");
        this.boxes[13].setVehicle(scene);
        this.boxes[13].setOrientationRelativeToVehicle(new Orientation(0.0, -0.282722, 0.0, 0.959202));
        this.boxes[13].setPositionRelativeToVehicle(new Position(41.089, 0.0, 5.034));
        this.boxes[13].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[14].setPaint(Color.WHITE);
        this.boxes[14].setOpacity(0.0);
        this.boxes[14].setName("box10");
        this.boxes[14].setVehicle(scene);
        this.boxes[14].setOrientationRelativeToVehicle(new Orientation(0.0, -0.334615, 0.0, 0.942355));
        this.boxes[14].setPositionRelativeToVehicle(new Position(42.187, 0.0, 5.922));
        this.boxes[14].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[15].setPaint(Color.WHITE);
        this.boxes[15].setOpacity(0.0);
        this.boxes[15].setName("box11");
        this.boxes[15].setVehicle(scene);
        this.boxes[15].setOrientationRelativeToVehicle(new Orientation(0.0, -0.438356, 0.0, 0.898801));
        this.boxes[15].setPositionRelativeToVehicle(new Position(43.307, 0.0, 6.872));
        this.boxes[15].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[16].setPaint(Color.WHITE);
        this.boxes[16].setOpacity(0.0);
        this.boxes[16].setName("box12");
        this.boxes[16].setVehicle(scene);
        this.boxes[16].setOrientationRelativeToVehicle(new Orientation(0.0, -0.481951, 0.0, 0.876198));
        this.boxes[16].setPositionRelativeToVehicle(new Position(44.215, 0.0, 8.267));
        this.boxes[16].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[17].setPaint(Color.WHITE);
        this.boxes[17].setOpacity(0.0);
        this.boxes[17].setName("box13");
        this.boxes[17].setVehicle(scene);
        this.boxes[17].setOrientationRelativeToVehicle(new Orientation(0.0, 0.258317, 0.0, 0.96606));
        this.boxes[17].setPositionRelativeToVehicle(new Position(45.208, 0.0, 9.618));
        this.boxes[17].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[18].setPaint(Color.WHITE);
        this.boxes[18].setOpacity(0.0);
        this.boxes[18].setName("box14");
        this.boxes[18].setVehicle(scene);
        this.boxes[18].setOrientationRelativeToVehicle(new Orientation(0.0, 0.194882, 0.0, 0.980827));
        this.boxes[18].setPositionRelativeToVehicle(new Position(46.18, 0.0, 10.95));
        this.boxes[18].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[19].setPaint(Color.WHITE);
        this.boxes[19].setOpacity(0.0);
        this.boxes[19].setName("box15");
        this.boxes[19].setVehicle(scene);
        this.boxes[19].setOrientationRelativeToVehicle(new Orientation(0.0, 0.219942, 0.0, 0.975513));
        this.boxes[19].setPositionRelativeToVehicle(new Position(46.898, 0.0, 12.28));
        this.boxes[19].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[20].setPaint(Color.WHITE);
        this.boxes[20].setOpacity(0.0);
        this.boxes[20].setName("box16");
        this.boxes[20].setVehicle(scene);
        this.boxes[20].setOrientationRelativeToVehicle(new Orientation(0.0, 0.201814, 0.0, 0.979424));
        this.boxes[20].setPositionRelativeToVehicle(new Position(47.554, 0.0, 13.59));
        this.boxes[20].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[21].setPaint(Color.WHITE);
        this.boxes[21].setOpacity(0.0);
        this.boxes[21].setName("box17");
        this.boxes[21].setVehicle(scene);
        this.boxes[21].setOrientationRelativeToVehicle(new Orientation(0.0, 0.162202, 0.0, 0.986758));
        this.boxes[21].setPositionRelativeToVehicle(new Position(48.039, 0.0, 15.027));
        this.boxes[21].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[22].setPaint(Color.WHITE);
        this.boxes[22].setOpacity(0.0);
        this.boxes[22].setName("box18");
        this.boxes[22].setVehicle(scene);
        this.boxes[22].setOrientationRelativeToVehicle(new Orientation(0.0, 0.085644, 0.0, 0.996326));
        this.boxes[22].setPositionRelativeToVehicle(new Position(48.504, 0.0, 16.442));
        this.boxes[22].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[23].setPaint(Color.WHITE);
        this.boxes[23].setOpacity(0.0);
        this.boxes[23].setName("box19");
        this.boxes[23].setVehicle(scene);
        this.boxes[23].setOrientationRelativeToVehicle(new Orientation(0.0, 0.038378, 0.0, 0.999263));
        this.boxes[23].setPositionRelativeToVehicle(new Position(48.778, 0.0, 17.921));
        this.boxes[23].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[24].setPaint(Color.WHITE);
        this.boxes[24].setOpacity(0.0);
        this.boxes[24].setName("box20");
        this.boxes[24].setVehicle(scene);
        this.boxes[24].setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boxes[24].setPositionRelativeToVehicle(new Position(48.947, 0.0, 19.463));
        this.boxes[24].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[25].setPaint(Color.WHITE);
        this.boxes[25].setOpacity(0.0);
        this.boxes[25].setName("box21");
        this.boxes[25].setVehicle(scene);
        this.boxes[25].setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boxes[25].setPositionRelativeToVehicle(new Position(49.138, 0.0, 20.836));
        this.boxes[25].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[26].setPaint(Color.WHITE);
        this.boxes[26].setOpacity(0.0);
        this.boxes[26].setName("box22");
        this.boxes[26].setVehicle(scene);
        this.boxes[26].setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boxes[26].setPositionRelativeToVehicle(new Position(49.413, 0.0, 22.273));
        this.boxes[26].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[27].setPaint(Color.WHITE);
        this.boxes[27].setOpacity(0.0);
        this.boxes[27].setName("box23");
        this.boxes[27].setVehicle(scene);
        this.boxes[27].setOrientationRelativeToVehicle(new Orientation(0.0, -0.016519, 0.0, 0.999864));
        this.boxes[27].setPositionRelativeToVehicle(new Position(49.455, -0.031, 23.9));
        this.boxes[27].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[28].setPaint(Color.WHITE);
        this.boxes[28].setOpacity(0.0);
        this.boxes[28].setName("box");
        this.boxes[28].setVehicle(scene);
        this.boxes[28].setOrientationRelativeToVehicle(new Orientation(0.0, -0.072587, 0.0, 0.997362));
        this.boxes[28].setPositionRelativeToVehicle(new Position(30.656, 0.0, 6.289));
        this.boxes[28].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[29].setPaint(Color.WHITE);
        this.boxes[29].setOpacity(0.0);
        this.boxes[29].setName("box24");
        this.boxes[29].setVehicle(scene);
        this.boxes[29].setOrientationRelativeToVehicle(new Orientation(0.0, -0.086508, 0.0, 0.996251));
        this.boxes[29].setPositionRelativeToVehicle(new Position(32.277, 0.0, 6.714));
        this.boxes[29].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[30].setPaint(Color.WHITE);
        this.boxes[30].setOpacity(0.0);
        this.boxes[30].setName("box25");
        this.boxes[30].setVehicle(scene);
        this.boxes[30].setOrientationRelativeToVehicle(new Orientation(0.0, -0.147593, 0.0, 0.989048));
        this.boxes[30].setPositionRelativeToVehicle(new Position(33.617, 0.0, 7.34));
        this.boxes[30].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[31].setPaint(Color.WHITE);
        this.boxes[31].setOpacity(0.0);
        this.boxes[31].setName("\u017E");
        this.boxes[31].setVehicle(scene);
        this.boxes[31].setOrientationRelativeToVehicle(new Orientation(0.0, -0.192136, 0.0, 0.981368));
        this.boxes[31].setPositionRelativeToVehicle(new Position(35.071, 0.0, 7.968));
        this.boxes[31].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[32].setPaint(Color.WHITE);
        this.boxes[32].setOpacity(0.0);
        this.boxes[32].setName("box26");
        this.boxes[32].setVehicle(scene);
        this.boxes[32].setOrientationRelativeToVehicle(new Orientation(0.0, -0.297157, 0.0, 0.954829));
        this.boxes[32].setPositionRelativeToVehicle(new Position(36.382, 0.0, 8.709));
        this.boxes[32].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[33].setPaint(Color.WHITE);
        this.boxes[33].setOpacity(0.0);
        this.boxes[33].setName("box27");
        this.boxes[33].setVehicle(scene);
        this.boxes[33].setOrientationRelativeToVehicle(new Orientation(0.0, -0.301405, 0.0, 0.953496));
        this.boxes[33].setPositionRelativeToVehicle(new Position(37.722, 0.0, 9.764));
        this.boxes[33].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[34].setPaint(Color.WHITE);
        this.boxes[34].setOpacity(0.0);
        this.boxes[34].setName("box28");
        this.boxes[34].setVehicle(scene);
        this.boxes[34].setOrientationRelativeToVehicle(new Orientation(0.0, -0.35848, 0.0, 0.933537));
        this.boxes[34].setPositionRelativeToVehicle(new Position(39.062, 0.0, 10.791));
        this.boxes[34].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[35].setPaint(Color.WHITE);
        this.boxes[35].setOpacity(0.0);
        this.boxes[35].setName("box29");
        this.boxes[35].setVehicle(scene);
        this.boxes[35].setOrientationRelativeToVehicle(new Orientation(0.0, -0.400306, 0.0, 0.916382));
        this.boxes[35].setPositionRelativeToVehicle(new Position(40.117, 0.0, 11.874));
        this.boxes[35].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[36].setPaint(Color.WHITE);
        this.boxes[36].setOpacity(0.0);
        this.boxes[36].setName("box30");
        this.boxes[36].setVehicle(scene);
        this.boxes[36].setOrientationRelativeToVehicle(new Orientation(0.0, -0.520227, 0.0, 0.854028));
        this.boxes[36].setPositionRelativeToVehicle(new Position(41.143, 0.0, 13.214));
        this.boxes[36].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[37].setPaint(Color.WHITE);
        this.boxes[37].setOpacity(0.0);
        this.boxes[37].setName("box31");
        this.boxes[37].setVehicle(scene);
        this.boxes[37].setOrientationRelativeToVehicle(new Orientation(0.0, -0.594925, 0.0, 0.803781));
        this.boxes[37].setPositionRelativeToVehicle(new Position(41.828, 0.0, 14.697));
        this.boxes[37].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[38].setPaint(Color.WHITE);
        this.boxes[38].setOpacity(0.0);
        this.boxes[38].setName("box32");
        this.boxes[38].setVehicle(scene);
        this.boxes[38].setOrientationRelativeToVehicle(new Orientation(0.0, -0.617964, 0.0, 0.786207));
        this.boxes[38].setPositionRelativeToVehicle(new Position(42.255, 0.0, 16.122));
        this.boxes[38].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[39].setPaint(Color.WHITE);
        this.boxes[39].setOpacity(0.0);
        this.boxes[39].setName("box33");
        this.boxes[39].setVehicle(scene);
        this.boxes[39].setOrientationRelativeToVehicle(new Orientation(0.0, 0.147993, 0.0, 0.988988));
        this.boxes[39].setPositionRelativeToVehicle(new Position(42.797, 0.0, 17.661));
        this.boxes[39].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[40].setPaint(Color.WHITE);
        this.boxes[40].setOpacity(0.0);
        this.boxes[40].setName("box34");
        this.boxes[40].setVehicle(scene);
        this.boxes[40].setOrientationRelativeToVehicle(new Orientation(0.0, 0.116187, 0.0, 0.993227));
        this.boxes[40].setPositionRelativeToVehicle(new Position(43.339, 0.0, 19.258));
        this.boxes[40].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[41].setPaint(Color.WHITE);
        this.boxes[41].setOpacity(0.0);
        this.boxes[41].setName("box35");
        this.boxes[41].setVehicle(scene);
        this.boxes[41].setOrientationRelativeToVehicle(new Orientation(0.0, 0.120738, 0.0, 0.992684));
        this.boxes[41].setPositionRelativeToVehicle(new Position(43.709, 0.0, 20.798));
        this.boxes[41].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[42].setPaint(Color.WHITE);
        this.boxes[42].setOpacity(0.0);
        this.boxes[42].setName("box36");
        this.boxes[42].setVehicle(scene);
        this.boxes[42].setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boxes[42].setPositionRelativeToVehicle(new Position(43.909, 0.0, 22.366));
        this.boxes[42].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[43].setPaint(Color.WHITE);
        this.boxes[43].setOpacity(0.0);
        this.boxes[43].setName("box37");
        this.boxes[43].setVehicle(scene);
        this.boxes[43].setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boxes[43].setPositionRelativeToVehicle(new Position(43.795, 0.0, 23.706));
        this.boxes[43].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[44].setPaint(Color.WHITE);
        this.boxes[44].setOpacity(0.0);
        this.boxes[44].setName("box38");
        this.boxes[44].setVehicle(scene);
        this.boxes[44].setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boxes[44].setPositionRelativeToVehicle(new Position(47.935, 0.0, 35.93));
        this.boxes[44].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[45].setPaint(Color.WHITE);
        this.boxes[45].setOpacity(0.0);
        this.boxes[45].setName("box39");
        this.boxes[45].setVehicle(scene);
        this.boxes[45].setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boxes[45].setPositionRelativeToVehicle(new Position(47.935, 0.0, 37.493));
        this.boxes[45].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[46].setPaint(Color.WHITE);
        this.boxes[46].setOpacity(0.0);
        this.boxes[46].setName("box40");
        this.boxes[46].setVehicle(scene);
        this.boxes[46].setOrientationRelativeToVehicle(new Orientation(0.0, 0.09948, 0.0, 0.99504));
        this.boxes[46].setPositionRelativeToVehicle(new Position(48.208, 0.0, 39.055));
        this.boxes[46].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[47].setPaint(Color.WHITE);
        this.boxes[47].setOpacity(0.0);
        this.boxes[47].setName("box41");
        this.boxes[47].setVehicle(scene);
        this.boxes[47].setOrientationRelativeToVehicle(new Orientation(0.0, 0.186888, 0.0, 0.982381));
        this.boxes[47].setPositionRelativeToVehicle(new Position(48.481, 0.0, 40.462));
        this.boxes[47].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[48].setPaint(Color.WHITE);
        this.boxes[48].setOpacity(0.0);
        this.boxes[48].setName("box42");
        this.boxes[48].setVehicle(scene);
        this.boxes[48].setOrientationRelativeToVehicle(new Orientation(0.0, 0.153577, 0.0, 0.988137));
        this.boxes[48].setPositionRelativeToVehicle(new Position(48.833, 0.0, 41.908));
        this.boxes[48].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[49].setPaint(Color.WHITE);
        this.boxes[49].setOpacity(0.0);
        this.boxes[49].setName("box43");
        this.boxes[49].setVehicle(scene);
        this.boxes[49].setOrientationRelativeToVehicle(new Orientation(0.0, 0.163938, 0.0, 0.986471));
        this.boxes[49].setPositionRelativeToVehicle(new Position(49.458, 0.0, 43.392));
        this.boxes[49].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[50].setPaint(Color.WHITE);
        this.boxes[50].setOpacity(0.0);
        this.boxes[50].setName("box44");
        this.boxes[50].setVehicle(scene);
        this.boxes[50].setOrientationRelativeToVehicle(new Orientation(0.0, 0.123619, 0.0, 0.99233));
        this.boxes[50].setPositionRelativeToVehicle(new Position(50.083, 0.0, 44.759));
        this.boxes[50].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[51].setPaint(Color.WHITE);
        this.boxes[51].setOpacity(0.0);
        this.boxes[51].setName("box45");
        this.boxes[51].setVehicle(scene);
        this.boxes[51].setOrientationRelativeToVehicle(new Orientation(0.0, 0.235937, 0.0, 0.971768));
        this.boxes[51].setPositionRelativeToVehicle(new Position(50.748, 0.0, 46.126));
        this.boxes[51].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[52].setPaint(Color.WHITE);
        this.boxes[52].setOpacity(0.0);
        this.boxes[52].setName("box46");
        this.boxes[52].setVehicle(scene);
        this.boxes[52].setOrientationRelativeToVehicle(new Orientation(0.0, 0.322475, 0.0, 0.946578));
        this.boxes[52].setPositionRelativeToVehicle(new Position(51.685, 0.0, 47.415));
        this.boxes[52].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[53].setPaint(Color.WHITE);
        this.boxes[53].setOpacity(0.0);
        this.boxes[53].setName("box47");
        this.boxes[53].setVehicle(scene);
        this.boxes[53].setOrientationRelativeToVehicle(new Orientation(0.0, 0.334547, 0.0, 0.942379));
        this.boxes[53].setPositionRelativeToVehicle(new Position(52.818, 0.0, 48.626));
        this.boxes[53].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[54].setPaint(Color.WHITE);
        this.boxes[54].setOpacity(0.0);
        this.boxes[54].setName("box48");
        this.boxes[54].setVehicle(scene);
        this.boxes[54].setOrientationRelativeToVehicle(new Orientation(0.0, 0.391901, 0.0, 0.920007));
        this.boxes[54].setPositionRelativeToVehicle(new Position(53.99, 0.0, 49.76));
        this.boxes[54].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[55].setPaint(Color.WHITE);
        this.boxes[55].setOpacity(0.0);
        this.boxes[55].setName("box49");
        this.boxes[55].setVehicle(scene);
        this.boxes[55].setOrientationRelativeToVehicle(new Orientation(0.0, 0.502141, 0.0, 0.864786));
        this.boxes[55].setPositionRelativeToVehicle(new Position(55.318, 0.0, 50.618));
        this.boxes[55].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[56].setPaint(Color.WHITE);
        this.boxes[56].setOpacity(0.0);
        this.boxes[56].setName("box50");
        this.boxes[56].setVehicle(scene);
        this.boxes[56].setOrientationRelativeToVehicle(new Orientation(0.0, 0.47518, 0.0, 0.879888));
        this.boxes[56].setPositionRelativeToVehicle(new Position(56.647, 0.0, 51.322));
        this.boxes[56].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[57].setPaint(Color.WHITE);
        this.boxes[57].setOpacity(0.0);
        this.boxes[57].setName("box51");
        this.boxes[57].setVehicle(scene);
        this.boxes[57].setOrientationRelativeToVehicle(new Orientation(0.0, 0.546853, 0.0, 0.837229));
        this.boxes[57].setPositionRelativeToVehicle(new Position(58.014, 0.0, 52.025));
        this.boxes[57].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[58].setPaint(Color.WHITE);
        this.boxes[58].setOpacity(0.0);
        this.boxes[58].setName("box52");
        this.boxes[58].setVehicle(scene);
        this.boxes[58].setOrientationRelativeToVehicle(new Orientation(0.0, -0.211095, 0.0, 0.977466));
        this.boxes[58].setPositionRelativeToVehicle(new Position(59.459, 0.0, 52.494));
        this.boxes[58].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[59].setPaint(Color.WHITE);
        this.boxes[59].setOpacity(0.0);
        this.boxes[59].setName("box53");
        this.boxes[59].setVehicle(scene);
        this.boxes[59].setOrientationRelativeToVehicle(new Orientation(0.0, -0.097884, 0.0, 0.995198));
        this.boxes[59].setPositionRelativeToVehicle(new Position(61.061, 0.0, 53.041));
        this.boxes[59].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[60].setPaint(Color.WHITE);
        this.boxes[60].setOpacity(0.0);
        this.boxes[60].setName("box54");
        this.boxes[60].setVehicle(scene);
        this.boxes[60].setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boxes[60].setPositionRelativeToVehicle(new Position(60.435, 0.0, 58.236));
        this.boxes[60].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[61].setPaint(Color.WHITE);
        this.boxes[61].setOpacity(0.0);
        this.boxes[61].setName("box55");
        this.boxes[61].setVehicle(scene);
        this.boxes[61].setOrientationRelativeToVehicle(new Orientation(0.0, -0.122207, 0.0, 0.992505));
        this.boxes[61].setPositionRelativeToVehicle(new Position(58.951, 0.0, 58.08));
        this.boxes[61].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[62].setPaint(Color.WHITE);
        this.boxes[62].setOpacity(0.0);
        this.boxes[62].setName("box56");
        this.boxes[62].setVehicle(scene);
        this.boxes[62].setOrientationRelativeToVehicle(new Orientation(0.0, -0.186016, 0.0, 0.982547));
        this.boxes[62].setPositionRelativeToVehicle(new Position(57.466, 0.0, 57.651));
        this.boxes[62].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[63].setPaint(Color.WHITE);
        this.boxes[63].setOpacity(0.0);
        this.boxes[63].setName("box57");
        this.boxes[63].setVehicle(scene);
        this.boxes[63].setOrientationRelativeToVehicle(new Orientation(0.0, -0.217191, 0.0, 0.976129));
        this.boxes[63].setPositionRelativeToVehicle(new Position(55.904, 0.0, 57.143));
        this.boxes[63].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[64].setPaint(Color.WHITE);
        this.boxes[64].setOpacity(0.0);
        this.boxes[64].setName("box58");
        this.boxes[64].setVehicle(scene);
        this.boxes[64].setOrientationRelativeToVehicle(new Orientation(0.0, -0.254693, 0.0, 0.967022));
        this.boxes[64].setPositionRelativeToVehicle(new Position(54.419, 0.0, 56.596));
        this.boxes[64].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[65].setPaint(Color.WHITE);
        this.boxes[65].setOpacity(0.0);
        this.boxes[65].setName("box59");
        this.boxes[65].setVehicle(scene);
        this.boxes[65].setOrientationRelativeToVehicle(new Orientation(0.0, -0.270564, 0.0, 0.962702));
        this.boxes[65].setPositionRelativeToVehicle(new Position(52.935, 0.0, 55.775));
        this.boxes[65].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[66].setPaint(Color.WHITE);
        this.boxes[66].setOpacity(0.0);
        this.boxes[66].setName("box60");
        this.boxes[66].setVehicle(scene);
        this.boxes[66].setOrientationRelativeToVehicle(new Orientation(0.0, -0.34536, 0.0, 0.93847));
        this.boxes[66].setPositionRelativeToVehicle(new Position(51.45, 0.0, 54.838));
        this.boxes[66].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[67].setPaint(Color.WHITE);
        this.boxes[67].setOpacity(0.0);
        this.boxes[67].setName("box61");
        this.boxes[67].setVehicle(scene);
        this.boxes[67].setOrientationRelativeToVehicle(new Orientation(0.0, -0.332757, 0.0, 0.943013));
        this.boxes[67].setPositionRelativeToVehicle(new Position(50.279, 0.0, 53.744));
        this.boxes[67].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[68].setPaint(Color.WHITE);
        this.boxes[68].setOpacity(0.0);
        this.boxes[68].setName("box62");
        this.boxes[68].setVehicle(scene);
        this.boxes[68].setOrientationRelativeToVehicle(new Orientation(0.0, -0.370775, 0.0, 0.928723));
        this.boxes[68].setPositionRelativeToVehicle(new Position(48.989, 0.0, 52.65));
        this.boxes[68].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[69].setPaint(Color.WHITE);
        this.boxes[69].setOpacity(0.0);
        this.boxes[69].setName("box63");
        this.boxes[69].setVehicle(scene);
        this.boxes[69].setOrientationRelativeToVehicle(new Orientation(0.0, -0.319812, 0.0, 0.947481));
        this.boxes[69].setPositionRelativeToVehicle(new Position(47.856, 0.0, 51.517));
        this.boxes[69].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[70].setPaint(Color.WHITE);
        this.boxes[70].setOpacity(0.0);
        this.boxes[70].setName("box64");
        this.boxes[70].setVehicle(scene);
        this.boxes[70].setOrientationRelativeToVehicle(new Orientation(0.0, -0.346494, 0.0, 0.938052));
        this.boxes[70].setPositionRelativeToVehicle(new Position(46.685, 0.0, 50.345));
        this.boxes[70].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[71].setPaint(Color.WHITE);
        this.boxes[71].setOpacity(0.0);
        this.boxes[71].setName("box65");
        this.boxes[71].setVehicle(scene);
        this.boxes[71].setOrientationRelativeToVehicle(new Orientation(0.0, -0.351872, 0.0, 0.936048));
        this.boxes[71].setPositionRelativeToVehicle(new Position(45.708, 0.0, 48.978));
        this.boxes[71].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[72].setPaint(Color.WHITE);
        this.boxes[72].setOpacity(0.0);
        this.boxes[72].setName("box66");
        this.boxes[72].setVehicle(scene);
        this.boxes[72].setOrientationRelativeToVehicle(new Orientation(0.0, -0.415964, 0.0, 0.909381));
        this.boxes[72].setPositionRelativeToVehicle(new Position(44.809, 0.0, 47.493));
        this.boxes[72].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[73].setPaint(Color.WHITE);
        this.boxes[73].setOpacity(0.0);
        this.boxes[73].setName("box67");
        this.boxes[73].setVehicle(scene);
        this.boxes[73].setOrientationRelativeToVehicle(new Orientation(0.0, -0.504427, 0.0, 0.863455));
        this.boxes[73].setPositionRelativeToVehicle(new Position(44.341, 0.0, 45.814));
        this.boxes[73].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[74].setPaint(Color.WHITE);
        this.boxes[74].setOpacity(0.0);
        this.boxes[74].setName("box68");
        this.boxes[74].setVehicle(scene);
        this.boxes[74].setOrientationRelativeToVehicle(new Orientation(0.0, 0.218099, 0.0, 0.975927));
        this.boxes[74].setPositionRelativeToVehicle(new Position(43.637, 0.0, 44.173));
        this.boxes[74].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[75].setPaint(Color.WHITE);
        this.boxes[75].setOpacity(0.0);
        this.boxes[75].setName("box69");
        this.boxes[75].setVehicle(scene);
        this.boxes[75].setOrientationRelativeToVehicle(new Orientation(0.0, 0.205803, 0.0, 0.978593));
        this.boxes[75].setPositionRelativeToVehicle(new Position(43.012, 0.0, 42.61));
        this.boxes[75].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[76].setPaint(Color.WHITE);
        this.boxes[76].setOpacity(0.0);
        this.boxes[76].setName("box70");
        this.boxes[76].setVehicle(scene);
        this.boxes[76].setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boxes[76].setPositionRelativeToVehicle(new Position(42.778, 0.0, 40.891));
        this.boxes[76].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[77].setPaint(Color.WHITE);
        this.boxes[77].setOpacity(0.0);
        this.boxes[77].setName("box71");
        this.boxes[77].setVehicle(scene);
        this.boxes[77].setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boxes[77].setPositionRelativeToVehicle(new Position(42.622, 0.0, 39.251));
        this.boxes[77].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[78].setPaint(Color.WHITE);
        this.boxes[78].setOpacity(0.0);
        this.boxes[78].setName("box72");
        this.boxes[78].setVehicle(scene);
        this.boxes[78].setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boxes[78].setPositionRelativeToVehicle(new Position(42.387, 0.0, 37.532));
        this.boxes[78].setSize(new Size(1.0, 1.0, 1.0));
        this.boxes[79].setPaint(Color.WHITE);
        this.boxes[79].setOpacity(0.0);
        this.boxes[79].setName("box73");
        this.boxes[79].setVehicle(scene);
        this.boxes[79].setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boxes[79].setPositionRelativeToVehicle(new Position(42.583, 0.0, 35.657));
        this.boxes[79].setSize(new Size(1.0, 1.0, 1.0));
    }
}
