package com.example.flagidentifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinishScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_screen);

        // On click Listener for Finish Screen that takes you back to Home Screen

        Button homeBtn = (Button) findViewById(R.id.homeBtn);

        homeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(FinishScreen.this, HomeScreen.class);
                startActivity(intent);
            }
        });
    }
}