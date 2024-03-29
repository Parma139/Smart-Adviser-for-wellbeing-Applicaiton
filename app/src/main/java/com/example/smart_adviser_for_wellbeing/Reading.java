package com.example.smart_adviser_for_wellbeing;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Reading extends Fragment {

    public Reading() {
        // Required empty public constructor
    }

    Button readinganxietyPageBtn, timeManagementbtn, angrytbtn, stresstbtn, readinglinktbtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_reading, container, false);

        readinganxietyPageBtn = view.findViewById(R.id.anxietyReadBtn);
        timeManagementbtn = view.findViewById(R.id.depressionReadingbtn);
        angrytbtn = view.findViewById(R.id.angryReadingbtn);
        stresstbtn = view.findViewById(R.id.stressReadingBtn);
        readinglinktbtn = view.findViewById(R.id.clickformorereadingbtn);


        // this handle the Anxiety button activity
        readinganxietyPageBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), ReadingContentPage.class);
                startActivity(newNoteIntent);
            }

        });

        // this handle the TimeManagement button activity
        timeManagementbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), ReadingDepressionCP.class);
                startActivity(newNoteIntent);

            }

        });

        // this handle the Angry button activity
        angrytbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), ReadingAngryCP.class);
                startActivity(newNoteIntent);

            }

        });

        // this handle the Stress button activity
        stresstbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), ReadingStressCP.class);
                startActivity(newNoteIntent);

            }

        });

        // this handle the ClickHereforMore button activity
        readinglinktbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), ReadingLinkCP.class);
                startActivity(newNoteIntent);

            }

        });


        return view;
    }

}