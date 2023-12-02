package beneficiarypkg.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author dewan
 */
public class GoodsAidRequestController implements Initializable {

    @FXML
    private TextField deliveryAddressTextField;
    @FXML
    private TextField riceAmountTextField;
    @FXML
    private TextField lentilsAmountTextField;
    @FXML
    private TextField oilAmountTextField;
    @FXML
    private TextField saltAmountTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onRequestPackageButtonAction(ActionEvent event) {
    }

    @FXML
    private void onBackToDashboardButtonAction(ActionEvent event) {
    }
    
}
