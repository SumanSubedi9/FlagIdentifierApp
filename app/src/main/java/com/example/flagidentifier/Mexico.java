package com.example.flagidentifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mexico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexico);

        // On click Listener for the Next Button

        Button clicker = (Button) findViewById(R.id.nextBtn2);

        clicker.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(Mexico.this, Canada.class);
                startActivity(intent);
            }
        });

        // On click Listener for Prev Button

        Button prevBtn = (Button) findViewById(R.id.prevBtn1);

        prevBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Mexico.this, usa.class);
                startActivity(intent);
            }
        });
    }
}