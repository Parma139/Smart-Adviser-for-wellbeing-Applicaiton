package com.example.smart_adviser_for_wellbeing;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;

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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reading, container, false);

        Button readinganxietyPageBtn = view.findViewById(R.id.anxietyReadBtn);



        readinganxietyPageBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), ReadingContentPage.class);
                startActivity(newNoteIntent);


            }

        });

        Button timeManagementbtn = view.findViewById(R.id.timemanagementReadbtn);

        timeManagementbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), ReadingContentPage.class);
                startActivity(newNoteIntent);




            }

        });


        return view;
    }


}