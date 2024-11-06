import java.util.ArrayList;
import java.util.List;

public class PasswordManager {
    private List<Password> passwordList;

    // Constructor
    public PasswordManager() {
        passwordList = new ArrayList<>();
    }

    // Add a password
    public void addPassword(String password) {
        Password newPassword = new Password(password);
        passwordList.add(newPassword);
    }

    // Change password
    public boolean changePassword(String oldPassword, String newPassword) {
        for (Password password : passwordList) {
            if (password.decryptPassword().equals(oldPassword)) {
                password.setPassword(newPassword);
                return true;
            }
        }
        return false; // Password not found
    }

    // Delete password
    public boolean deletePassword(String password) {
        for (Password p : passwordList) {
            if (p.decryptPassword().equals(password)) {
                passwordList.remove(p);
                return true;
            }
        }
        return false; // Password not found
    }

    // Get all passwords (for display)
    public List<String> getAllPasswords() {
        List<String> passwords = new ArrayList<>();
        for (Password p : passwordList) {
            passwords.add(p.decryptPassword());
        }
        return passwords;
    }
}
