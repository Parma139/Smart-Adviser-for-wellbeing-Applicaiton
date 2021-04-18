package com.example.smart_adviser_for_wellbeing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReadingLinkCP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_link_c_p);


        TextView connectLink = findViewById(R.id.Readinglinkcp);
        connectLink.setMovementMethod(LinkMovementMethod.getInstance());

        Button closeReadpage = findViewById(R.id.closeReadPage);
        closeReadpage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                finish();
            }

        });
    }
}