package com.example.homequest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class childHome extends AppCompatActivity {

    private ImageButton btCalender, btChildSettings, btRedeem, btQuest, btFriends, btMessages;
    private Button btSignOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_home);

        btCalender = (ImageButton) findViewById(R.id.childCalendar);
        btChildSettings = (ImageButton) findViewById(R.id.btChildSettings);
        btRedeem = (ImageButton) findViewById(R.id.btRedeem);
        btQuest = (ImageButton) findViewById(R.id.btQuest);
        btFriends = (ImageButton) findViewById(R.id.btFriends);
        btSignOut = (Button) findViewById(R.id.btChildSignout);
        btMessages = (ImageButton) findViewById(R.id.btMessagesChild);


        btCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(childHome.this, calendar.class);
                startActivity(intent);
            }
        });

        btChildSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(childHome.this, childSettings.class);
                startActivity(intent);
            }
        });

        btRedeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(childHome.this, redeemRewards.class);
                startActivity(intent);
            }
        });

        btQuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(childHome.this, quests.class);
                startActivity(intent);
            }
        });

        btFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(childHome.this, friends.class);
                startActivity(intent);
            }
        });

        btSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(childHome.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(childHome.this, messages.class);
                startActivity(intent);
            }
        });

    }
}