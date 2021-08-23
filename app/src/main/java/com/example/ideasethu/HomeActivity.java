package com.example.ideasethu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private Button btninnovator; /*btninvestor;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btninnovator = findViewById(R.id.button);
       /* btninvestor = findViewById(R.id.button2);*/

        open();
        /*investor();*/

    }

    private void open(){
        btninnovator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this , MainActivity.class));
                finish();
            }
        });

    }

   /* private void investor(){

        btninvestor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
                finish();
            }
        });


    }

    /*public void backhome(View view) {
        Intent i = new Intent(HomeActivity.this,MainActivity.class);
        startActivity(i);
    }*/

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.contact11:
                Toast.makeText(HomeActivity.this,"contact",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(HomeActivity.this,contactus.class);
                startActivity(i);
                return true;



            case R.id.faq11:
                Toast.makeText(HomeActivity.this,"FAQ",Toast.LENGTH_SHORT).show();
                Intent i1 = new Intent(HomeActivity.this,faqpage.class);
                startActivity(i1);
                return true;


            case R.id.signin11:
                Toast.makeText(HomeActivity.this,"signin",Toast.LENGTH_SHORT).show();
                Intent i2 = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(i2);
                return true;


            case R.id.signup1111:
                Toast.makeText(HomeActivity.this,"signup",Toast.LENGTH_SHORT).show();
                Intent i3 = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(i3);
                return true;

            case R.id.view111:
                Toast.makeText(HomeActivity.this,"suggestion",Toast.LENGTH_SHORT).show();
                Intent i4 = new Intent(HomeActivity.this,MainActivity2.class);
                startActivity(i4);
                return true;


            default:
                return super.onOptionsItemSelected(item);


        }


    }

    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
}