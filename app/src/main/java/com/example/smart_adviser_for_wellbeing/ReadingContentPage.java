package com.example.smart_adviser_for_wellbeing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReadingContentPage extends AppCompatActivity {

    TextView connectLink;
    Button closeReadpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_content_page);


        connectLink = findViewById(R.id.ReadingContentAnxiety);
        closeReadpage = findViewById(R.id.closeReadPage);

        //this allow the link to open a webpage when user click on it
        connectLink.setMovementMethod(LinkMovementMethod.getInstance());

        // this handle the close button activity
        closeReadpage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                finish();                        //close the ReadingContentPage layout
            }

        });

    }

}