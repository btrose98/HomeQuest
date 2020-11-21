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

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class registerActivity extends AppCompatActivity {
    private Button btCreateAccount;
    TextView reg_fullname, reg_username, reg_email, reg_password;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    public boolean checkEmptyField(){
        if(reg_fullname.getText().toString().equals("") || reg_username.getText().toString().equals("") || reg_email.getText().toString().equals("") || reg_password.getText().toString().equals("")){
            Toast.makeText(registerActivity.this, "you did not fill in all the required fields above.",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public boolean isValidEmail() {
        String target = reg_email.getText().toString();
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
        reg_fullname = findViewById(R.id.regFullname);
        reg_username = findViewById(R.id.regUsername);
        reg_email = findViewById(R.id.regEmail);
        reg_password = findViewById(R.id.regPassword);

        btCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(checkEmptyField() && isValidEmail()){
                    Toast.makeText(registerActivity.this, "Welcome to the HomeQuest family!",Toast.LENGTH_SHORT).show();
                    rootNode = FirebaseDatabase.getInstance();
                    reference = rootNode.getReference("users");

                    //get all the values
                    String fullname = reg_fullname.getText().toString();
                    String username = reg_username.getText().toString();
                    String email = reg_email.getText().toString();
                    String password = reg_password.getText().toString();

                    UserHelperClass helperClass = new UserHelperClass(fullname, username, email, password);
                    reference.child(username).setValue(helperClass);

                    Intent intent = new Intent(registerActivity.this, parentHome.class);
                    startActivity(intent);
                }
            }
        });
    }
}

//database setup:  https://www.youtube.com/watch?v=wa8OrQ_e76M&ab_channel=CodingWithTea