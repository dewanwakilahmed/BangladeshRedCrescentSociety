package mainpkg.utilities;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author dewan
 */
public class View {

    public static void loadView(String viewName, ActionEvent event) throws Exception {
        if (event != null) {
            Node source = (Node) event.getSource();
            Stage currentStage = (Stage) source.getScene().getWindow();
            currentStage.close();
        }
        
        String viewFilePath = createViewFilePath(viewName);
        
        Parent root = FXMLLoader.load(View.class.getResource(viewFilePath));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        
        stage.setTitle(viewName + " - Bangladesh Red Crescent Society");
        stage.setScene(scene);
        stage.show();
    }
    
    public static String createViewFilePath(String viewName) {
        String pkgName = viewName.toLowerCase() + "pkg";
        
        if (viewName.equals("Welcome")) {
            pkgName = "mainpkg";
        }
        
        String viewFilePath = "/" + pkgName + "/views/" + viewName.toLowerCase() + "-view.fxml";
        
        return viewFilePath;
    }

}
