package com.example.homequest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class assignChoresnew extends AppCompatActivity {

    private ImageButton backButton;
    private Button submit;
    EditText choreDescr, rewardDescr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign_choresnew);


        backButton = findViewById(R.id.backButton1);
        submit = findViewById(R.id.btAssignChore);
        choreDescr = findViewById(R.id.choreDescription);
        rewardDescr = findViewById(R.id.rewardDescription);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(choreDescr.getText().toString().equals("") || rewardDescr.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "You must fill in all of the above information to assign this chore.",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Chore has been assigned.",Toast.LENGTH_SHORT).show();
                    choreDescr.setText("");
                    rewardDescr.setText("");
                }
            }
        });




    }
}