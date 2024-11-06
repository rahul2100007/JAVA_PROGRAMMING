public class Password {
    private String password;
    private String encryptedPassword;

    // Constructor
    public Password(String password) {
        this.password = password;
        this.encryptedPassword = encryptPassword(password);
    }

    // Getters and setters
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        this.encryptedPassword = encryptPassword(password);  // Re-encrypt on change
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    // Simple "encryption" (reverse the string)
    private String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    // Simple "decryption" (reverse the string back)
    public String decryptPassword() {
        return new StringBuilder(encryptedPassword).reverse().toString();
    }
}
