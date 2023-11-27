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

import static authenticationpkg.utilities.AuthenticationUtility.makeSwitch;

/**
 * FXML Controller class
 *
 * @author dewan
 */
public class AuthenticationController implements Initializable {

    @FXML
    private Text titleText;
    @FXML
    private ComboBox<?> userRoleComboBox;
    @FXML
    private TextField userNameTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label retypePasswordLabel;
    @FXML
    private PasswordField retypePasswordField;
    @FXML
    private Button authButton;
    @FXML
    private Label switchLabel;
    @FXML
    private Button switchButton;
    
    private boolean isLoginMode;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        isLoginMode = true;        
        if (isLoginMode) {
            makeSwitch(titleText, "Login to your Account", retypePasswordLabel, false, retypePasswordField, false, authButton, "Login", switchLabel, "Don't have an account?", switchButton, "Register");
        }
    }    

    @FXML
    private void handleAuth(ActionEvent event) {
    }

    @FXML
    private void switchMode(ActionEvent event) {
        isLoginMode = !isLoginMode;

        if (isLoginMode) {
            makeSwitch(titleText, "Login to your Account", retypePasswordLabel, false, retypePasswordField, false, authButton, "Login", switchLabel, "Don't have an account?", switchButton, "Register");
        } else {
            makeSwitch(titleText, "Register a New Account", retypePasswordLabel, true, retypePasswordField, true, authButton, "Register", switchLabel, "Already have an account?", switchButton, "Login");
        }
    }
    
}
