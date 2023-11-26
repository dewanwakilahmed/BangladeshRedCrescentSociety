package mainpkg.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import static mainpkg.utilities.View.loadView;

/**
 * FXML Controller class
 *
 * @author dewan
 */
public class WelcomeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void loadAuthView(ActionEvent event) throws Exception {
        loadView("Auth", event);
    }

}
