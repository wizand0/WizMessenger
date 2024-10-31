package ru.wizand.wizmessenger;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonLogin;
    private TextView textViewForgotPass;
    private TextView textViewRegister;

    private LoginViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        InitViews();
        viewModel = new ViewModelProvider(this).get(LoginViewModel.class);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();
                viewModel.login(email, password);

                //Login
            }
        });
        textViewForgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //launch intent for forgot pass
                Intent intent = ResetPasswordActivity.newIntent(
                        LoginActivity.this,
                        editTextEmail.getText().toString().trim()
                );
                startActivity(intent);

            }
        });

        textViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //launch intent for register
                Intent intent = RegistrationActivity.newIntent(LoginActivity.this);
                startActivity(intent);

            }
        });
    }

    private void InitViews() {
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        textViewForgotPass = findViewById(R.id.textViewForgotPass);
        textViewRegister = findViewById(R.id.textViewRegister);
    }

}