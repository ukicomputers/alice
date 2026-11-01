import org.lgna.story.SProgram;

class Program extends SProgram {
    private Scene scene1;
    private Scene2 scene2;

    public void createScene1() {
        scene1 = new Scene();

        scene1.onFinished = () -> {
            createScene2();
        };

        setActiveScene(scene1);
    }

    public void createScene2() {
        scene2 = new Scene2();

        scene2.restart = () -> {
            createScene2();
        };

        setActiveScene(scene2);
    }

    public static void main(String[] args) {
        Program program = new Program();

        program.initializeInFrame(args);
        program.createScene1();
    }
}
