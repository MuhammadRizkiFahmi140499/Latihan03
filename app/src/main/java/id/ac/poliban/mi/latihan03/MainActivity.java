package id.ac.poliban.mi.latihan03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edUserName = findViewById(R.id.edUserName);
        EditText edPassword = findViewById(R.id.edPassword);
        Button btClear = findViewById(R.id.btClear);
        Button btLogin = findViewById(R.id.btLogin);

        btClear.setOnClickListener(view -> {
            //mengosongkan EditText
            edUserName.setText("");
            edPassword.setText("");

            //meletakkan korsur di edUSerName
            edUserName.requestFocus();
            Toast.makeText(this, "complate", Toast.LENGTH_SHORT).show();
        });
        btLogin.setOnClickListener(view -> {
            edUserName.setText("");
            edPassword.setText("");
            edUserName.requestFocus();
            Toast.makeText(this, "YOU HAVE LOGGED", Toast.LENGTH_SHORT).show();
        });
    }
}

