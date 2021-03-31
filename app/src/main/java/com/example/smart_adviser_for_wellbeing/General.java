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
        Button Hbtn = v.findViewById(R.id.happybtn);
        Button Sbtn = v.findViewById(R.id.sadbtn);
        Button Anbtn = v.findViewById(R.id.Anxiety);
        Button AnOpWnttoreadbtn = v.findViewById(R.id.Wantoread);
        Button AnOpNobtn = v.findViewById(R.id.NoOpt);
        Button Timbtn = v.findViewById(R.id.TimeManagement);
        Button Nonbtn = v.findViewById(R.id.None);




    //********btn for how are you feeling today
        btn.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){

                hide();
                hbtn = (View) getView().findViewById(R.id.happybtn);
                hbtn.setVisibility(View.VISIBLE);
                sbtn = (View) getView().findViewById(R.id.sadbtn);
                sbtn.setVisibility(View.VISIBLE);
            }

        });

        //######btn for how are you feeling today


        //*********** btn for option happy
        Hbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Toast.makeText(getContext(), "Happy emoji need to set", Toast.LENGTH_SHORT).show();

                sbtn = (View) getView().findViewById(R.id.sadbtn);
                sbtn.setVisibility(View.INVISIBLE);
                hbtn = (View) getView().findViewById(R.id.happybtn);
                hbtn.setVisibility(View.INVISIBLE);
                showMainBtn();
            }

        });
        //################ btn for option haooy


        //********btn for option sad

        Sbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                //Toast.makeText(getContext(), "i am in sasdbutton", Toast.LENGTH_SHORT).show();
                hbtn = (View) getView().findViewById(R.id.happybtn);
                hbtn.setVisibility(View.INVISIBLE);
                hbtn = (View) getView().findViewById(R.id.sadbtn);
                hbtn.setVisibility(View.INVISIBLE);

                AnVbtn = (View) getView().findViewById(R.id.Anxiety);
                AnVbtn.setVisibility(View.VISIBLE);
                TimeVbtn = (View) getView().findViewById(R.id.TimeManagement);
                TimeVbtn.setVisibility(View.VISIBLE);
                NoneVbtn = (View) getView().findViewById(R.id.None);
                NoneVbtn.setVisibility(View.VISIBLE);


            }

        });
        //################ btn for option sad

        //***//
        //**********Anxiety option btn btn for how are you feeling today

        Anbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Toast.makeText(getContext(), "I am in anxxiety", Toast.LENGTH_SHORT).show();

                sbtn = (View) getView().findViewById(R.id.sadbtn);
                sbtn.setVisibility(View.INVISIBLE);
                hbtn = (View) getView().findViewById(R.id.happybtn);
                hbtn.setVisibility(View.INVISIBLE);
                TimeVbtn = (View) getView().findViewById(R.id.TimeManagement);
                TimeVbtn.setVisibility(View.INVISIBLE);
                NoneVbtn = (View) getView().findViewById(R.id.None);
                NoneVbtn.setVisibility(View.INVISIBLE);
                AnVbtn = (View) getView().findViewById(R.id.Anxiety);
                AnVbtn.setVisibility(View.INVISIBLE);

                WnttoRead  = (View) getView().findViewById(R.id.Wantoread);
                WnttoRead.setVisibility(View.VISIBLE);
                OptYes = (View) getView().findViewById(R.id.yesoptAn);
                OptYes.setVisibility(View.VISIBLE);
                OptNo = (View) getView().findViewById(R.id.NoOpt);
                OptNo.setVisibility(View.VISIBLE);

            }
        });
        //################ anxiety otpion btn for option haooy

        //**********Option in Anxiety option btn btn for how are you feeling today
