package com.example.homequest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class registerActivity extends AppCompatActivity {
    private Button btCreateAccount;
    TextView etFirstName, etLastName, etEmail, etPasswordRegister;

    public boolean checkEmptyField(){
        if(etFirstName.getText().toString().equals("") || etLastName.getText().toString().equals("") || etEmail.getText().toString().equals("") || etPasswordRegister.getText().toString().equals("")){
            Toast.makeText(registerActivity.this, "you did not fill in all the required fields above.",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public boolean isValidEmail() {
        String target = etEmail.getText().toString();
        if (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches()){
            return true;
        }
        Toast.makeText(registerActivity.this, "The email you have entered is invalid.",Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btCreateAccount = findViewById(R.id.bt_createAccount);
        etFirstName = findViewById(R.id.et_firstName);
        etLastName = findViewById(R.id.et_lastName);
        etEmail = findViewById(R.id.et_email);
        etPasswordRegister = findViewById(R.id.et_passwordRegister);

        btCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(checkEmptyField() && isValidEmail()){
                    Toast.makeText(registerActivity.this, "Welcome to the HomeQuest family!",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(registerActivity.this, parentHome.class);
                    startActivity(intent);
                }
            }
        });
    }
}