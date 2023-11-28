package donorpkg.controllers;

import authenticationpkg.models.Session;
import authenticationpkg.models.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import static mainpkg.utilities.ViewUtility.loadView;

/**
 * FXML Controller class
 *
 * @author dewan
 */
public class DonorController implements Initializable {

    @FXML
    private Label welcomeMessage;
    @FXML
    private TableView<?> campaignsTable;
    @FXML
    private TableColumn<?, ?> titleColumn;
    @FXML
    private TableColumn<?, ?> goalColumn;
    @FXML
    private TableColumn<?, ?> contributedColumn;
    @FXML
    private TableColumn<?, ?> openedOnColumn;
    @FXML
    private TableColumn<?, ?> closingInColumn;
    @FXML
    private TableColumn<?, ?> actionColumn;
    @FXML
    private TextField bankNameField;
    @FXML
    private TextField accountNumberField;
    @FXML
    private TextField routingNumberField;
    @FXML
    private ComboBox<?> campaignComboBox;
    @FXML
    private TextField campaignContributionField;
    @FXML
    private TextField personalDonationField;
    @FXML
    private TextField pickupAddressField;
    @FXML
    private ComboBox<?> itemComboBox;
    @FXML
    private TextField amountField;
    @FXML
    private TableView<?> itemsTable;
    @FXML
    private TableColumn<?, ?> noColumn;
    @FXML
    private TableColumn<?, ?> itemColumn;
    @FXML
    private TableColumn<?, ?> amountColumn;
    
    private Session session;
    User user = null;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        session = session.getInstance();
        user = session.getUser();
        
        welcomeMessage.setText("Welcome " + user.getUserName());
    }    

    @FXML
    private void logout(ActionEvent event) throws Exception {
        Session.closeSession();
        session = session.getInstance();
        
        System.out.println(user.toString() + " has been logged out successfully!");
        
        user = null;
        
        loadView("Authentication", event);
    }

    @FXML
    private void contributeToCampaign(ActionEvent event) {
    }

    @FXML
    private void makePersonalDonation(ActionEvent event) {
    }

    @FXML
    private void addItem(ActionEvent event) {
    }

    @FXML
    private void donatePackage(ActionEvent event) {
    }
    
}
