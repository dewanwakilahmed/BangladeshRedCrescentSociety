package mainpkg.utilities;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author dewan
 */
public class AlertUtility {
    
    public static void showError(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);

        Stage alertStage = (Stage) alert.getDialogPane().getScene().getWindow();
        alertStage.getIcons().add(new Image("/resources/icons/error-logo.png"));

        alert.showAndWait();
    }
    
    public static void showConfirmation(String message) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText(message);

        Stage alertStage = (Stage) alert.getDialogPane().getScene().getWindow();
//        alertStage.getIcons().add(new Image("/resources/icons/error-logo.png"));

        alert.showAndWait();
    }    
}
