package ru.wizand.wizmessenger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistrationActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextName;
    private EditText editTextSurname;
    private Button buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        initViews();
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = getTrimmedValue(editTextEmail);
                String password = getTrimmedValue(editTextPassword);
                String name = getTrimmedValue(editTextName);
                String surname = getTrimmedValue(editTextSurname);

                // sing up
            }
        });

    }

    private void initViews(){
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextName = findViewById(R.id.editTextName);
        editTextSurname = findViewById(R.id.editTextSurname);
        buttonSignUp = findViewById(R.id.buttonSignUp);
    }

    private String getTrimmedValue(EditText editText) {
        return editText.getText().toString().trim();
    }

    public static Intent newIntent(Context context) {
        return new Intent(context, RegistrationActivity.class);

    }
}