package com.example.smart_adviser_for_wellbeing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView btnNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnNav = findViewById(R.id.bottomNavigationview);
        btnNav.setOnNavigationItemSelectedListener(navListener);

        //getsupportFragementManager is used to set the home page as main fragement

         getSupportFragmentManager().beginTransaction().replace(R.id.fragmentscreen_layout, new Home()).commit();

    }

    /*
    BottomNaviagtionView is used to assign activity page for buttons which are available in the naviagtions bar
     */

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

            // getSupportFragementManager is used here to change the acitivtiy page depend on selected button by users in the navigation bar
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentscreen_layout, selectedFragment).addToBackStack(null).commit();
            return true;


        }
    };

}