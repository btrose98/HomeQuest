package com.example.homequest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class trackProgress extends AppCompatActivity {

    private ImageButton backButton;
    private static CheckBox taskComplete1, taskComplete2;
    private ProgressBar childProgress, childProgress2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_progress);

        backButton = findViewById(R.id.backButton);
        taskComplete1 = findViewById(R.id.btTrackProg1);
        taskComplete2 = findViewById(R.id.btTrackProg2);
        childProgress = findViewById(R.id.progressBar6);
        childProgress2 = findViewById(R.id.progressBar5);

        childProgress.setProgress(50);
        childProgress2.setProgress(25);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });


        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = preferences.edit();

        if(preferences.contains("checked2") && preferences.getBoolean("checked2",false) == true) {
            taskComplete1.setChecked(true);
        }else {
            taskComplete1.setChecked(false);
        }
        taskComplete1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(taskComplete1.isChecked()) {
                    editor.putBoolean("checked2", true);
                }else{
                    editor.putBoolean("checked2", false);
                }
                editor.apply();
            }
        });


        if(preferences.contains("checked4") && preferences.getBoolean("checked4",false) == true) {
            taskComplete2.setChecked(true);
        }else {
            taskComplete2.setChecked(false);
        }
        taskComplete2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(taskComplete2.isChecked()) {
                    editor.putBoolean("checked4", true);
                }else{
                    editor.putBoolean("checked4", false);
                }
                editor.apply();
            }
        });
    }
}