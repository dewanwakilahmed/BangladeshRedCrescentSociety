package mainpkg;

import javafx.application.Application;
import javafx.stage.Stage;
import static mainpkg.utilities.ViewUtility.loadView;

/**
 *
 * @author dewan
 */
public class MainApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
       loadView("WelcomeScene", null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
