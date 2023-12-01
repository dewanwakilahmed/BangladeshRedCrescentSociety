package beneficiarypkg.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author dewan
 */
public class FinancialAidRequestController implements Initializable {

    @FXML
    private TextField bankNameTextField;
    @FXML
    private TextField accountNumberTextField;
    @FXML
    private TextField routingNumberTextField;
    @FXML
    private TextField aidAmountTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onRequestAidButtonAction(ActionEvent event) {
    }

    @FXML
    private void onBackToDashboardButtonAction(ActionEvent event) {
    }
    
}
