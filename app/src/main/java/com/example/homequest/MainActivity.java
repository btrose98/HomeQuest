package com.example.homequest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    private Button btSubmit;
    TextView tvRegister;

    public void successfulLogIn(String user){
        AlertDialog.Builder builder = new AlertDialog.Builder(
                MainActivity.this
        );
        builder.setIcon(R.drawable.ic_check);
        builder.setTitle("Login Successful");
        builder.setMessage("Welcome to HomeQuest " + user);

        builder.setNegativeButton("YES", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btSubmit = findViewById(R.id.bt_login);
        tvRegister = findViewById(R.id.tv_register);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(etUsername.getText().toString().equals("parent") && etPassword.getText().toString().equals("parent")){
                    successfulLogIn("parent");
                    Intent intent = new Intent(MainActivity.this, parentHome.class);
                    startActivity(intent);
                }else if(etUsername.getText().toString().equals("child") && etPassword.getText().toString().equals("child")){
                    successfulLogIn("child");
                    Intent intent = new Intent(MainActivity.this, childHome.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, registerActivity.class);
                startActivity(intent);
            }
        });
    }
}