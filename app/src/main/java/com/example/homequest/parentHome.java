package com.example.homequest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class parentHome extends AppCompatActivity {

    ImageButton calendarButton, parentSettingsButton, assignChoresButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_home);

        calendarButton = findViewById(R.id.calendarImageButton);
        parentSettingsButton = findViewById(R.id.parentSettingsButton);
        assignChoresButton = findViewById(R.id.assignChoresButton);


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
    }
}