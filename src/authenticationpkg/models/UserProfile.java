package authenticationpkg.models;

/**
 *
 * @author dewan
 */
public class UserProfile {
    
    private String userName;
    private String userPassword;
    private String userRole;
    private String userFullName;
    private String userEmail;
    private String userAddress;
    private String userBankName;
    private String userAccountNumber;
    private String userRoutingNumber;
    private String userTin;

    public UserProfile(String userName, String userPassword, String userRole, String userFullName, String userEmail, String userAddress, String userBankName, String userAccountNumber, String userRoutingNumber, String userTin) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRole = userRole;
        this.userFullName = userFullName;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.userBankName = userBankName;
        this.userAccountNumber = userAccountNumber;
        this.userRoutingNumber = userRoutingNumber;
        this.userTin = userTin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserBankName() {
        return userBankName;
    }

    public void setUserBankName(String userBankName) {
        this.userBankName = userBankName;
    }

    public String getUserAccountNumber() {
        return userAccountNumber;
    }

    public void setUserAccountNumber(String userAccountNumber) {
        this.userAccountNumber = userAccountNumber;
    }

    public String getUserRoutingNumber() {
        return userRoutingNumber;
    }

    public void setUserRoutingNumber(String userRoutingNumber) {
        this.userRoutingNumber = userRoutingNumber;
    }

    public String getUserTin() {
        return userTin;
    }

    public void setUserTin(String userTin) {
        this.userTin = userTin;
    }

    @Override
    public String toString() {
        return "UserProfile{" + "userName=" + userName + ", userPassword=" + userPassword + ", userRole=" + userRole + ", userFullName=" + userFullName + ", userEmail=" + userEmail + ", userAddress=" + userAddress + ", userBankName=" + userBankName + ", userAccountNumber=" + userAccountNumber + ", userRoutingNumber=" + userRoutingNumber + ", userTin=" + userTin + '}';
    }
    
}
