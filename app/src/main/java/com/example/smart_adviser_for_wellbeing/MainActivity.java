package com.example.smart_adviser_for_wellbeing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView btnNav = findViewById(R.id.bottomNavigationview);
        btnNav.setOnNavigationItemSelectedListener(navListener);

        // Setting home as a main fragment

         getSupportFragmentManager().beginTransaction().replace(R.id.fragmentscreen_layout, new Home()).commit();

    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;

            switch (item.getItemId()){
                case R.id.item1:
                    selectedFragment = new Home();
                     break;
                case R.id.item2:
                    selectedFragment = new Notes();
                    break;

                case R.id.item3:
                    selectedFragment = new Reading();
                    break;

                case R.id.item4:
                    selectedFragment = new AboutApp();
                    break;


            }

            //Begin transisiton
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentscreen_layout, selectedFragment).addToBackStack(null).commit();
            return true;


        }
    };


}