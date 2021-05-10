package com.example.smart_adviser_for_wellbeing;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Notes extends Fragment {

    public Notes() {
        // Required empty public constructor
    }



    RecyclerView recyclerView;
    FloatingActionButton floatingActionButton;
    Adapter adapter;
    //List<Model> notesList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notes, container, false);
        Button newNotebtn = view.findViewById(R.id.addBtn);




        newNotebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newNoteIntent = new Intent(view.getContext(), NoteDetailActivity.class);
                startActivity(newNoteIntent);
            }


        });


        return view;
    }


  }