package com.example.ideasethu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choice extends AppCompatActivity {
    private Button btninnovator, btninvestor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        btninnovator = findViewById(R.id.button6);
        btninvestor = findViewById(R.id.button2);

        open();
        investor();

    }

    private void open() {
        btninnovator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(choice.this, home1.class));
                finish();
            }
        });

    }

    private void investor() {

        btninvestor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(choice.this, MainActivity2.class));
                finish();
            }
        });


    }

    /*public void backhome(View view) {
        Intent i = new Intent(choice.this, HomeActivity.class);
        startActivity(i);*/
    }
