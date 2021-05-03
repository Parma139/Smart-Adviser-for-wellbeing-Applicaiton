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



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_reading, container, false);

        Button readinganxietyPageBtn = view.findViewById(R.id.anxietyReadBtn);
        readinganxietyPageBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), ReadingContentPage.class);
                startActivity(newNoteIntent);


            }

        });

        Button timeManagementbtn = view.findViewById(R.id.depressionReadingbtn);

        timeManagementbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), ReadingDepressionCP.class);
                startActivity(newNoteIntent);

            }

        });

        Button angrytbtn = view.findViewById(R.id.angryReadingbtn);

        angrytbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), ReadingAngryCP.class);
                startActivity(newNoteIntent);

            }

        });

        Button stresstbtn = view.findViewById(R.id.stressReadingBtn);

        stresstbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), ReadingStressCP.class);
                startActivity(newNoteIntent);

            }

        });

        Button readinglinktbtn = view.findViewById(R.id.clickformorereadingbtn);

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