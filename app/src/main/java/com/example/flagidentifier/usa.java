package com.example.flagidentifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class usa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa);

        // On Click Listener for the Next Button
        Button nextBtn = (Button) findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(usa.this, Mexico.class);
                startActivity(intent);
            }
        });

        // On Click Listener for the Prev Button

        Button prevBtn = (Button) findViewById(R.id.prevBtn);

        prevBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(usa.this, HomeScreen.class);
                startActivity(intent);
            }
        });




    }

}