package com.example.homequest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.SharedPreferences;
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


        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = preferences.edit();


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });

        //unlock reward when parent approves chore completion
        if(preferences.getBoolean("finished1Checked", true) && preferences.getBoolean("checked2", true)){
            btReward.setText("Sleepover");
        }else{
            btReward.setText("Locked");
        }

    }
}