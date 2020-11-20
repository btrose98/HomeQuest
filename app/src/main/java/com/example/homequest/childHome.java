package com.example.homequest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class childHome extends AppCompatActivity {

    private ImageButton btCalender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_home);

        btCalender = (ImageButton) findViewById(R.id.childCalendar);

        btCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(childHome.this, calendar.class);
                startActivity(intent);
            }
        });

    }
}