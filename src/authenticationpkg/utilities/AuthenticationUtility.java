package authenticationpkg.utilities;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;

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
    
}
