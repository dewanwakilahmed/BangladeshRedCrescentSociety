package donorpkg.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import static mainpkg.utilities.ViewUtility.loadView;
import authenticationpkg.models.Session;
import authenticationpkg.models.User;

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
    private void onViewOngoingCampaignsButtonAction(ActionEvent event) throws Exception {
        loadView("ViewOngoingCampaignsScene", event);
    }

    @FXML
    private void onMakeFinancialDonationsButtonAction(ActionEvent event) throws Exception {
        loadView("MakeFinancialDonationsScene", event);
    }

    @FXML
    private void onMakeGoodsDonationsButtonAction(ActionEvent event) throws Exception{
        loadView("MakeGoodsDonationsScene", event);
    }

    @FXML
    private void onViewPastDonationsButtonAction(ActionEvent event) throws Exception {
        loadView("ViewPastDonationsScene", event);
    }

    @FXML
    private void onGenerateTaxReceiptButtonAction(ActionEvent event) throws Exception {
        loadView("GenerateTaxReceiptScene", event);
    }

    @FXML
    private void onUpdateProfileButtonAction(ActionEvent event) throws Exception {
        loadView("UpdateProfileScene", event);
    }

    @FXML
    private void onViewOrganizationProfileButtonAction(ActionEvent event) throws Exception {
        loadView("ViewOrganizationProfileScene", event);
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
