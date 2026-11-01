import javafx.application.Application;
import javafx.stage.Stage;

// If this project will not build and run make sure it is using
// a JDK that includes JavaFX, such as Bellsoft's Liberica JDK.
public class AliceJavaFXLauncher extends Application {
    private static String[] startingArgs;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Thread thread = new Thread(() -> Program.main(startingArgs));
        thread.start();
    }

    public static void main(final String[] args) {
        startingArgs = args;
        launch(args);
    }
}
