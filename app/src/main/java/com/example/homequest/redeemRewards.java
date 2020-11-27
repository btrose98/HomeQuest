package com.example.homequest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class redeemRewards extends AppCompatActivity {

    private ImageButton backButton;
    private Button btReward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redeem_rewards);

        backButton = findViewById(R.id.backButton);
        btReward = findViewById(R.id.btReward1);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });

        btReward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(redeemRewards.this, "Reward Claimed: 1 sleepover!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}