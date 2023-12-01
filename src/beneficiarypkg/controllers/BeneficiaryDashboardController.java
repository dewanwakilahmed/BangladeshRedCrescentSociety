package beneficiarypkg.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import authenticationpkg.models.Session;
import authenticationpkg.models.User;
import static mainpkg.utilities.ViewUtility.loadView;

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

    private User authenticatedUser;
    private String authenticatedUserName;
    private String authenticatedUserRole;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        authenticatedUser = Session.getInstance().getUser();
        authenticatedUserName = authenticatedUser.getUserName();
        authenticatedUserRole = authenticatedUser.getUserRole();
        
        dashboardTitle.setText(authenticatedUserRole + " Dashboard");
        welcomeText.setText("Welcome " + authenticatedUserName);
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
    private void onLogOutButtonAction(ActionEvent event) throws Exception {
        Session.closeSession();
        
        System.out.println(authenticatedUser.toString() + " has been logged out successfully!");
        
        authenticatedUser = null;
        authenticatedUserName = null;
        authenticatedUserRole = null;
        
        loadView("AuthenticationScene", event);
    }
    
}
