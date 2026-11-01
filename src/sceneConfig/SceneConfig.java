import org.lgna.story.Color;
import org.lgna.story.Orientation;
import org.lgna.story.Position;
import org.lgna.story.SCamera;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.SGround;
import org.lgna.story.Size;
import org.lgna.story.resources.prop.BoulderResource;
import org.lgna.story.resources.prop.ConiferTreeResource;
import org.lgna.story.resources.prop.FirTreeTrunkResource;
import org.lgna.story.resources.prop.LogsResource;
import org.lgna.story.resources.prop.MushroomResource;
import org.lgna.story.resources.quadruped.BearCubResource;
import org.lgna.story.resources.quadruped.BearResource;
import org.lgna.story.resources.sims2.AdultPersonResource;
import org.lgna.story.resources.sims2.BaseEyeColor;
import org.lgna.story.resources.sims2.BaseFace;
import org.lgna.story.resources.sims2.Gender;
import org.lgna.story.resources.sims2.MaleAdultBottomPieceCargoPants;
import org.lgna.story.resources.sims2.MaleAdultHairShocked;
import org.lgna.story.resources.sims2.MaleAdultTopAndBottomOutfit;
import org.lgna.story.resources.sims2.MaleAdultTopPieceCowboyShirt;
import org.lgna.story.resources.sims2.MaleTeenFullBodyOutfitOpenShirtOverPants;
import org.lgna.story.resources.sims2.MaleTeenHairShortSimple;
import org.lgna.story.resources.sims2.TeenPersonResource;

class SceneConfig {
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final AdultPerson grinc = new AdultPerson(
        new AdultPersonResource(
            Gender.MALE,
            new Color(0.62, 0.898, 0.102),
            BaseEyeColor.GREEN,
            MaleAdultHairShocked.BLACK,
            0.101187,
            new MaleAdultTopAndBottomOutfit(
                MaleAdultTopPieceCowboyShirt.PATTERN_BLUE,
                MaleAdultBottomPieceCargoPants.TAN
            ),
            BaseFace.ALIEN
        )
    );
    private final TeenPerson teenPerson = new TeenPerson(
        new TeenPersonResource(
            Gender.MALE,
            new Color(0.776, 0.545, 0.404),
            BaseEyeColor.DARK_BROWN,
            MaleTeenHairShortSimple.BROWN,
            0.0,
            MaleTeenFullBodyOutfitOpenShirtOverPants.PLAIN_RED,
            BaseFace.HUMAN_01
        )
    );
    private final PineTree pineTree = new PineTree();
    private final ConiferTree coniferTree = new ConiferTree(ConiferTreeResource.SHORT);
    private final Mushroom mushroom = new Mushroom(MushroomResource.SHORT_RED);
    private final ColaBottle colaBottle = new ColaBottle();
    private final FirTreeTrunk firTreeTrunk = new FirTreeTrunk(FirTreeTrunkResource.SNOW_MIRROR);
    private final FirTreeTrunk firTreeTrunk2 = new FirTreeTrunk(FirTreeTrunkResource.SNOW_TALL_MIRROR);
    private final Logs logs = new Logs(LogsResource.BURNING);
    private final Flames flames = new Flames();
    private final Squirrel squirrel = new Squirrel();
    private final BearCub bearCub = new BearCub(BearCubResource.POLAR);
    private final Bear bear = new Bear(BearResource.POLAR);
    private final Boulder boulder = new Boulder(BoulderResource.BOULDER1_BROWN);
    private final Boulder boulder2 = new Boulder(BoulderResource.BOULDER5_GRAY);
    private final CenturyPlant centuryPlant = new CenturyPlant();
    private final ColaBottle colaBottle2 = new ColaBottle();

    SGround ground() { return ground; }
    SCamera camera() { return camera; }
    AdultPerson grinc() { return grinc; }
    TeenPerson teenPerson() { return teenPerson; }
    PineTree pineTree() { return pineTree; }
    ConiferTree coniferTree() { return coniferTree; }
    Mushroom mushroom() { return mushroom; }
    ColaBottle colaBottle() { return colaBottle; }
    FirTreeTrunk firTreeTrunk() { return firTreeTrunk; }
    FirTreeTrunk firTreeTrunk2() { return firTreeTrunk2; }
    Logs logs() { return logs; }
    Flames flames() { return flames; }
    Squirrel squirrel() { return squirrel; }
    BearCub bearCub() { return bearCub; }
    Bear bear() { return bear; }
    Boulder boulder() { return boulder; }
    Boulder boulder2() { return boulder2; }
    CenturyPlant centuryPlant() { return centuryPlant; }
    ColaBottle colaBottle2() { return colaBottle2; }

