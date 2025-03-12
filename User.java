public class User {
    private String userID;
    private String password;
    private String registerDate;

    //Constructor
    public User(String userID, String password, String registerDate) {
        this.userID = userID;
        this.password = password;
        this.registerDate = registerDate;
    }

    //Getter and Setter methods
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public boolean verifyLogin() {
        // Logic for verifying login (Placeholder return)
        return true;
    }

    public boolean login() {
        //Logic for logging in (Placeholder return)
        return true;
    }

    public boolean logout() {
        //Logic for logging out (Placeholder return)
        return true;
    }
}
