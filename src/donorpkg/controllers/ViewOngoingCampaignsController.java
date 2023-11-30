package donorpkg.controllers;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import javafx.collections.FXCollections;
import javafx.scene.control.cell.PropertyValueFactory;
import donorpkg.models.Campaign;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import static mainpkg.utilities.ViewUtility.loadUserDashboard;
import static mainpkg.utilities.ViewUtility.loadView;

/**
 * FXML Controller class
 *
 * @author dewan
 */
public class ViewOngoingCampaignsController implements Initializable {

    @FXML
    private TableColumn<Campaign, String> campaignTitleTableColumn;
    @FXML
    private TableColumn<Campaign, Integer> campaignGoalTableColumn;
    @FXML
    private TableColumn<Campaign, Integer> campaignContributionsTableColumn;
    @FXML
    private TableColumn<Campaign, LocalDate> campaignOpenedOnTableColumn;
    @FXML
    private TableColumn<Campaign, LocalDate> campaignClosingInTableColumn;
    @FXML
    private TableView<Campaign> ongoingFundraisingCampaignsTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        campaignTitleTableColumn.setCellValueFactory(new PropertyValueFactory<>("campaignTitle"));
        campaignGoalTableColumn.setCellValueFactory(new PropertyValueFactory<>("campaignGoal"));
        campaignContributionsTableColumn.setCellValueFactory(new PropertyValueFactory<>("campaignContributions"));
        campaignOpenedOnTableColumn.setCellValueFactory(new PropertyValueFactory<>("campaignOpenedOn"));
        campaignClosingInTableColumn.setCellValueFactory(new PropertyValueFactory<>("campaignClosingIn"));

        try (BufferedReader reader = new BufferedReader(new FileReader("src/resources/data/campaigns.txt"))) {
            String line;
            List<Campaign> campaigns = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("  ");
                campaigns.add(new Campaign(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), LocalDate.parse(data[3]), LocalDate.parse(data[4])));
            }
            ongoingFundraisingCampaignsTableView.setItems(FXCollections.observableArrayList(campaigns));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    @FXML
    private void onGoBackButtonAction(ActionEvent event) throws Exception {
        loadUserDashboard(event);
    }

    @FXML
    private void onMakeDonationsAction(ActionEvent event) throws Exception {
        loadView("MakeFinancialDonationsScene", event);
    }
    
}
