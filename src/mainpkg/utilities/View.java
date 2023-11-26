package mainpkg.utilities;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author dewan
 */
public class View {

    public static void loadView(String viewName) throws Exception {
        String viewFilePath = "/mainpkg/views/" + viewName.toLowerCase() + "-view.fxml";

        Parent root = FXMLLoader.load(View.class.getResource(viewFilePath));
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setTitle(viewName + " - Bangladesh Red Crescent Society");
        stage.setScene(scene);
        stage.show();
    }

}
