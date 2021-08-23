package com.example.ideasethu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class investorpage extends AppCompatActivity {
    private TextView domain,text1;
    /*private Button btnaccept,btnreject;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investorpage);

        domain = findViewById(R.id.domain);
        text1 = findViewById(R.id.textappear);

        String domain1 = getIntent().getStringExtra("keydomain");
        String idea2 = getIntent().getStringExtra("keyidea");

        domain.setText(domain1);
        text1.setText(idea2);


       /* btnaccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11 = new Intent(investorpage.this,innovatorpage.class);
                startActivity(i11);
            }
        });

        btnreject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i12 = new Intent(investorpage.this,home1.class);
                startActivity(i12);
            }
        });
    */
    }


    public void backhome(View view) {
        Intent i = new Intent(investorpage.this,HomeActivity.class);
        startActivity(i);
    }
}