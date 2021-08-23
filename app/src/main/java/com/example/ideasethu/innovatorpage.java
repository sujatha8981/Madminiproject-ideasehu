package com.example.ideasethu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class innovatorpage extends AppCompatActivity {
   EditText editText,editText1;
   Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_innovatorpage);
        editText = findViewById(R.id.idea);
        editText1 = findViewById(R.id.editText);
        button = (Button) findViewById(R.id.post);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text1 = editText.getText().toString();
                String text2 = editText1.getText().toString();

                if (text1.length() <=0 || text2.length() <=0){
                    Toast.makeText(innovatorpage.this, "Enter All Data", Toast.LENGTH_SHORT).show();
                }else {
                    DatabaseHelperClass databaseHelperClass = new DatabaseHelperClass(innovatorpage.this);
                    ModelClass employeeModelClass = new ModelClass(text1,text2);
                    databaseHelperClass.addidea(employeeModelClass);
                    Toast.makeText(innovatorpage.this, "Idea posted Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());
                }
            }
        });

            }
    public void backhome(View view) {
        Intent i = new Intent(innovatorpage.this,home1.class);
        startActivity(i);
    }
}