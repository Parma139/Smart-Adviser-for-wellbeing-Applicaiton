package com.example.smart_adviser_for_wellbeing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReadingAngryCP extends AppCompatActivity {


    TextView connectLink;
    Button closeReadpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_angry_c_p);

        connectLink = findViewById(R.id.ReadingContentAngry);
        closeReadpage = findViewById(R.id.closeReadPage);

        //this allow the link to open a webpage when user click on it
        connectLink.setMovementMethod(LinkMovementMethod.getInstance());

        // this handle the close button activity
        closeReadpage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                finish();                    //close the ReadingAngryCP layout page
            }

        });
    }
}