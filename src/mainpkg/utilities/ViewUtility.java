package mainpkg.utilities;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import authenticationpkg.models.Session;
import authenticationpkg.models.User;

/**
 *
 * @author dewan
 */
public class ViewUtility {

    public static void loadView(String viewName, ActionEvent event) throws Exception {
        if (event != null) {
            Node source = (Node) event.getSource();
            Stage currentStage = (Stage) source.getScene().getWindow();
            currentStage.close();
        }   
        
        String viewFilePath = createViewFilePath(viewName);
        Image icon = new Image("/resources/icons/bdrcs-logo.png");
        
        Parent root = FXMLLoader.load(ViewUtility.class.getResource(viewFilePath));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        
        stage.getIcons().add(icon);
        stage.setTitle(viewName + " - Bangladesh Red Crescent Society");
        stage.setScene(scene);
        stage.show();
    }
    
    public static String createViewFilePath(String viewName) {
        String viewFilePath = new String("/resources/scenes");

        String userType = "";
        
        Session session = Session.getInstance();
        
        if (viewName.equals("UpdateUserProfileScene")) {
            viewFilePath = "/resources/scenes/UpdateUserProfileScene.fxml";
            return viewFilePath;
        }
        
        if (session !=  null) {
            userType = session.getUser().getUserRole().toLowerCase();
            viewFilePath = viewFilePath.concat("/");
        }
        
        viewFilePath = viewFilePath.concat(userType + "/" + viewName + ".fxml");
        
        return viewFilePath;
    }
    
    public static void loadUserDashboard(ActionEvent event) throws Exception {
        User authenticatedUser = Session.getInstance().getUser();
        String sceneName = authenticatedUser.getUserRole() + "DashboardScene";
        loadView(sceneName, event);
    }
    
}
