package com.example.myapplication;// MainActivity.java
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    RecyclerView shoppingRecyclerView;
    ShoppingAdapter adapter;
    List<String> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shoppingRecyclerView = findViewById(R.id.shoppingRecyclerView);

        productList = new ArrayList<>();
        productList.add("Mleko");
        productList.add("Chleb");
        productList.add("Jajka");
        productList.add("Masło");
        productList.add("Ser");
        productList.add("Szynka");
        productList.add("Mleko");
        productList.add("Chleb");
        productList.add("Jajka");
        productList.add("Masło");
        productList.add("Ser");
        productList.add("Szynka");
        productList.add("Mleko");
        productList.add("Chleb");
        productList.add("Jajka");
        productList.add("Masło");
        productList.add("Ser");
        productList.add("Szynka");

        adapter = new ShoppingAdapter(productList);

        shoppingRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        shoppingRecyclerView.setAdapter(adapter);
    }
}