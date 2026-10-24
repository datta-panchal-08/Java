public class User {

    private String userName;
    private String email;
    private String password;
    private String fullName;
    private String contact;

    public User(
            String userName,
            String email,
            String password,
            String fullName,
            String contact
    ) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.contact = contact;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return fullName + " (" + userName + ")";
    }
}