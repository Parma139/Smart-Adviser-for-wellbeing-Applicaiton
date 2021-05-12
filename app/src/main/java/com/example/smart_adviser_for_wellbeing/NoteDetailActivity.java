package com.example.smart_adviser_for_wellbeing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NoteDetailActivity extends AppCompatActivity {


    TextView textView;
    Button closebtnNDA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_detail);

        textView = findViewById(R.id.feelingtoday);
        textView.setText(FeelingQ.getmood());


        closebtnNDA = findViewById(R.id.closebtnNDA);

        // this handle the close button activity
        closebtnNDA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();                       //close the NoteDetailActivity layout page
            }

        });
    }
}