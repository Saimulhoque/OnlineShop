package com.forbit.onlineshop.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.forbit.onlineshop.R;
import com.forbit.onlineshop.RecyclerviewAdapter;
import com.forbit.onlineshop.model.Product;

import java.util.List;

public class WomenActivity extends AppCompatActivity {

    RecyclerviewAdapter recyclerviewAdapter;
    RecyclerView recyclerView;
    int[] images = {
            R.drawable.women,R.drawable.women,
            R.drawable.women,R.drawable.women,
            R.drawable.women,R.drawable.women,
            R.drawable.women,R.drawable.women,
            R.drawable.women,R.drawable.women,
            R.drawable.women,R.drawable.women,
            R.drawable.women,R.drawable.women};

    String title[]={"Saree","Salwar Kameez","Unstitched Fabric",
            "Wedding Wear","Kurtis","Tops",
            "Shorts & Skirts", "Pants", "Women's Bags",
            "Shoes", "Jewelleries","Hair Accessories",
            "Scarves", "Jacket & Coats"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);

        recyclerView = findViewById(R.id.catwomen);
        recyclerviewAdapter = new RecyclerviewAdapter(this ,images,title);
        recyclerView.setAdapter(recyclerviewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}