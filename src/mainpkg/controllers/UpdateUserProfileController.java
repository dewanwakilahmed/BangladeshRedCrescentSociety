package donorpkg.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author dewan
 */
public class UpdateProfileController implements Initializable {

    @FXML
    private TextField userNameTextField;
    @FXML
    private PasswordField userPasswordField;
    @FXML
    private TextField fullNameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField bankNameTextField;
    @FXML
    private TextField accountNumberTextField;
    @FXML
    private TextField routingNumberTextField;
    @FXML
    private TextField tinTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onGoBackButtonAction(ActionEvent event) {
    }

    @FXML
    private void onUpdateProfileButtonAction(ActionEvent event) {
    }
    
}
