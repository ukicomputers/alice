import org.lgna.story.*;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.resources.biped.YetiBabyResource;
import org.lgna.story.resources.flyer.PenguinResource;
import org.lgna.story.resources.prop.ArmoireResource;
import org.lgna.story.resources.prop.CircusTentResource;
import org.lgna.story.resources.prop.GardenGnomeResource;
import org.lgna.story.resources.prop.LogsResource;
import org.lgna.story.resources.prop.NordicHouseResource;
import org.lgna.story.resources.quadruped.BearCubResource;
import org.lgna.story.resources.quadruped.BearResource;
import org.lgna.story.resources.quadruped.BillyGoatResource;
import org.lgna.story.resources.sims2.BaseEyeColor;
import org.lgna.story.resources.sims2.BaseFace;
import org.lgna.story.resources.sims2.MaleTeenFullBodyOutfitOpenShirtOverPants;
import org.lgna.story.resources.sims2.MaleTeenHairShortSimple;
import org.lgna.story.resources.sims2.Gender;
import org.lgna.story.resources.sims2.TeenPersonResource;

class Scene3Config {
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final BillyGoat billyGoat = new BillyGoat(BillyGoatResource.LITTLE_HORNS);
    private final CircusTent circusTent = new CircusTent(CircusTentResource.CIRCUS_TENT_PRENDER_GHAST_LEFT_PURPLE);
    private final CircusTent circusTent2 = new CircusTent(CircusTentResource.CIRCUS_TENT_PRENDER_GHAST_FRONT_PURPLE);
    private final NordicHouse nordicHouse = new NordicHouse(NordicHouseResource.TWO_STORY);
    private final BearCub bearCub = new BearCub(BearCubResource.POLAR);
    private final Eagle eagle = new Eagle();
    private final Moose moose = new Moose();
    private final Squirrel squirrel = new Squirrel();
    private final Logs logs = new Logs(LogsResource.BURNING);
    private final Flames flames = new Flames();
    private final Penguin penguin = new Penguin(PenguinResource.BABY);
    private final SnowMan snowMan = new SnowMan();
    private final SnowWoman snowWoman = new SnowWoman();
    private final YetiBaby yetiBaby = new YetiBaby(YetiBabyResource.TUTU);
    private final Armoire armoire = new Armoire(ArmoireResource.QUAINT_RED);
    private final Humvee humvee = new Humvee();
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
    private final Bear bear = new Bear(BearResource.POLAR);
    private final GardenGnome gardenGnome = new GardenGnome(GardenGnomeResource.RED_HAT);
    private final Santa santa = new Santa();

    SGround ground() {
        return ground;
    }

    SCamera camera() {
        return camera;
    }

    BillyGoat billyGoat() {
        return billyGoat;
    }

    CircusTent circusTent() {
        return circusTent;
    }

    CircusTent circusTent2() {
        return circusTent2;
    }

    NordicHouse nordicHouse() {
        return nordicHouse;
    }

    BearCub bearCub() {
        return bearCub;
    }

    Eagle eagle() {
        return eagle;
    }

    Moose moose() {
        return moose;
    }

    Squirrel squirrel() {
        return squirrel;
    }

    Logs logs() {
        return logs;
    }

    Flames flames() {
        return flames;
    }

    Penguin penguin() {
        return penguin;
    }

    SnowMan snowMan() {
        return snowMan;
    }

    SnowWoman snowWoman() {
        return snowWoman;
    }

    YetiBaby yetiBaby() {
        return yetiBaby;
    }

    Armoire armoire() {
        return armoire;
    }

    Humvee humvee() {
        return humvee;
    }

    TeenPerson teenPerson() {
        return teenPerson;
    }

    Bear bear() {
        return bear;
    }

    GardenGnome gardenGnome() {
        return gardenGnome;
    }

    Santa santa() {
        return santa;
    }

