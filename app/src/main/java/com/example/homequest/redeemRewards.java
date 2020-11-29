package com.example.homequest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

public class redeemRewards extends AppCompatActivity {

    private ImageButton backButton;
    private Button btReward;
    private static CheckBox taskComplete1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redeem_rewards);

        backButton = findViewById(R.id.backButton);
        btReward = findViewById(R.id.btReward1);
        taskComplete1 = findViewById(R.id.btTrackProg1);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });


        if(taskComplete1.isChecked()){
            btReward.setText("Sleepover");
        }else{
            btReward.setText("Locked");
        }

        btReward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(redeemRewards.this, "Reward Claimed: 1 sleepover!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}