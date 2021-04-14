package com.example.smart_adviser_for_wellbeing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NoteDetailActivity extends AppCompatActivity {

    String feeling;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_detail);

        textView = findViewById(R.id.feelingtoday);
        textView.setText(FeelingQ.getmood());

        Button closebtnNDA = findViewById(R.id.closebtnNDA);

        closebtnNDA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                finish();
            }

        });


    }


    public static void saveNote(View view) {

    }

    public void deleteNote(View view) {
    }
}