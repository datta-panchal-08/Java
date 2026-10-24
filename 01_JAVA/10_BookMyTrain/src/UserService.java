import java.util.HashMap;
import java.util.Map;

public class UserService {

    private Map<String, User> userMap = new HashMap<>();

    private User currentUser = null;

    public boolean registerUser(
            String userName,
            String email,
            String password,
            String fullName,
            String contact
    ) {

        if (userMap.containsKey(email)) {
            System.out.println("Email already registered");
            return false;
        }

        User user = new User(
                userName,
                email,
                password,
                fullName,
                contact
        );

        userMap.put(email, user);

        System.out.println("Registration Successful!");
        return true;
    }

    public boolean loginUser(String email, String password) {

        if (!userMap.containsKey(email)) {
            System.out.println(
                    "No User Found With This Email : " + email
            );
            return false;
        }

        User user = userMap.get(email);

        if (!user.getPassword().equals(password)) {
            System.out.println("Invalid email or password");
            return false;
        }

        currentUser = user;

        System.out.println(
                "Welcome " + currentUser.getFullName() + "!"
        );

        return true;
    }

    public void logoutUser() {

        if (currentUser != null) {
            System.out.println(
                    "Logged Out : " + currentUser.getFullName()
            );
        }

        currentUser = null;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public boolean isLoggedIn() {
        return currentUser != null;
    }
}