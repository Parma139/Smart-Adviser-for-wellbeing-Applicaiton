package com.example.smart_adviser_for_wellbeing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonAnxiety, buttonNotes, buttonTimeManagement, buttonGeneral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           buttonAnxiety=findViewById(R.id.Anxiety);
           buttonNotes=findViewById(R.id.Notes);
           buttonTimeManagement=findViewById(R.id.TimeManagement);
           buttonGeneral=findViewById(R.id.General);

           buttonAnxiety.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                 FragmentManager  fm = getSupportFragmentManager();
                 fm.beginTransaction().replace(R.id.main, new Anxiety()) .addToBackStack(null).commit();

               }
           });


        buttonNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager  fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.main, new Notes()) .addToBackStack(null).commit();

            }
          });

        buttonTimeManagement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager  fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.main, new TimeMnangement()) .addToBackStack(null).commit();

            }
           });

        buttonGeneral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager  fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.main, new General()) .addToBackStack(null).commit();

            }
            });
    }
}