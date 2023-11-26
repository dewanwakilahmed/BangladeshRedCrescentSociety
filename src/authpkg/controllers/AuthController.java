package authpkg.controllers;

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
public class AuthController implements Initializable {

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
        // TODO
    }    

    @FXML
    private void handleAuth(ActionEvent event) {
    }

    @FXML
    private void switchMode(ActionEvent event) {
    }
    
}
