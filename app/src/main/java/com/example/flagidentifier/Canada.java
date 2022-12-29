package com.example.flagidentifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Canada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canada);
        // On click Listener for Next Btn
        Button nextBtn = (Button) findViewById(R.id.nextBtn3);

        nextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Canada.this, Cuba.class);
                startActivity(intent);
            }
        });

        // On click Listener for Prev Btn

        Button prevBtn = (Button) findViewById(R.id.prevBtn2);

        prevBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Canada.this, Mexico.class);
                startActivity(intent);
            }
        });
    }
}