    void performGeneratedSetUp(Scene scene) {
        scene.setAtmosphereColor(new Color(0.82, 0.941, 1.0));
        scene.setFromAboveLightColor(Color.WHITE);
        scene.setFromBelowLightColor(Color.WHITE);
        scene.setFogDensity(0.22);
        scene.setName("myScene");
        this.ground.setPaint(SurfaceAppearance.SNOW);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(scene);
        this.camera.setName("camera");
        this.camera.setVehicle(this.teenPerson);
        this.camera.setOrientationRelativeToVehicle(new Orientation(-0.061246, -0.038005, -0.002334, 0.997396));
        this.camera.setPositionRelativeToVehicle(new Position(-0.668, 2.511, 6.875));
        this.grinc.setPaint(new Color(0.6, 0.8, 0.0));
        this.grinc.setOpacity(1.0);
        this.grinc.setName("grinc");
        this.grinc.setVehicle(scene);
        this.grinc.setOrientationRelativeToVehicle(new Orientation(0.0, 0.282603, 0.0, 0.959237));
        this.grinc.setPositionRelativeToVehicle(new Position(4.966, 0.0, -64.412));
        this.teenPerson.setPaint(Color.WHITE);
        this.teenPerson.setOpacity(1.0);
        this.teenPerson.setName("teenPerson");
        this.teenPerson.setVehicle(scene);
        this.teenPerson.setOrientationRelativeToVehicle(new Orientation(0.0, 1.0, 0.0, 0.0));
        this.teenPerson.setPositionRelativeToVehicle(new Position(1.443, 0.0, -74.068));
        this.pineTree.setPaint(new Color(0.2, 0.4, 0.0));
        this.pineTree.setOpacity(1.0);
        this.pineTree.setName("pineTree");
        this.pineTree.setVehicle(scene);
        this.pineTree.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.pineTree.setPositionRelativeToVehicle(new Position(0.217, 0.0, -60.145));
        this.coniferTree.setPaint(Color.WHITE);
        this.coniferTree.setOpacity(1.0);
        this.coniferTree.setName("coniferTree");
        this.coniferTree.setVehicle(scene);
        this.coniferTree.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.coniferTree.setPositionRelativeToVehicle(new Position(2.386, 0.0, -62.672));
        this.mushroom.setPaint(Color.WHITE);
        this.mushroom.setOpacity(1.0);
        this.mushroom.setName("mushroom");
        this.mushroom.setVehicle(scene);
        this.mushroom.setOrientationRelativeToVehicle(new Orientation(0.0, 0.987104, 0.0, 0.16008));
        this.mushroom.setPositionRelativeToVehicle(new Position(-2.898, 0.0, -58.863));
        this.colaBottle.setPaint(Color.WHITE);
        this.colaBottle.setOpacity(1.0);
        this.colaBottle.setName("colaBottle");
        this.colaBottle.setVehicle(scene);
        this.colaBottle.setOrientationRelativeToVehicle(new Orientation(0.0, -0.836561, 0.0, 0.547874));
        this.colaBottle.setPositionRelativeToVehicle(new Position(-2.011, 0.0, -67.454));
        this.colaBottle.setSize(new Size(0.115, 0.39, 0.121));
        this.firTreeTrunk.setPaint(Color.WHITE);
        this.firTreeTrunk.setOpacity(1.0);
        this.firTreeTrunk.setName("firTreeTrunk");
        this.firTreeTrunk.setVehicle(scene);
        this.firTreeTrunk.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.firTreeTrunk.setPositionRelativeToVehicle(new Position(-0.22, 0.0, -62.711));
        this.firTreeTrunk.setSize(new Size(1.5, 3.141, 1.525));
        this.firTreeTrunk2.setPaint(Color.WHITE);
        this.firTreeTrunk2.setOpacity(1.0);
        this.firTreeTrunk2.setName("firTreeTrunk2");
        this.firTreeTrunk2.setVehicle(scene);
        this.firTreeTrunk2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.448944, 0.0, 0.89356));
        this.firTreeTrunk2.setPositionRelativeToVehicle(new Position(-1.496, 0.0, -59.338));
        this.firTreeTrunk2.setSize(new Size(2.0, 6.273, 2.028));
        this.logs.setPaint(Color.WHITE);
        this.logs.setOpacity(1.0);
        this.logs.setName("logs");
        this.logs.setVehicle(scene);
        this.logs.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.logs.setPositionRelativeToVehicle(new Position(-0.923, 0.0, -63.105));
        this.logs.setSize(new Size(0.8, 0.404, 0.668));
        this.flames.setPaint(Color.WHITE);
        this.flames.setOpacity(1.0);
        this.flames.setName("flames");
        this.flames.setVehicle(scene);
        this.flames.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.flames.setPositionRelativeToVehicle(new Position(-0.976, 0.0, -62.994));
        this.flames.setSize(new Size(0.5, 1.11, 0.562));
        this.squirrel.setPaint(Color.WHITE);
        this.squirrel.setOpacity(1.0);
        this.squirrel.setName("squirrel");
        this.squirrel.setVehicle(scene);
        this.squirrel.setOrientationRelativeToVehicle(new Orientation(0.0, -0.361132, 0.0, 0.932515));
        this.squirrel.setPositionRelativeToVehicle(new Position(-1.616, 0.0, -62.146));
        this.squirrel.setSize(new Size(0.3, 0.697, 0.637));
        this.squirrel.getFrontLeftShoulder().setOrientationRelativeToVehicle(
            new Orientation(0.145971, -0.466578, -0.084597, 0.86824)
        );
        this.squirrel.getFrontRightShoulder().setOrientationRelativeToVehicle(
            new Orientation(0.140207, 0.466004, 0.087689, 0.869191)
        );
        this.bearCub.setPaint(Color.WHITE);
        this.bearCub.setOpacity(1.0);
        this.bearCub.setName("bearCub");
        this.bearCub.setVehicle(scene);
        this.bearCub.setOrientationRelativeToVehicle(new Orientation(0.0, -0.403274, 0.0, 0.915079));
        this.bearCub.setPositionRelativeToVehicle(new Position(-5.851, 0.0, -63.418));
        this.bear.setPaint(Color.WHITE);
        this.bear.setOpacity(1.0);
        this.bear.setName("bear");
        this.bear.setVehicle(scene);
        this.bear.setOrientationRelativeToVehicle(new Orientation(0.0, -0.038077, 0.0, 0.999275));
        this.bear.setPositionRelativeToVehicle(new Position(-4.787, 0.0, -61.435));
        this.boulder.setPaint(Color.WHITE);
        this.boulder.setOpacity(1.0);
        this.boulder.setName("boulder");
        this.boulder.setVehicle(scene);
        this.boulder.setOrientationRelativeToVehicle(new Orientation(0.0, -0.038077, 0.0, 0.999275));
        this.boulder.setPositionRelativeToVehicle(new Position(4.48, 0.0, -71.416));
        this.boulder2.setPaint(Color.WHITE);
        this.boulder2.setOpacity(1.0);
        this.boulder2.setName("boulder2");
        this.boulder2.setVehicle(scene);
        this.boulder2.setOrientationRelativeToVehicle(new Orientation(0.0, -0.038077, 0.0, 0.999275));
        this.boulder2.setPositionRelativeToVehicle(new Position(7.026, 0.0, -65.144));
        this.centuryPlant.setPaint(Color.WHITE);
        this.centuryPlant.setOpacity(1.0);
        this.centuryPlant.setName("centuryPlant");
        this.centuryPlant.setVehicle(scene);
        this.centuryPlant.setOrientationRelativeToVehicle(new Orientation(0.0, -0.038077, 0.0, 0.999275));
        this.centuryPlant.setPositionRelativeToVehicle(new Position(-1.731, 0.0, -72.647));
        this.colaBottle2.setPaint(Color.WHITE);
        this.colaBottle2.setOpacity(1.0);
        this.colaBottle2.setName("colaBottle2");
        this.colaBottle2.setVehicle(scene);
        this.colaBottle2.setOrientationRelativeToVehicle(new Orientation(0.0, -0.038077, 0.0, 0.999275));
        this.colaBottle2.setPositionRelativeToVehicle(new Position(7.614, 0.0, -58.945));
        this.colaBottle2.setSize(new Size(0.79, 2.687, 0.83));
    }
}
