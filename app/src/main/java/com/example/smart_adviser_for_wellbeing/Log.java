package com.example.smart_adviser_for_wellbeing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Log extends Fragment {



    public Log() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_log, container, false);
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_log, container, false);
        //Image button variable
        ImageButton happyButton = v.findViewById(R.id.happyEButton);

        //button varable

        Button nextButton1 = v.findViewById(R.id.nextButton);

        //Image button function
        happyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                feelingQbox = (View) getView().findViewById(R.id.feelingQbox);
                feelingQbox.setVisibility(View.INVISIBLE);
                happyEmoji = (View) getView().findViewById(R.id.happyEButton);
                happyEmoji.setVisibility(View.INVISIBLE);
                firstMessageBox = (View) getView().findViewById(R.id.Messagebox);
                firstMessageBox.setVisibility(View.VISIBLE);
                nextButton = (View) getView().findViewById(R.id.nextButton);
                nextButton.setVisibility(View.VISIBLE);

            }


        });

        //button function

        nextButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int q1 = 1;
               // q1++;
                setQues(q1);

                nextButton = (View) getView().findViewById(R.id.nextButton);
                nextButton.setVisibility(View.INVISIBLE);
                nextButton = (View) getView().findViewById(R.id.Messagebox);
                nextButton.setVisibility(View.INVISIBLE);

                quesBox = (View) getView().findViewById(R.id.quesBox);
                quesBox.setVisibility(View.VISIBLE);
                checkBox1 = (View) getView().findViewById(R.id.checkBox1);
                checkBox1.setVisibility(View.VISIBLE);
                checkBox2 = (View) getView().findViewById(R.id.checkBox2);
                checkBox2.setVisibility(View.VISIBLE);
                checkBox3 = (View) getView().findViewById(R.id.checkBox3);
                checkBox3.setVisibility(View.VISIBLE);
                checkBox4 = (View) getView().findViewById(R.id.checkBox4);
                checkBox4.setVisibility(View.VISIBLE);



            }

        });


        return v;

    }

    //variable for vissible variables in current fragment
    View firstMessageBox;
    View feelingQbox;
    View happyEmoji;
    View nextButton;
    View checkBox1;
    View checkBox2;
    View checkBox3;
    View checkBox4;
    View quesBox;


    // setques
    public void setQues(int q){

        TextView questionOutput;
        questionOutput = getView().findViewById(R.id.quesBox);

        switch (q){
            case 1:
                questionOutput.setText("how are you I am in q1");
                break;
            case 2:
                questionOutput.setText("how are you I am in q2");
                break;
            case 3:
                questionOutput.setText("how are you I am in q3");
                break;
            case 4:
                questionOutput.setText("how are you I am in q4");
                break;
            case 5:
                questionOutput.setText("how are you I am in q5");
                break;
            case 6:
                questionOutput.setText("how are you I am in q6");
                break;
            case 7:
                questionOutput.setText("how are you I am in q7");
                break;
            case 8:
                questionOutput.setText("how are you I am in q8");
                break;
            case 9:
                questionOutput.setText("how are you I am in q9");
                break;
            case 10:
                questionOutput.setText("how are you I am in q10");
                break;

        }
    }

   // public void hide
}