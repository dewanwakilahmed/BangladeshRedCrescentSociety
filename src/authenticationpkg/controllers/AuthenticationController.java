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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        retypePasswordLabel.setVisible(false);
        retypePasswordField.setVisible(false);
    }    

    @FXML
    private void handleAuth(ActionEvent event) {
    }

    @FXML
    private void switchMode(ActionEvent event) {
        if (titleText.getText().equals("Create a New Account")) {
            titleText.setText("Login to your Account");
            retypePasswordLabel.setVisible(false);
            retypePasswordField.setVisible(false);
            authButton.setText("Login");
            switchLabel.setText("Don't have an Account?");
            switchButton.setText("Register");
        } else {            
            titleText.setText("Create a New Account");
            retypePasswordLabel.setVisible(true);
            retypePasswordField.setVisible(true);
            authButton.setText("Register");
            switchLabel.setText("Already have an account?");
            switchButton.setText("Login");
        }
    }
    
}
