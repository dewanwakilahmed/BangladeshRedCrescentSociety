package donorpkg.controllers;

import authenticationpkg.models.Session;
import authenticationpkg.models.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import static mainpkg.utilities.ViewUtility.loadView;

/**
 * FXML Controller class
 *
 * @author dewan
 */
public class DonorDashboardController implements Initializable {

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
    private void viewOngoingCampaigns(ActionEvent event) {
    }

    @FXML
    private void makeFinancialDonations(ActionEvent event) {
    }

    @FXML
    private void makeGoodsDonations(ActionEvent event) {
    }

    @FXML
    private void viewPastDonations(ActionEvent event) {
    }

    @FXML
    private void generateTaxReceipt(ActionEvent event) {
    }

    @FXML
    private void updateProfile(ActionEvent event) {
    }

    @FXML
    private void viewOrganizationProfile(ActionEvent event) {
    }

    @FXML
    private void logOut(ActionEvent event) throws Exception {
        Session.closeSession();
        
        System.out.println(authenticatedUser.toString() + " has been logged out successfully!");
        
        authenticatedUser = null;
        authenticatedUserName = null;
        authenticatedUserRole = null;
        
        loadView("AuthenticationScene", event);
    }
    
}
