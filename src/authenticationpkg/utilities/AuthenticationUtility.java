package authenticationpkg.utilities;

import authenticationpkg.models.User;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import static mainpkg.utilities.ErrorUtility.showError;

/**
 *
 * @author dewan
 */
public class AuthenticationUtility {
    
    public static void makeSwitch(Text titleText, String newTitleText, Label retypePasswordLabel, boolean isRetypePasswordLabelVisible, PasswordField retypePasswordField, boolean isRetypePasswordFieldVisible, Button authButton, String newAuthButtonText, Label switchLabel, String newSwitchLabelText, Button switchButton, String newSwitchButtonText) {
        titleText.setText(newTitleText);
        retypePasswordLabel.setVisible(isRetypePasswordLabelVisible);
        retypePasswordField.setVisible(isRetypePasswordFieldVisible);
        authButton.setText(newAuthButtonText);
        switchLabel.setText(newSwitchLabelText);
        switchButton.setText(newSwitchButtonText);
    }
    
    public static boolean validateInput(TextField userNameTextField, PasswordField passwordField, ComboBox<String> userRoleComboBox, boolean isLoginMode, TextField retypePasswordField) {
        if (userRoleComboBox.getValue() == null) {
            showError("User role needs to be selected!");
            return false;
        }
        
        if (userNameTextField.getText().isEmpty()) {
            showError("User name can not be empty!");
            return false;
        }
        
        if (passwordField.getText().isEmpty()) {
            showError("Password can not be empty!");
            return false;
        }

        if (!isLoginMode) {
            if (retypePasswordField.getText().isEmpty()) {
                showError("Please type your password again!");
                return false;
            }

            if (!passwordField.getText().equals(retypePasswordField.getText())) {
                showError("Passwords do not match!");
                return false;
            }
        }

        return true;
    }
    
}
