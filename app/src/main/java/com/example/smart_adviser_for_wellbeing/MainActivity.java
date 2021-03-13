package com.example.smart_adviser_for_wellbeing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         ImageButton homeButton = (ImageButton)findViewById(R.id.homeButton);
         ImageButton noteButton = (ImageButton)findViewById(R.id.noteButton);
         ImageButton  anxietyButton = (ImageButton)findViewById(R.id.anxietyButton);
         ImageButton timemanagementButton = (ImageButton)findViewById(R.id.timemanagementButon);



        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager  fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.main, new General()) .addToBackStack(null).commit();
            }
        });

        noteButton.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                 FragmentManager  fm = getSupportFragmentManager();
                 fm.beginTransaction().replace(R.id.main, new Notes()) .addToBackStack(null).commit();

               }
            });

        anxietyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager  fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.main, new Anxiety()) .addToBackStack(null).commit();
            }
        });


        timemanagementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager  fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.main, new TimeMnangement()) .addToBackStack(null).commit();
            }
        });

    }

}