package com.example.flagidentifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CostaRica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costa_rica);

        // On click Listener for Next Btn

        Button nextBtn = (Button) findViewById(R.id.nextBtn5);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CostaRica.this, FinishScreen.class);
                startActivity(intent);
            }
        });

        // On click listener for Prev Btn

        Button prevBtn = (Button) findViewById(R.id.prevBtn4);

        prevBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(CostaRica.this, Cuba.class);
                startActivity(intent);
            }
        });
    }
}