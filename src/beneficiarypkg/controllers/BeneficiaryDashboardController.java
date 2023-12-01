package beneficiarypkg.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author dewan
 */
public class BeneficiaryDashboardController implements Initializable {

    @FXML
    private Text dashboardTitle;
    @FXML
    private Text welcomeText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onUpdateUserProfileButtonAction(ActionEvent event) {
    }

    @FXML
    private void onFinancialAidRequestButtonAction(ActionEvent event) {
    }

    @FXML
    private void onGoodsAidRequestButtonAction(ActionEvent event) {
    }

    @FXML
    private void onMedicalAidRequestButtonAction(ActionEvent event) {
    }

    @FXML
    private void onShelterRequestButtonAction(ActionEvent event) {
    }

    @FXML
    private void onViewPastRequestsButtonAction(ActionEvent event) {
    }

    @FXML
    private void onShelterCheckInOrOutButtonAction(ActionEvent event) {
    }

    @FXML
    private void onLogOutButtonAction(ActionEvent event) {
    }
    
}
