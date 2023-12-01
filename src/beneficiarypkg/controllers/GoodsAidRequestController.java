package beneficiarypkg.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
    private ComboBox<?> goodsItemComboBox;
    @FXML
    private TextField goodsAmountTextField;
    @FXML
    private TableView<?> goodsPackageTableView;
    @FXML
    private TableColumn<?, ?> goodsPackageItemTableColumn;
    @FXML
    private TableColumn<?, ?> goodsPackageItemAmountTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onAddToPackageButtonAction(ActionEvent event) {
    }

    @FXML
    private void onRequestPackageButtonAction(ActionEvent event) {
    }

    @FXML
    private void onBackToDashboardButtonAction(ActionEvent event) {
    }
    
}
