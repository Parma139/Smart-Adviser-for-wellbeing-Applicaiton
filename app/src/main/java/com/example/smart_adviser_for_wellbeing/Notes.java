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
public class Notes extends Fragment {

    public Notes() {
        // Required empty public constructor
    }


    Button addNotebtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notes, container, false);

        addNotebtn = view.findViewById(R.id.addBtn);

        // this handle the add note button activity
        addNotebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), NoteDetailActivity.class);
                startActivity(newNoteIntent);
            }

        });

        return view;
    }

  }