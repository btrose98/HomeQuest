package com.example.homequest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;

public class quests extends AppCompatActivity {

    private ImageButton backButton;
    private static CheckBox btChildFinish1, btParentFinish1, btApproved1, btChildFinish2, btParentFinish2, btApproved2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quests);

        backButton = findViewById(R.id.backButton);
        btChildFinish1 = (CheckBox) findViewById(R.id.btChildFinish1);
        btParentFinish1 = (CheckBox) findViewById(R.id.btTrackProg1);
        btApproved1 = (CheckBox) findViewById(R.id.btChildApproved1);
        btChildFinish2 = (CheckBox) findViewById(R.id.btChildFinish2);
        btParentFinish2 = (CheckBox) findViewById(R.id.btTrackProg2);
        btApproved2 = (CheckBox) findViewById(R.id.btChildApproved2);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = preferences.edit();


        if(preferences.contains("checked") && preferences.getBoolean("checked",false) == true) {
            btChildFinish1.setChecked(true);
        }else {
            btChildFinish1.setChecked(false);
        }
        btChildFinish1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(btChildFinish1.isChecked()) {
                    editor.putBoolean("checked", true);
                }else{
                    editor.putBoolean("checked", false);
                }
                editor.apply();
            }
        });

        if(preferences.getBoolean("checked", true) && preferences.getBoolean("checked2", true)){
            btApproved1.setChecked(true);
        }


        if(preferences.contains("checked3") && preferences.getBoolean("checked3",false) == true) {
            btChildFinish2.setChecked(true);
        }else {
            btChildFinish2.setChecked(false);
        }
        btChildFinish1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(btChildFinish2.isChecked()) {
                    editor.putBoolean("checked3", true);
                }else{
                    editor.putBoolean("checked3", false);
                }
                editor.apply();
            }
        });

        if(preferences.getBoolean("checked3", true) && preferences.getBoolean("checked4", true)){
            btApproved2.setChecked(true);
        }


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }
}