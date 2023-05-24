package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.JsonTask;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=d22hanol";
    ArrayList<recycler_item> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new com.example.project.JsonTask((JsonTask.JsonTaskListener) this).execute(JSON_URL);
    }
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
        Gson newGson = new Gson();
        Type newType = new TypeToken<List<recycler_item>>() {}.getType();
        items = newGson.fromJson(json, newType);

        Adapter adapter = new Adapter(this,items,new Adapter.OnClickListener(){
            @Override
            public void onClick(recycler_item item){
                Toast.makeText(MainActivity.this, item.getcountry(), Toast.LENGTH_SHORT).show();
            }
        });

        RecyclerView view = (RecyclerView) findViewById(R.id.recyclerview);
        view.setAdapter(adapter);
        view.setLayoutManager(new LinearLayoutManager(this));

    }
}
