package com.forbit.onlineshop.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.forbit.onlineshop.R;
import com.forbit.onlineshop.RecyclerviewAdapter;

public class ElectronicsDeviceActivity extends AppCompatActivity {
    RecyclerviewAdapter recyclerviewAdapter;
    RecyclerView recyclerView;

    int[] images = {
            R.drawable.electronics,R.drawable.electronics,
            R.drawable.electronics,R.drawable.electronics,
            R.drawable.electronics,R.drawable.electronics,
            R.drawable.electronics,R.drawable.electronics,
            R.drawable.electronics,R.drawable.electronics,
            R.drawable.electronics,R.drawable.electronics,
            R.drawable.electronics,R.drawable.electronics};

    String title[]=  {"Mobile","Tablet","Laptop",
            "Desktop","Gaming Console","Dslr Camers",
            "Action Camera", "Spy Camera", "Ip Camera",
            "Printer", "Scanner","Table Fan", "Lamp", "Home Decor Lamp"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics_device);

        recyclerView = findViewById(R.id.catElectronics);
        recyclerviewAdapter = new RecyclerviewAdapter(this ,images,title);
        recyclerView.setAdapter(recyclerviewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}