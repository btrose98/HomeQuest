package com.example.homequest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class parentHome extends AppCompatActivity {

    ImageButton calendarButton, parentSettingsButton, assignChoresButton, btProgress, btMessages;
    private Button btSignOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_home);

        calendarButton = findViewById(R.id.calendarImageButton);
        parentSettingsButton = findViewById(R.id.parentSettingsButton);
        assignChoresButton = findViewById(R.id.assignChoresButton);
        btProgress = (ImageButton) findViewById(R.id.btProgress);
        btSignOut = findViewById(R.id.btParentSignout);
        btMessages = (ImageButton) findViewById(R.id.btMessagesParent);


        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(parentHome.this, calendar.class);
                startActivity(intent);
            }
        });

        parentSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(parentHome.this, parentSettings.class);
                startActivity(intent);
            }
        });

        assignChoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(parentHome.this, assignChoresnew.class);
                startActivity(intent);
            }
        });

        btProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(parentHome.this, trackProgress.class);
                startActivity(intent);
            }
        });

        btSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(parentHome.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(parentHome.this, messages.class);
                startActivity(intent);
            }
        });
    }
}