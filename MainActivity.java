import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputPassword;
    private TextView displayPassword;
    private PasswordManager passwordManager;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputPassword = findViewById(R.id.inputPassword);
        displayPassword = findViewById(R.id.displayPassword);
        passwordManager = new PasswordManager(); // Initialize the password manager

        Button addPasswordBtn = findViewById(R.id.addPasswordBtn);
        Button changePasswordBtn = findViewById(R.id.changePasswordBtn);
        Button deletePasswordBtn = findViewById(R.id.deletePasswordBtn);

        // Add password
        addPasswordBtn.setOnClickListener(view -> addPassword());

        // Change password
        changePasswordBtn.setOnClickListener(view -> changePassword());

        // Delete password
        deletePasswordBtn.setOnClickListener(view -> deletePassword());
    }

    // Add password to the list
    private void addPassword() {
        String password = inputPassword.getText().toString().trim();
        if (!TextUtils.isEmpty(password)) {
            passwordManager.addPassword(password); // Add password
            displayPassword.setText("Password Added.");
            inputPassword.setText("");
            Toast.makeText(this, "Password Added Successfully", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Enter a password", Toast.LENGTH_SHORT).show();
        }
    }

    // Change the password
    private void changePassword() {
        String oldPassword = inputPassword.getText().toString().trim();
        String newPassword = inputPassword.getText().toString().trim();
        if (!TextUtils.isEmpty(oldPassword) && !TextUtils.isEmpty(newPassword)) {
            boolean isChanged = passwordManager.changePassword(oldPassword, newPassword);
            if (isChanged) {
                displayPassword.setText("Password Changed.");
                Toast.makeText(this, "Password Changed Successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Old password not found", Toast.LENGTH_SHORT).show();
            }
            inputPassword.setText("");
        }
    }

    // Delete password from the list
    private void deletePassword() {
        String password = inputPassword.getText().toString().trim();
        if (!TextUtils.isEmpty(password)) {
            boolean isDeleted = passwordManager.deletePassword(password);
            if (isDeleted) {
                displayPassword.setText("Password Deleted.");
                Toast.makeText(this, "Password Deleted Successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Password not found", Toast.LENGTH_SHORT).show();
            }
            inputPassword.setText("");
        }
    }
}
