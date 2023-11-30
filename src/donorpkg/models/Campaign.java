package donorpkg.models;

import java.time.LocalDate;

/**
 *
 * @author dewan
 */
public class Campaign {
    
    private String campaignTitle;
    private int campaignGoal;
    private int campaignContributions;
    private LocalDate campaignOpenedOn;
    private LocalDate campaignClosingIn;

    public Campaign(String campaignTitle, int campaignGoal, int campaignContributions, LocalDate campaignOpenedOn, LocalDate campaignClosingIn) {
        this.campaignTitle = campaignTitle;
        this.campaignGoal = campaignGoal;
        this.campaignContributions = campaignContributions;
        this.campaignOpenedOn = campaignOpenedOn;
        this.campaignClosingIn = campaignClosingIn;
    }

    public String getCampaignTitle() {
        return campaignTitle;
    }

    public void setCampaignTitle(String campaignTitle) {
        this.campaignTitle = campaignTitle;
    }

    public int getCampaignGoal() {
        return campaignGoal;
    }

    public void setCampaignGoal(int campaignGoal) {
        this.campaignGoal = campaignGoal;
    }

    public int getCampaignContributions() {
        return campaignContributions;
    }

    public void setCampaignContributions(int campaignContributions) {
        this.campaignContributions = campaignContributions;
    }

    public LocalDate getCampaignOpenedOn() {
        return campaignOpenedOn;
    }

    public void setCampaignOpenedOn(LocalDate campaignOpenedOn) {
        this.campaignOpenedOn = campaignOpenedOn;
    }

    public LocalDate getCampaignClosingIn() {
        return campaignClosingIn;
    }

    public void setCampaignClosingIn(LocalDate campaignClosingIn) {
        this.campaignClosingIn = campaignClosingIn;
    }

    @Override
    public String toString() {
        return "Campaign{" + "campaignTitle=" + campaignTitle + ", campaignGoal=" + campaignGoal + ", campaignContributions=" + campaignContributions + ", campaignOpenedOn=" + campaignOpenedOn + ", campaignClosingIn=" + campaignClosingIn + '}';
    }
    
}
