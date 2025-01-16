package com.example.lab2_bai1;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpForm extends AppCompatActivity implements View

        .OnClickListener {
    private EditText etUsername;
    private EditText etPassword;
    private EditText etConfirmPassword;
    private TextView tvAlreadyAccount;
    private Button btnSignUp;
    private final String REQUIRE = "Require";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up_form);
        etUsername = findViewById(R.id.userName);
        etPassword = findViewById(R.id.passWord);
        etConfirmPassword = findViewById(R.id.confirmPassWord);
        tvAlreadyAccount = findViewById(R.id.alreadyAccount);
        btnSignUp = findViewById(R.id.signUp);
        //
        tvAlreadyAccount.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
    }

    private boolean checkInput() {
        if (TextUtils.isEmpty(etUsername.getText().toString())) {
            etUsername.setError(REQUIRE);
            return false;
        }
        if (TextUtils.isEmpty(etPassword.getText().toString())) {
            etPassword.setError(REQUIRE);
            return false;
        }
        if (TextUtils.isEmpty(etConfirmPassword.getText().toString())) {
            etConfirmPassword.setError(REQUIRE);
            return false;
        }
        if (!TextUtils.equals(etPassword.getText().toString(), etConfirmPassword.getText().toString())) {
            Toast.makeText(this, "Password are not match,pls try again!", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    private void signUp() {
        if (!checkInput()) {
            return;
        }
    }

    private void signInForm() {
        Intent intent = new Intent(this, Bai3.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.alreadyAccount) {
            signInForm();
        }
        if(v.getId()==R.id.signUp){
            signUp();
        }
    }
}