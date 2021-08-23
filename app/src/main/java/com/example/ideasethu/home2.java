package com.example.ideasethu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home2 extends AppCompatActivity {
    Button btnview, btncontact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        btnview = findViewById(R.id.button3);
        btncontact = findViewById(R.id.button4);

        view();
        contact();

    }

    private void view() {
        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home2.this, investorpage.class));
                finish();
            }
        });

    }

    private void contact() {

        btncontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home2.this, contactus.class));
                finish();
            }
        });


    }
}