package authenticationpkg.models;

import java.time.LocalDateTime;

/**
 *
 * @author dewan
 */
public class Session {
    
    private static Session instance = null;
    private User user;
    private LocalDateTime loginTime;

    private Session(User user) {
        this.user = user;
        this.loginTime = LocalDateTime.now();
    }

    public static void setInstance(User user) {
        if (instance == null) {
            instance = new Session(user);
        }
    }
    
    public static void closeSession() {
        instance = null;
    }

    public static Session getInstance() {
        return instance;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getLoginTime() {
        return loginTime;
    }
    
}
