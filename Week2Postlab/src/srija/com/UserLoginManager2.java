package srija.com;

public class UserLoginManager2 {
	private static UserLoginManager2 instance;
    private boolean loggedIn;

    private UserLoginManager2() {
        loggedIn = false;
    }

    public static UserLoginManager2 getInstance() {
        if (instance == null) {
            instance = new UserLoginManager2();
        }
        return instance;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void logIn() {
        loggedIn = true;
    }

    public void logOut() {
        loggedIn = false;
    }
}
