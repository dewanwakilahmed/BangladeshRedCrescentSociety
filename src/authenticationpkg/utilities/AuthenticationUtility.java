package authenticationpkg.utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import authenticationpkg.models.Session;
import authenticationpkg.models.User;
import javafx.scene.layout.HBox;
import static mainpkg.utilities.ErrorUtility.showError;
import static mainpkg.utilities.ViewUtility.loadView;

/**
 *
 * @author dewan
 */
public class AuthenticationUtility {
    
    public static void makeSwitch(Text titleText, String newTitleText, HBox retypePasswordHBox, boolean isRetypePasswordHBoxVisible, Button authButton, String newAuthButtonText, Label switchLabel, String newSwitchLabelText, Button switchButton, String newSwitchButtonText) {
        titleText.setText(newTitleText);
        retypePasswordHBox.setVisible(isRetypePasswordHBoxVisible);
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
    
    public static User findUser(TextField userNameTextField, ComboBox<String> userRoleComboBox) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/resources/data/registered-users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("  ");
                if (data[0].equals(userNameTextField.getText()) && data[2].equals(userRoleComboBox.getValue())) {
                    return new User(data[0], data[1], data[2]);
                }
            }
        } catch (IOException e) {
            showError("An error occurred while reading the data file!");
            return null;
        }

        return null;
    }
    
    public static User loginUser(User user, PasswordField passwordField) {
        if (user != null) {
            if (user.getUserPassword().equals(passwordField.getText())) {
                System.out.println(user.toString() + " has been logged in successfully!");
                return user;
            } else {
                showError("Incorrect Password!");
                return null;
            }
        } else {
            showError("User not found!");
            return null;
        }
    }
    
    public static User registerUser(User user, TextField userNameTextField, PasswordField passwordField, ComboBox<String> userRoleComboBox) {
        if (user != null) {
            showError("User already exists!");
            return null;
        } else {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/resources/data/registered-users.txt", true))) {
                writer.write(userNameTextField.getText() + "  " + passwordField.getText() + "  " + userRoleComboBox.getValue() + "\n");
                writer.flush();            
                user = findUser(userNameTextField, userRoleComboBox);
                System.out.println(user.toString() + " has been registered successfully!");
                return user;
            } catch (IOException e) {
                showError("An error occurred while writing to the data file!");
                return null;
            }
        }
    }
    
    public static void authenticateUser(User user, ActionEvent event) throws Exception {        
        Session.setInstance(user);
        
        if (Session.getInstance() != null) {
            User authenticatedUser = Session.getInstance().getUser();
            System.out.println(authenticatedUser.toString() + " has been authenticated successfully!");
            String sceneName = user.getUserRole() + "DashboardScene";
            loadView(sceneName, event);
        } else {
            System.out.println("User can not be authenticated at the moment!");
            showError("User can not be authenticated at the moment!");
        }
    }
    
}
