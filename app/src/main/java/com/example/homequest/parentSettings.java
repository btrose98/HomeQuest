package com.example.homequest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class parentSettings extends AppCompatActivity {

    private ImageButton backButton;
    Button changePassword, addChild;
    EditText oldPassword, newPassword, addChildName, addChildPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_settings);

        backButton = findViewById(R.id.backButton);
        changePassword = findViewById(R.id.btChangePassword);
        addChild = findViewById(R.id.btAddChild);
        oldPassword = findViewById(R.id.oldPassword);
        newPassword = findViewById(R.id.newPassword);
        addChildName = findViewById(R.id.addChildName);
        addChildPassword = findViewById(R.id.addChildPassword);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(parentSettings.this, parentHome.class);
                startActivity(intent);
            }
        });

        changePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(oldPassword.getText().toString().equals("") || newPassword.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Please fill in all of the above fields to complete this action.",Toast.LENGTH_SHORT).show();
                }else if(oldPassword.getText().toString().equals(newPassword.getText().toString())){
                    Toast.makeText(getApplicationContext(), "New password must be different from the old password.",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Password has been changed.",Toast.LENGTH_SHORT).show();
                    oldPassword.setText("");
                    newPassword.setText("");
                }
            }
        });

        addChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(addChildName.getText().toString().equals("") || addChildPassword.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Please fill in all of the above fields to complete this action.",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Child has been added to your home.",Toast.LENGTH_SHORT).show();
                    addChildName.setText("");
                    addChildPassword.setText("");
                }
            }
        });

    }
}