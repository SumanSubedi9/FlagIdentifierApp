package com.example.flagidentifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        // On click listener for Learn button that Starts the application

        Button clicker = (Button) findViewById(R.id.learn_button);

        clicker.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(HomeScreen.this, usa.class);
                startActivity(intent);
            }
        });
    }
}