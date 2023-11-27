package mainpkg.utilities;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

/**
 *
 * @author dewan
 */
public class InitializeViewsUtility {
    
    public static void loadComboBox(ComboBox comboBoxName, String[] contentArray) {
        ObservableList<String> contentArrayList = FXCollections.observableArrayList(contentArray);
        comboBoxName.setItems(contentArrayList);
        comboBoxName.getSelectionModel().selectFirst();
    }
    
}
