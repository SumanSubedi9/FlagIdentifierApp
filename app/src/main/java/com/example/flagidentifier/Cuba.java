package com.example.flagidentifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cuba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuba);

        // On click Listener for Next Btn

        Button nextBtn = (Button) findViewById(R.id.nextBtn4);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cuba.this, CostaRica.class);
                startActivity(intent);
            }
        });

        // On click listener for Prev Button

        Button prevBtn = (Button) findViewById(R.id.prevBtn3);

        prevBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Cuba.this, Canada.class);
                startActivity(intent);
            }
        });
    }
}