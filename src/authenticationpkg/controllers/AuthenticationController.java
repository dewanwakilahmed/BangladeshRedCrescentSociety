package authenticationpkg.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;
import authenticationpkg.models.User;
import static mainpkg.utilities.InitializeViewsUtility.loadComboBox;
import static authenticationpkg.utilities.AuthenticationUtility.findUser;
import static authenticationpkg.utilities.AuthenticationUtility.loginUser;
import static authenticationpkg.utilities.AuthenticationUtility.makeSwitch;
import static authenticationpkg.utilities.AuthenticationUtility.registerUser;
import static authenticationpkg.utilities.AuthenticationUtility.validateInput;
import static authenticationpkg.utilities.AuthenticationUtility.authenticateUser;

/**
 * FXML Controller class
 *
 * @author dewan
 */
public class AuthenticationController implements Initializable {

    @FXML
    private Text titleText;
    @FXML
    private ComboBox<String> userRoleComboBox;
    @FXML
    private TextField userNameTextField;
    @FXML
    private PasswordField retypePasswordField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button authButton;
    @FXML
    private Label switchLabel;
    @FXML
    private Button switchButton;
    @FXML
    private HBox retypePasswordHBox;
    
    private boolean isLoginMode;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        isLoginMode = true;        
        if (isLoginMode) {
            makeSwitch(titleText, "Login to your Account", retypePasswordHBox, false, authButton, "Login", switchLabel, "Don't have an account?", switchButton, "Register");
        }
        
        String[] userRolesArray = {"Donor", "Beneficiary", "Admin", "Staff", "Accounts Manager", "Inventory Manager", "Shelter Manager", "Medical Professional"};     
        loadComboBox(userRoleComboBox, userRolesArray);
    }    

    @FXML
    private void handleAuth(ActionEvent event) throws Exception {
        if (validateInput(userNameTextField, passwordField, userRoleComboBox, isLoginMode, retypePasswordField)) {
            User userToBeAuthenticated = findUser(userNameTextField, userRoleComboBox);
            
            if (isLoginMode) {
                userToBeAuthenticated = loginUser(userToBeAuthenticated, passwordField);
            } else {
                userToBeAuthenticated = registerUser(userToBeAuthenticated, userNameTextField, passwordField, userRoleComboBox);
            }
            
            if (userToBeAuthenticated != null) {
                authenticateUser(userToBeAuthenticated, event);
            }
        }
    }

    @FXML
    private void switchMode(ActionEvent event) {
        isLoginMode = !isLoginMode;

        if (isLoginMode) {
            makeSwitch(titleText, "Login to your Account", retypePasswordHBox, false, authButton, "Login", switchLabel, "Don't have an account?", switchButton, "Register");
        } else {
            makeSwitch(titleText, "Register New Account", retypePasswordHBox, true, authButton, "Register", switchLabel, "Already have an account?", switchButton, "Login");
        }
    }
    
}
