package com.example.ideasethu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signup(View view) {
        Intent i = new Intent(MainActivity.this,signup.class);
        startActivity(i);

    }

    public void login(View view) {
        Intent i = new Intent(MainActivity.this,login.class);
        startActivity(i);
    }
}