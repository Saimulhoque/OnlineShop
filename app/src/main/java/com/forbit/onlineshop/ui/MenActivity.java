package com.forbit.onlineshop.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.forbit.onlineshop.ProductAdapter;
import com.forbit.onlineshop.R;
import com.forbit.onlineshop.RecyclerviewAdapter;

import static android.widget.LinearLayout.VERTICAL;

public class MenActivity extends AppCompatActivity {

    RecyclerviewAdapter recyclerviewAdapter;
    ProductAdapter productAdapter;
    RecyclerView recyclerView;

    int[] images = {
            R.drawable.men,R.drawable.men,
            R.drawable.men,R.drawable.men,
            R.drawable.men,R.drawable.men,
            R.drawable.men,R.drawable.men,
            R.drawable.men,R.drawable.men,
            R.drawable.men,R.drawable.men,
            R.drawable.men,R.drawable.men};

    String title[]=  {"T-Shirts","Shirts","Panjabi & Fatua",
            "Polo Shirts","Jeans","Shorts & Bermudas",
            "Jogger & Sweatpants", "Chinos", "Men's Bags",
            "Shoes", "Belt","Wallet", "Hats & Caps", "Jacket & Coats"};

    int[] pimage = {
            R.drawable.panjabi,R.drawable.panjabi2,
            R.drawable.panjabi3,R.drawable.panjabi4,
            R.drawable.panjabi5,R.drawable.panjabi6,
            R.drawable.panjabi4,R.drawable.panjabi3,
            R.drawable.panjabi2,R.drawable.panjabi5,
            R.drawable.panjabi6,R.drawable.panjabi,
            R.drawable.panjabi2,R.drawable.panjabi4};

    String pname[]=  {"Stylish Exclusive semi long Panjabi-1",
            "Stylish Exclusive semi long Panjabi-2",
            "Stylish Exclusive semi long Panjabi-3",
            "Stylish Exclusive semi long Panjabi-4",
            "Stylish Exclusive semi long Panjabi-5",
            "Stylish Exclusive semi long Panjabi-6",
            "Stylish Exclusive semi long Panjabi-7",
            "Stylish Exclusive semi long Panjabi-8",
            "Stylish Exclusive semi long Panjabi-9",
            "Stylish Exclusive semi long Panjabi-10",
            "Stylish Exclusive semi long Panjabi-11",
            "Stylish Exclusive semi long Panjabi-12",
            "Stylish Exclusive semi long Panjabi-13",
            "Stylish Exclusive semi long Panjabi-14"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men);


        recyclerView = findViewById(R.id.mencat);
        recyclerviewAdapter = new RecyclerviewAdapter(this ,images,title);
        recyclerView.setAdapter(recyclerviewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView = findViewById(R.id.menproducts);
        productAdapter = new ProductAdapter(this,pimage,pname);
        recyclerView.setAdapter(productAdapter);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,VERTICAL));
    }


}