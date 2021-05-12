package com.example.smart_adviser_for_wellbeing;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Home extends Fragment {


    public Home() {
        // Required empty public constructor
    }


    Button btnHru, btnVrpt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //    return inflater.inflate(R.layout.fragment_general, container, false);


       btnHru = view.findViewById(R.id.btnHru);
       btnVrpt = view.findViewById(R.id.viewreport);

        // this handle the how are you button activity
        btnHru.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), FeelingQ.class);
                startActivity(newNoteIntent);
            }

        });
        // this handle the view report button activity
        btnVrpt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), ViewReport.class);
                startActivity(newNoteIntent);
            }

        });

        return view;

    }


}