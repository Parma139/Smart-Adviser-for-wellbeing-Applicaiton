package com.example.smart_adviser_for_wellbeing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReadingContentPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_content_page);


        TextView connectLink = findViewById(R.id.ReadingContentAnxiety);
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