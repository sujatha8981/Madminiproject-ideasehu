package com.example.ideasethu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home1 extends AppCompatActivity {

    private Button btncontact, btnpost , btnview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);

        btnpost = findViewById(R.id.put);
        btncontact = findViewById(R.id.contact);
        btnview1 = findViewById(R.id.button5);
        innovator();
        contact();
        view();
    }

    private void innovator(){
        btnpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home1.this , innovatorpage.class));
                finish();
            }
        });

    }

    private void contact(){

        btncontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home1.this, contactus.class));
                finish();
            }
        });


    }

    private void view(){

        btnview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home1.this, MainActivity2.class));
            }
        });
    }

    public void backhome(View view) {
        Intent i = new Intent(home1.this, HomeActivity.class);
        startActivity(i);
    }


}
