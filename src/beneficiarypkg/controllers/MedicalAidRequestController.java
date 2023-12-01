package beneficiarypkg.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author dewan
 */
public class MedicalAidRequestController implements Initializable {

    @FXML
    private TextArea medicalAilmentDescriptionTextArea;
    @FXML
    private ComboBox<?> medicalProfessionalComboBox;
    @FXML
    private DatePicker preferredDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onRequestMedicalAidButtonAction(ActionEvent event) {
    }

    @FXML
    private void onBackToDashboardButtonAction(ActionEvent event) {
    }
    
}