//
//        AnOpYesbtn.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//
//                Toast.makeText(getContext(), "I am in yes", Toast.LENGTH_SHORT).show();
//
//
//
//
//            }
//        });
        //################ Option in anxiety otpion btn for option haooy

        //**********AnNoopt tbn in Anxiety option btn btn for how are you feeling today

        AnOpNobtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                //Toast.makeText(getContext(), "I am in yes", Toast.LENGTH_SHORT).show();
                WnttoRead  = (View) getView().findViewById(R.id.Wantoread);
                WnttoRead.setVisibility(View.INVISIBLE);
                OptYes = (View) getView().findViewById(R.id.yesoptAn);
                OptYes.setVisibility(View.INVISIBLE);
                OptTimeYes = (View) getView().findViewById(R.id.YesOpt);
                OptTimeYes.setVisibility(View.INVISIBLE);
                OptNo = (View) getView().findViewById(R.id.NoOpt);
                OptNo.setVisibility(View.INVISIBLE);
                showMainBtn();



            }
        });
        //################ AnNoopt in anxiety otpion btn for option haooy
        //***//


        //***//

        //timemanangement option in anxiety button

        Timbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Toast.makeText(getContext(), "I am in anxxiety", Toast.LENGTH_SHORT).show();

                sbtn = (View) getView().findViewById(R.id.sadbtn);
                sbtn.setVisibility(View.INVISIBLE);
                hbtn = (View) getView().findViewById(R.id.happybtn);
                hbtn.setVisibility(View.INVISIBLE);
                TimeVbtn = (View) getView().findViewById(R.id.TimeManagement);
                TimeVbtn.setVisibility(View.INVISIBLE);
                NoneVbtn = (View) getView().findViewById(R.id.None);
                NoneVbtn.setVisibility(View.INVISIBLE);
                AnVbtn = (View) getView().findViewById(R.id.Anxiety);
                AnVbtn.setVisibility(View.INVISIBLE);

                WnttoRead  = (View) getView().findViewById(R.id.Wantoread);
                WnttoRead.setVisibility(View.VISIBLE);
                OptYes = (View) getView().findViewById(R.id.YesOpt);
                OptYes.setVisibility(View.VISIBLE);
                OptNo = (View) getView().findViewById(R.id.NoOpt);
                OptNo.setVisibility(View.VISIBLE);

            }
        });
        //Non option in anxiety button


        Nonbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                TimeVbtn  = (View) getView().findViewById(R.id.TimeManagement);
                TimeVbtn.setVisibility(View.INVISIBLE);
                AnVbtn = (View) getView().findViewById(R.id.Anxiety);
                AnVbtn.setVisibility(View.INVISIBLE);
                NoneVbtn = (View) getView().findViewById(R.id.None);
                NoneVbtn.setVisibility(View.INVISIBLE);
                showMainBtn();


            }
        });


        //Noneoption  in anxiety button
        //**//

        //**********finish btn for how are you feeling today

        //for location
        fratime = v.findViewById(R.id.YesOpt);
        fratime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TimeMnangement timeManagementFragment = new TimeMnangement();
                FragmentTransaction trans = getFragmentManager().beginTransaction();
                trans.replace(R.id.main, timeManagementFragment);
                trans.commit();
                WnttoRead  = (View) getView().findViewById(R.id.Wantoread);
                WnttoRead.setVisibility(View.INVISIBLE);
                OptYes = (View) getView().findViewById(R.id.YesOpt);
                OptYes.setVisibility(View.INVISIBLE);
                OptNo = (View) getView().findViewById(R.id.NoOpt);
                OptNo.setVisibility(View.INVISIBLE);

            }


        });

        fraAn = v.findViewById(R.id.yesoptAn);
        fraAn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Anxiety AnxietyFragment = new Anxiety();
                FragmentTransaction trans = getFragmentManager().beginTransaction();
                trans.replace(R.id.main, AnxietyFragment);
                trans.commit();
                WnttoRead  = (View) getView().findViewById(R.id.Wantoread);
                WnttoRead.setVisibility(View.INVISIBLE);
                OptYes = (View) getView().findViewById(R.id.yesoptAn);
                OptYes.setVisibility(View.INVISIBLE);
                OptNo = (View) getView().findViewById(R.id.NoOpt);
                OptNo.setVisibility(View.INVISIBLE);

            }


        });
        //for location

        return v;

    }

    //******hide function  for after clicki how are you feeling today
    View logo;
    View btn1;
    View btn2;
    View btn3;
    View hbtn;
    View sbtn;
    View hicon;
    View AnVbtn;
    View TimeVbtn;
    View NoneVbtn;
    View WnttoRead;
    View OptYes;
    View OptNo;
    View OptTimeYes;

    public void hide() {

        hicon = (View) getView().findViewById(R.id.homeIcon);
        hicon.setVisibility(View.INVISIBLE);
        logo = (View) getView().findViewById(R.id.imageView);
        logo.setVisibility(View.INVISIBLE);
        btn1 = (View) getView().findViewById(R.id.btnHru);
        btn1.setVisibility(View.INVISIBLE);
        btn2 = (View) getView().findViewById(R.id.btnHuseapp);
        btn2.setVisibility(View.INVISIBLE);
        btn3 = (View) getView().findViewById(R.id.btnAboutapp);
        btn3.setVisibility(View.INVISIBLE);


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
        btn3 = (View) getView().findViewById(R.id.btnAboutapp);
        btn3.setVisibility(View.VISIBLE);


    }


}