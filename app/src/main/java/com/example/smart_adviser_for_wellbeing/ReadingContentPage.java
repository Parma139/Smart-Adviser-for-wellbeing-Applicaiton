package com.example.smart_adviser_for_wellbeing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReadingContentPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_content_page);


//        Readingcontent();
        Button closeReadpage = findViewById(R.id.closeReadPage);
        closeReadpage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                finish();
            }

        });

    }

//    void Readingcontent(){
//
//        TextView finalBoxoutput;
//        finalBoxoutput = findViewById(R.id.TitleforReading);
//        finalBoxoutput.setText("heyI am in anxiety ");
//
//
//    };
}