package beneficiarypkg.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author dewan
 */
public class ShelterCheckInOrOutController implements Initializable {

    @FXML
    private Text checkInOrOutTitle;
    @FXML
    private Text shelterRequestStatusMessage;
    @FXML
    private TextField shelterNameTextField;
    @FXML
    private DatePicker checkInDatePicker;
    @FXML
    private DatePicker checkOutDatePicker;
    @FXML
    private Button shelterCheckInOrOutButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onShelterCheckInOrOutButtonAction(ActionEvent event) {
    }

    @FXML
    private void onBackToDashboardButtonAction(ActionEvent event) {
    }
    
}
