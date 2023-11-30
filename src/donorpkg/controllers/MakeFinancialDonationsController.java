package donorpkg.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author dewan
 */
public class MakeFinancialDonationsController implements Initializable {

    @FXML
    private TextField bankNameTextField;
    @FXML
    private TextField accountNumberTextField;
    @FXML
    private TextField routingNumberTextField;
    @FXML
    private ComboBox<?> selectCampaignComboBox;
    @FXML
    private TextField contributionAmountTextField;
    @FXML
    private TextField donationAmountTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onContributeButtonAction(ActionEvent event) {
    }

    @FXML
    private void onMakeDonationButtonAction(ActionEvent event) {
    }

    @FXML
    private void onGoBackButtonAction(ActionEvent event) throws Exception {
    }
    
}
