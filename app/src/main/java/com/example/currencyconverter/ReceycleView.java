package com.example.currencyconverter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.currencyconverter.Model;
import com.example.currencyconverter.MyAdapter;
import com.example.currencyconverter.R;

import java.util.ArrayList;
import java.util.List;

public class ReceycleView extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> dataList;
    MyAdapter adapter;
    Model androidData;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        textView = findViewById(R.id.txt);
        recyclerView = findViewById(R.id.recycle);

        // Retrieve the selected item from the previous activity
        String selectedItem = getIntent().getStringExtra("SELECTED_ITEM");

        // Set the text of the textView to the selected item
        textView.setText(selectedItem);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(ReceycleView.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();

        // Populate the data list with sample data
        dataList.add(new Model("Item 1", R.drawable.us));
        dataList.add(new Model("Item 2", R.drawable.us));
        dataList.add(new Model("Item 3", R.drawable.us));

        adapter = new MyAdapter(ReceycleView.this, dataList);
        recyclerView.setAdapter(adapter);
    }
}
