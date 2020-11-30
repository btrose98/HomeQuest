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
    private Button btReward, btReward2;
    private static CheckBox taskComplete1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redeem_rewards);

        backButton = findViewById(R.id.backButton);
        btReward = findViewById(R.id.btReward1);
        btReward2 = findViewById(R.id.btReward2);
        taskComplete1 = findViewById(R.id.btTrackProg1);


        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = preferences.edit();


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });

        //unlock reward1 when parent approves chore completion
        if(preferences.getBoolean("finished1Checked", true) && preferences.getBoolean("checked2", true)){
            btReward.setText("30 minutes of screen time");
        }else{
            btReward.setText("Locked");
        }

        //unlock reward2 when parent approves chore completion
        if(preferences.getBoolean("finished2Checked", true) && preferences.getBoolean("checked4", true)){
            btReward2.setText("Pick a movie for movie night");
        }else{
            btReward2.setText("Locked");
        }

    }
}