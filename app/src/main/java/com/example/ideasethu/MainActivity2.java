package com.example.ideasethu;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initData();
        initRecyclerView();

    }
        private void initRecyclerView () {
            mrecyclerView = findViewById(R.id.RecyclerView);
            layoutManager = new LinearLayoutManager(this);
            layoutManager.setOrientation(RecyclerView.VERTICAL);
            mrecyclerView.setLayoutManager(layoutManager);
            adapter = new Adapter(userList);
            mrecyclerView.setAdapter(adapter);
            adapter.notifyDataSetChanged();

        }

        private void initData () {
            userList = new ArrayList<>();

            userList.add(new ModelClass(R.drawable.ai, "Anjali", "Artificial intelligence (AI) refers to the simulation of human intelligence in machines that are programmed to think like humans and mimic their actions.", "10:45 am", "________________________"));

            userList.add(new ModelClass(R.drawable.creativity, "Brijesh", "Machine learning is a method of data analysis that automates analytical model building. It is a branch of artificial intelligence based on the idea that systems can learn from data, identify patterns and make decisions with minimal human intervention.", "15:08 pm", "________________________"));

            userList.add(new ModelClass(R.drawable.curiosity, "Sam", "I am very curious to know about things , my research went through on this so am willing to share my idea", "1:02 am", "________________________"));

            userList.add(new ModelClass(R.drawable.da, "Divya", "I love data analytics that driven me to work on this ,as am very curious on this such things?", "12:55 pm", "________________________"));

            userList.add(new ModelClass(R.drawable.ml, "Simran", "This is Easy, and very effective idea to use in our daily lives . I would suggest to use yhis idea", "13:50 am", "________________________"));

            userList.add(new ModelClass(R.drawable.probthink, "Karan", "I am very curious to know about things , my research went through on this", "1:08 am", "________________________"));

            userList.add(new ModelClass(R.drawable.reallife, "Sameer", "You Know this? In real life at some point we all think innovatively", "4:02 am", "________________________"));

            userList.add(new ModelClass(R.drawable.innovator, "sujatha", "How is the idea of the project ideasethu, and have implemented to an extent hope it will be good 2mrw ?", "11:55 pm", "________________________"));

        }
    }
