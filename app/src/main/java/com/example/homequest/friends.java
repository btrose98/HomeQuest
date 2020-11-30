package com.example.homequest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class friends extends AppCompatActivity {

    private ImageButton backButton;
    private ProgressBar progressBar, progressBar2, progressBar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        backButton = findViewById(R.id.backButton);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar2 = (ProgressBar) findViewById(R.id.progressBarFriend1);
        progressBar3 = (ProgressBar) findViewById(R.id.progressBarFriend2);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(friends.this, childHome.class);
                startActivity(intent);
            }
        });

        progressBar.setProgress(50);
        progressBar2.setProgress(25);
        progressBar3.setProgress(75);

    }
}