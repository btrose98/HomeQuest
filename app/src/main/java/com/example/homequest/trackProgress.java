package com.example.homequest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;

public class trackProgress extends AppCompatActivity {

    private ImageButton backButton;
    private static CheckBox taskComplete1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_progress);

        backButton = findViewById(R.id.backButton);
        taskComplete1 = findViewById(R.id.btTrackProg1);

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
    }
}