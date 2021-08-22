package com.example.ideasethu;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<ItemClass> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //--> Creating a list
        list = new ArrayList<>();
        list.add(new ItemClass(R.drawable.ai, "Mario", "Mario@email.com"));
        list.add(new ItemClass(R.drawable.creativity, "John", "John@email.com"));
        list.add(new ItemClass(R.drawable.collaboration, "Ian", "Ian@email.com"));
        list.add(new ItemClass(R.drawable.da, "Ian", "Ian@email.com"));
        list.add(new ItemClass(R.drawable.probthink, "Ian", "Ian@email.com"));
        list.add(new ItemClass(R.drawable.reallife, "Ian", "Ian@email.com"));
        list.add(new ItemClass(R.drawable.ml, "Ian", "Ian@email.com"));
        list.add(new ItemClass(R.drawable.curiosity, "Ian", "Ian@email.com"));

        recyclerView = findViewById(R.id.id_RecyclerView);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        MyAdapter adapter = new MyAdapter(list);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        adapter.OnRecyclerViewClickListener(new MyAdapter.OnRecyclerViewClickListener() {
            @Override
            public void OnItemClick(int position) {

                Intent intent = new Intent(MainActivity2.this, DetailsActivity.class);
                intent.putExtra("imagINTENT", list.get(position).getImg() );
                intent.putExtra("nameINTENT", list.get(position).getName());
                intent.putExtra("emailINTENT", list.get(position).getEmail());
                startActivity(intent);
            }
        });

    }
}
