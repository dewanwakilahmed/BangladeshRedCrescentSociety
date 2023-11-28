package authenticationpkg.models;

/**
 *
 * @author dewan
 */
public class User {
    private String userName;
    private String userPassword;
    private String userRole;

    public User(String userName, String userPassword, String userRole) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRole = userRole;
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

    @Override
    public String toString() {
        return "User{" + "userName=" + userName + ", userPassword=" + userPassword + ", userRole=" + userRole + '}';
    }  
   
}
