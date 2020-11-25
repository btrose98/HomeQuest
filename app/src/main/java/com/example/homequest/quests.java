package com.example.homequest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;

public class quests extends AppCompatActivity {

    private ImageButton backButton;
    private CheckBox btChildFinish1, btParentFinish1, btApproved1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quests);

        backButton = findViewById(R.id.backButton);
        btChildFinish1 = (CheckBox) findViewById(R.id.btChildFinish1);
        btParentFinish1 = (CheckBox) findViewById(R.id.btTrackProg1);
        btApproved1 = (CheckBox) findViewById(R.id.btChildApproved1);

        if(btChildFinish1.isChecked() && btParentFinish1.isChecked()){
            btApproved1.setChecked(true);
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }
}