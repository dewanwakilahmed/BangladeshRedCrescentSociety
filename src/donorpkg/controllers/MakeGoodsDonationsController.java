package donorpkg.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import authenticationpkg.models.User;
import authenticationpkg.models.Session;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import static mainpkg.utilities.AlertUtility.showConfirmation;
import static mainpkg.utilities.AlertUtility.showError;
import static mainpkg.utilities.ViewUtility.loadUserDashboard;

/**
 * FXML Controller class
 *
 * @author dewan
 */
public class MakeGoodsDonationsController implements Initializable {

    @FXML
    private TextField pickUpAddressTextField;
    @FXML
    private TextField riceAmountTextField;
    @FXML
    private TextField lentilsAmountTextField;
    @FXML
    private TextField oilAmountTextField;
    @FXML
    private TextField saltAmountTextField;
    
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
                    pickUpAddressTextField.setText(data[5]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onDonatePackageButtonAction(ActionEvent event) {
        int riceAmount = 0;
        int lentilsAmount = 0;
        int oilAmount = 0;
        int saltAmount = 0;
        
        if (riceAmountTextField.getText() != null) {
            riceAmount = Integer.parseInt(riceAmountTextField.getText());
        }
        
        if (lentilsAmountTextField.getText() != null) {
            lentilsAmount = Integer.parseInt(lentilsAmountTextField.getText());
        }
        
        if (oilAmountTextField.getText() != null) {
            oilAmount = Integer.parseInt(oilAmountTextField.getText());
        }
        
        if (saltAmountTextField.getText() != null) {
            saltAmount = Integer.parseInt(saltAmountTextField.getText());
        }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/resources/data/goods-donations.txt", true))) {
            writer.write(authenticatedUser.getUserName() + "  " + 
                         authenticatedUser.getUserRole() + "  " + 
                         LocalDate.now() + "  " + 
                         pickUpAddressTextField.getText() + "  " + 
                         riceAmount + "  " +
                         lentilsAmount + "  " +
                         oilAmount + "  " +
                         saltAmount + "  " + "Pending\n");
            writer.flush();
            showConfirmation("A goods donation package consisting of Rice: " + riceAmount + "kg, " + "Lentils: " + lentilsAmount + "kg, " + "Oil: " + oilAmount + "kg, " + "Salt: " + saltAmount + "kg will be picked up soon from your pickup location. Thank you!");
        } catch (IOException e) {
            showError("An error occurred while writing to the data file!");
        }
    }

    @FXML
    private void onBackToDashboardButtonAction(ActionEvent event) throws Exception {
        loadUserDashboard(event);
    }

}
