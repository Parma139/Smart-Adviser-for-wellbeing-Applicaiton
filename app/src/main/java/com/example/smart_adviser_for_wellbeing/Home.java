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



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //    return inflater.inflate(R.layout.fragment_general, container, false);

        //********vriable for button
        Button btnHru = view.findViewById(R.id.btnHru);
        Button btnVrpt = view.findViewById(R.id.viewreport);


        btnHru.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), FeelingQ.class);
                startActivity(newNoteIntent);
            }

        });

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