package com.example.ideasethu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class faqpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqpage);
    }

    public void backhome(View view) {
        Intent i = new Intent(faqpage.this, MainActivity.class);
        startActivity(i);
    }
}