    void performGeneratedSetUp(Scene3 scene) {
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
        this.camera.setVehicle(scene);
        this.camera.setOrientationRelativeToVehicle(new Orientation(-1.14E-4, -0.992958, 0.001823, 0.118453));
        this.camera.setPositionRelativeToVehicle(new Position(-6.295, 2.438, -18.005));
        this.billyGoat.setPaint(Color.WHITE);
        this.billyGoat.setOpacity(1.0);
        this.billyGoat.setName("billyGoat");
        this.billyGoat.setVehicle(scene);
        this.billyGoat.setOrientationRelativeToVehicle(new Orientation(0.0, 0.351388, 0.0, 0.93623));
        this.billyGoat.setPositionRelativeToVehicle(new Position(-0.357, 0.0, 8.604));
        this.circusTent.setPaint(Color.WHITE);
        this.circusTent.setOpacity(0.0);
        this.circusTent.setName("circusTent");
        this.circusTent.setVehicle(scene);
        this.circusTent.setOrientationRelativeToVehicle(new Orientation(0.0, -0.080412, 0.0, 0.996762));
        this.circusTent.setPositionRelativeToVehicle(new Position(-4.344, 0.0, 18.43));
        this.circusTent2.setPaint(Color.WHITE);
        this.circusTent2.setOpacity(1.0);
        this.circusTent2.setName("circusTent2");
        this.circusTent2.setVehicle(scene);
        this.circusTent2.setOrientationRelativeToVehicle(new Orientation(0.0, -0.092223, 0.0, 0.995738));
        this.circusTent2.setPositionRelativeToVehicle(new Position(-4.323, 0.0, 18.281));
        this.nordicHouse.setPaint(Color.WHITE);
        this.nordicHouse.setOpacity(1.0);
        this.nordicHouse.setName("nordicHouse");
        this.nordicHouse.setVehicle(scene);
        this.nordicHouse.setOrientationRelativeToVehicle(new Orientation(0.0, 0.877482, 0.0, 0.47961));
        this.nordicHouse.setPositionRelativeToVehicle(new Position(6.046, 0.0, 11.186));
        this.bearCub.setPaint(Color.WHITE);
        this.bearCub.setOpacity(1.0);
        this.bearCub.setName("bearCub");
        this.bearCub.setVehicle(scene);
        this.bearCub.setOrientationRelativeToVehicle(new Orientation(0.0, 0.240087, 0.0, 0.970751));
        this.bearCub.setPositionRelativeToVehicle(new Position(5.16, 0.0, 5.193));
        this.bearCub.setSize(new Size(0.5, 0.739, 1.065));
        this.eagle.setPaint(Color.WHITE);
        this.eagle.setOpacity(1.0);
        this.eagle.setName("eagle");
        this.eagle.setVehicle(scene);
        this.eagle.setOrientationRelativeToVehicle(new Orientation(0.0, -0.124675, 0.0, 0.992198));
        this.eagle.setPositionRelativeToVehicle(new Position(5.343, 1.7, 8.837));
        this.eagle.setSize(new Size(0.6, 0.807, 0.616));
        this.moose.setPaint(Color.WHITE);
        this.moose.setOpacity(1.0);
        this.moose.setName("moose");
        this.moose.setVehicle(scene);
        this.moose.setOrientationRelativeToVehicle(new Orientation(0.0, 0.088868, 0.0, 0.996043));
        this.moose.setPositionRelativeToVehicle(new Position(0.601, 0.0, 9.367));
        this.squirrel.setPaint(Color.WHITE);
        this.squirrel.setOpacity(1.0);
        this.squirrel.setName("squirrel");
        this.squirrel.setVehicle(scene);
        this.squirrel.setOrientationRelativeToVehicle(new Orientation(0.0, -0.063191, 0.0, 0.998001));
        this.squirrel.setPositionRelativeToVehicle(new Position(4.321, 0.0, 5.1));
        this.squirrel.setSize(new Size(0.4, 0.93, 0.849));
        this.squirrel.getFrontLeftShoulder().setOrientationRelativeToVehicle(new Orientation(0.145868, -0.466568, -0.084652, 0.868257));
        this.squirrel.getFrontRightShoulder().setOrientationRelativeToVehicle(new Orientation(0.140495, 0.466073, 0.087297, 0.869147));
        this.logs.setPaint(Color.WHITE);
        this.logs.setOpacity(1.0);
        this.logs.setName("logs");
        this.logs.setVehicle(scene);
        this.logs.setOrientationRelativeToVehicle(new Orientation(0.0, 0.062459, 0.0, 0.998048));
        this.logs.setPositionRelativeToVehicle(new Position(3.983, 0.0, 3.197));
        this.logs.setSize(new Size(0.7, 0.354, 0.584));
        this.flames.setPaint(Color.WHITE);
        this.flames.setOpacity(1.0);
        this.flames.setName("flames");
        this.flames.setVehicle(scene);
        this.flames.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.flames.setPositionRelativeToVehicle(new Position(4.002, 0.0, 3.328));
        this.flames.setSize(new Size(0.55, 1.221, 0.618));
        this.penguin.setPaint(Color.WHITE);
        this.penguin.setOpacity(1.0);
        this.penguin.setName("penguin");
        this.penguin.setVehicle(scene);
        this.penguin.setOrientationRelativeToVehicle(new Orientation(0.0, -0.181075, 0.0, 0.983469));
        this.penguin.setPositionRelativeToVehicle(new Position(3.278, 0.0, 3.512));
        this.penguin.setSize(new Size(0.55, 0.836, 0.432));
        this.snowMan.setPaint(Color.WHITE);
        this.snowMan.setOpacity(1.0);
        this.snowMan.setName("snowMan");
        this.snowMan.setVehicle(scene);
        this.snowMan.setOrientationRelativeToVehicle(new Orientation(0.0, -0.28821, 0.0, 0.957567));
        this.snowMan.setPositionRelativeToVehicle(new Position(-5.484, 0.0, 8.609));
        this.snowWoman.setPaint(Color.WHITE);
        this.snowWoman.setOpacity(1.0);
        this.snowWoman.setName("snowWoman");
        this.snowWoman.setVehicle(scene);
        this.snowWoman.setOrientationRelativeToVehicle(new Orientation(0.0, -0.227879, 0.0, 0.973689));
        this.snowWoman.setPositionRelativeToVehicle(new Position(-6.08, 0.0, 7.714));
        this.yetiBaby.setPaint(Color.WHITE);
        this.yetiBaby.setOpacity(1.0);
        this.yetiBaby.setName("yetiBaby");
        this.yetiBaby.setVehicle(scene);
        this.yetiBaby.setOrientationRelativeToVehicle(new Orientation(0.0, 0.159455, 0.0, 0.987205));
        this.yetiBaby.setPositionRelativeToVehicle(new Position(0.023, 0.0, 6.101));
        this.armoire.setPaint(Color.WHITE);
        this.armoire.setOpacity(1.0);
        this.armoire.setName("armoire");
        this.armoire.setVehicle(scene);
        this.armoire.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.armoire.setPositionRelativeToVehicle(new Position(-3.291, 0.0, 22.656));
        this.humvee.setPaint(Color.WHITE);
        this.humvee.setOpacity(1.0);
        this.humvee.setName("humvee");
        this.humvee.setVehicle(scene);
        this.humvee.setOrientationRelativeToVehicle(new Orientation(0.0, -0.999125, 0.0, 0.041824));
        this.humvee.setPositionRelativeToVehicle(new Position(-6.903, 0.0, -8.521));
        this.teenPerson.setPaint(Color.WHITE);
        this.teenPerson.setOpacity(0.0);
        this.teenPerson.setName("teenPerson");
        this.teenPerson.setVehicle(scene);
        this.teenPerson.setOrientationRelativeToVehicle(new Orientation(0.0, -0.983964, 0.0, 0.178367));
        this.teenPerson.setPositionRelativeToVehicle(new Position(-6.903, 0.0, -8.521));
        this.bear.setPaint(Color.WHITE);
        this.bear.setOpacity(1.0);
        this.bear.setName("bear");
        this.bear.setVehicle(scene);
        this.bear.setOrientationRelativeToVehicle(new Orientation(0.0, 0.335193, 0.0, 0.942149));
        this.bear.setPositionRelativeToVehicle(new Position(0.224, 0.0, -6.244));
        this.gardenGnome.setPaint(Color.WHITE);
        this.gardenGnome.setOpacity(0.0);
        this.gardenGnome.setName("gardenGnome");
        this.gardenGnome.setVehicle(scene);
        this.gardenGnome.setOrientationRelativeToVehicle(new Orientation(0.0, -0.074737, 0.0, 0.997203));
        this.gardenGnome.setPositionRelativeToVehicle(new Position(-3.488, 0.0, -1.354));
        this.gardenGnome.setSize(new Size(2.595, 4.381, 1.371));
        this.santa.setPaint(Color.WHITE);
        this.santa.setOpacity(1.0);
        this.santa.setName("santa");
        this.santa.setVehicle(scene);
        this.santa.setOrientationRelativeToVehicle(new Orientation(0.214293, -0.658853, 0.687872, 0.216387));
        this.santa.setPositionRelativeToVehicle(new Position(-0.14, 0.0, 18.414));
        this.santa.setSize(new Size(1.0, 0.359, 1.436));
    }
}
