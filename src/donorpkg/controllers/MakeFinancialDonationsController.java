package donorpkg.controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import authenticationpkg.models.Session;
import authenticationpkg.models.User;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import static mainpkg.utilities.AlertUtility.showConfirmation;
import static mainpkg.utilities.AlertUtility.showError;
import static mainpkg.utilities.ViewUtility.loadUserDashboard;

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
    private ComboBox<String> selectCampaignComboBox;
    @FXML
    private TextField contributionAmountTextField;
    @FXML
    private TextField donationAmountTextField;
    
    private User authenticatedUser;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        authenticatedUser = Session.getInstance().getUser();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("src/resources/data/user-profiles.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("  ");
                if (data[0].equals(authenticatedUser.getUserName()) && data[2].equals(authenticatedUser.getUserRole())) {
                    bankNameTextField.setText(data[6]);
                    accountNumberTextField.setText(data[7]);
                    routingNumberTextField.setText(data[8]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        List<String> campaigns = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/resources/data/campaigns.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("  ");
                campaigns.add(data[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        selectCampaignComboBox.setItems(FXCollections.observableArrayList(campaigns));
        selectCampaignComboBox.getSelectionModel().selectFirst();
    }    

    @FXML
    private void onContributeButtonAction(ActionEvent event) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/resources/data/campaign-contributions.txt", true))) {
            writer.write(authenticatedUser.getUserName() + "  " + 
                         authenticatedUser.getUserRole() + "  " + 
                         LocalDate.now() + "  " + 
                         bankNameTextField.getText() + "  " +
                         accountNumberTextField.getText() + "  " +
                         routingNumberTextField.getText() + "  " +
                         selectCampaignComboBox.getValue() + "  " + 
                         contributionAmountTextField.getText() + "  " + "pending\n");
            writer.flush();
            showConfirmation("A donation of " + contributionAmountTextField.getText() + "BDT has been made to '" + selectCampaignComboBox.getValue() + "' campaign. Thank you!");
        } catch (IOException e) {
            showError("An error occurred while writing to the data file!");
        }
    }

    @FXML
    private void onMakeDonationButtonAction(ActionEvent event) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/resources/data/personal-donations.txt", true))) {
            writer.write(authenticatedUser.getUserName() + "  " + 
                         authenticatedUser.getUserRole() + "  " + 
                         LocalDate.now() + "  " + 
                         bankNameTextField.getText() + "  " +
                         accountNumberTextField.getText() + "  " +
                         routingNumberTextField.getText() + "  " +
                         donationAmountTextField.getText() + "  " + "pending\n");
            writer.flush();
            showConfirmation("A personal donation of " + donationAmountTextField.getText() + "BDT has been made. Thank you!");
        } catch (IOException e) {
            showError("An error occurred while writing to the data file!");
        }
    }

    @FXML
    private void onGoBackButtonAction(ActionEvent event) throws Exception {
        loadUserDashboard(event);
    }
    
}
