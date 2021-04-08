package com.example.smart_adviser_for_wellbeing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class General extends Fragment {

    Button fratime;
    Button fraAn;

    public General() {

        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View v = inflater.inflate(R.layout.fragment_general, container, false);
    //main code//    return inflater.inflate(R.layout.fragment_general, container, false);



     //********vriable for button
        Button btn = v.findViewById(R.id.btnHru);




    //********btn for how are you feeling today
        btn.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){

               hide();
//             navigationbutton = (View) getView().findViewById(R.id.bottomNavigationview);
//             navigationbutton.setVisibility(View.INVISIBLE);
               Log LogFragemnt = new Log();
               FragmentTransaction trans = getFragmentManager().beginTransaction();
               trans.replace(R.id.main, LogFragemnt);
               trans.commit();
            }

        });

        return v;

    }

    //******hide function  for after clicki how are you feeling today
    View logo;
    View btn1;
    View btn2;
    View btn3;
    View hicon;
    View navigationbutton;


    public void hide() {

        hicon = (View) getView().findViewById(R.id.homeIcon);
        hicon.setVisibility(View.INVISIBLE);
        logo = (View) getView().findViewById(R.id.imageView);
        logo.setVisibility(View.INVISIBLE);
        btn1 = (View) getView().findViewById(R.id.btnHru);
        btn1.setVisibility(View.INVISIBLE);
        btn2 = (View) getView().findViewById(R.id.btnHuseapp);
        btn2.setVisibility(View.INVISIBLE);



    }

    //############hide function  for after clicki how are you feeling today

    //****** showMainBtn funtionc  for after clicki feelinghappy
    public void showMainBtn(){

        hicon = (View) getView().findViewById(R.id.homeIcon);
        hicon.setVisibility(View.VISIBLE);
        logo = (View) getView().findViewById(R.id.imageView);
        logo.setVisibility(View.VISIBLE);
        btn1 = (View) getView().findViewById(R.id.btnHru);
        btn1.setVisibility(View.VISIBLE);
        btn2 = (View) getView().findViewById(R.id.btnHuseapp);
        btn2.setVisibility(View.VISIBLE);



    }


}