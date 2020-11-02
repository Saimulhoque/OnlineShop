package com.forbit.onlineshop.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;

import com.forbit.onlineshop.R;
import com.forbit.onlineshop.SliderAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ViewPager viewPager;
    public CardView mensfashion, womenfashion,electronicsdevice;
    int images[] = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide3, R.drawable.slide4};
    int currentPageCounter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView mensfashion = findViewById(R.id.mensfashion);
        CardView womenfashion = findViewById(R.id.womenfashion);
        CardView electronicsdevice = findViewById(R.id.electronicsdevice);

        mensfashion.setOnClickListener(this);
        womenfashion.setOnClickListener(this);
        electronicsdevice.setOnClickListener(this);


        //initialize and assign variable//
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomnavigation);

        //Set home selected//
        bottomNavigationView.setSelectedItemId(R.id.home);

        //perform ItemSelectedListener//
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        return true;

                    case R.id.message:
                        startActivity(new Intent(getApplicationContext(), MessageActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.cart:
                        startActivity(new Intent(getApplicationContext(), CartActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.settings:
                        startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }

        });


        viewPager = findViewById(R.id.slideview);
        viewPager.setAdapter(new SliderAdapter(images, MainActivity.this));

        final Handler handler = new Handler();
        final Runnable update = new Runnable() {
            @Override
            public void run() {
                if (currentPageCounter == images.length) {
                    currentPageCounter = 0;
                }

                viewPager.setCurrentItem(currentPageCounter++, true);
            }
        };

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(update);
            }
        }, 2000, 2000);
    }


    public void onBackPressed() {
        finishAffinity();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mensfashion:
                Intent intent = new Intent(this, MenActivity.class);
                startActivity(intent);
                break;
                case R.id.womenfashion:
                Intent intent1 = new Intent(this, WomenActivity.class);
                startActivity(intent1);
                break;
                case R.id.electronicsdevice:
                Intent intent2 = new Intent(this, ElectronicsDeviceActivity.class);
                startActivity(intent2);
                break;
        }
    }
}