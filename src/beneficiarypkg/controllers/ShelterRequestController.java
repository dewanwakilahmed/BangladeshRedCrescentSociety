package beneficiarypkg.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

/**
 * FXML Controller class
 *
 * @author dewan
 */
public class ShelterRequestController implements Initializable {

    @FXML
    private ComboBox<?> shelterComboBox;
    @FXML
    private DatePicker possibleCheckInDatePicker;
    @FXML
    private DatePicker possibleCheckOutDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onRequestShelterButtonAction(ActionEvent event) {
    }

    @FXML
    private void onBackToDashboardButtonAction(ActionEvent event) {
    }
    
}
