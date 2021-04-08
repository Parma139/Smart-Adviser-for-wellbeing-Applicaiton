package com.example.smart_adviser_for_wellbeing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Log extends Fragment {

    private int countQnum = 0;
    private int userScore;
    private int userScoreAdd;
    private String Mood;
    private String userMood;

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
        ImageButton anxiousButton = v.findViewById(R.id.anxiousBtn);
        ImageButton sadButton = v.findViewById(R.id.sademojibtn);

        //button varable

        Button nextButton1 = v.findViewById(R.id.nextButton);
        Button closeBtnlog = v.findViewById(R.id.closeBtnlog);
        Button feelingbtn = v.findViewById(R.id.feelingbtn);

        //checkbox button variable

        CheckBox checkOpt1 = v.findViewById(R.id.checkBox1);
        CheckBox checkOpt2 = v.findViewById(R.id.checkBox2);
        CheckBox checkOpt3 = v.findViewById(R.id.checkBox3);
        CheckBox checkOpt4 = v.findViewById(R.id.checkBox4);




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
                feelingenterbtn = (View) getView().findViewById(R.id.feelingbtn);
                feelingenterbtn.setVisibility(View.INVISIBLE);
                feelingbox = (View) getView().findViewById(R.id.userfeelingInputbox);
                feelingbox.setVisibility(View.INVISIBLE);
                sadBtn = (View) getView().findViewById(R.id.sademojibtn);
                sadBtn.setVisibility(View.INVISIBLE);
                anxiousBtn = (View) getView().findViewById(R.id.anxiousBtn);
                anxiousBtn.setVisibility(View.INVISIBLE);
                String currentMood = "Happy";
                Mood = currentMood;


            }


        });

        anxiousButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                feelingQbox = (View) getView().findViewById(R.id.feelingQbox);
                feelingQbox.setVisibility(View.INVISIBLE);
                happyEmoji = (View) getView().findViewById(R.id.happyEButton);
                happyEmoji.setVisibility(View.INVISIBLE);
                feelingenterbtn = (View) getView().findViewById(R.id.feelingbtn);
                feelingenterbtn.setVisibility(View.INVISIBLE);
                feelingbox = (View) getView().findViewById(R.id.userfeelingInputbox);
                feelingbox.setVisibility(View.INVISIBLE);
                sadBtn = (View) getView().findViewById(R.id.sademojibtn);
                sadBtn.setVisibility(View.INVISIBLE);
                anxiousBtn = (View) getView().findViewById(R.id.anxiousBtn);
                anxiousBtn.setVisibility(View.INVISIBLE);
                firstMessageBox = (View) getView().findViewById(R.id.Messagebox);
                firstMessageBox.setVisibility(View.VISIBLE);
                nextButton = (View) getView().findViewById(R.id.nextButton);
                nextButton.setVisibility(View.VISIBLE);
                String currentMood = "Anxious";
                Mood = currentMood;


            }


        });

        sadButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                feelingQbox = (View) getView().findViewById(R.id.feelingQbox);
                feelingQbox.setVisibility(View.INVISIBLE);
                happyEmoji = (View) getView().findViewById(R.id.happyEButton);
                happyEmoji.setVisibility(View.INVISIBLE);
                anxiousBtn = (View) getView().findViewById(R.id.anxiousBtn);
                anxiousBtn.setVisibility(View.INVISIBLE);
                feelingenterbtn = (View) getView().findViewById(R.id.feelingbtn);
                feelingenterbtn.setVisibility(View.INVISIBLE);
                feelingbox = (View) getView().findViewById(R.id.userfeelingInputbox);
                feelingbox.setVisibility(View.INVISIBLE);
                sadBtn = (View) getView().findViewById(R.id.sademojibtn);
                sadBtn.setVisibility(View.INVISIBLE);
                firstMessageBox = (View) getView().findViewById(R.id.Messagebox);
                firstMessageBox.setVisibility(View.VISIBLE);
                nextButton = (View) getView().findViewById(R.id.nextButton);
                nextButton.setVisibility(View.VISIBLE);
                userMood = "Sad";
                Mood = userMood;


            }


        });



        //button function

        feelingbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                EditText userfeelingInput = (EditText) getView().findViewById(R.id.userfeelingInputbox);

                feelingQbox = (View) getView().findViewById(R.id.feelingQbox);
                feelingQbox.setVisibility(View.INVISIBLE);
                happyEmoji = (View) getView().findViewById(R.id.happyEButton);
                happyEmoji.setVisibility(View.INVISIBLE);
                anxiousBtn = (View) getView().findViewById(R.id.anxiousBtn);
                anxiousBtn.setVisibility(View.INVISIBLE);
                sadBtn = (View) getView().findViewById(R.id.sademojibtn);
                sadBtn.setVisibility(View.INVISIBLE);
                feelingenterbtn = (View) getView().findViewById(R.id.feelingbtn);
                feelingenterbtn.setVisibility(View.INVISIBLE);
                feelingbox = (View) getView().findViewById(R.id.userfeelingInputbox);
                feelingbox.setVisibility(View.INVISIBLE);
                firstMessageBox = (View) getView().findViewById(R.id.Messagebox);
                firstMessageBox.setVisibility(View.VISIBLE);
                nextButton = (View) getView().findViewById(R.id.nextButton);
                nextButton.setVisibility(View.VISIBLE);

                userMood = userfeelingInput.getText().toString();
                Mood = userMood;

            }

        });

        nextButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                countQnum++;                                                 // increment question number
                setQues(countQnum);
                userScore = userScore + userScoreAdd;

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

                if (countQnum == 11){

                    allQuOpt();
                    finalBoxOutput = (View) getView().findViewById(R.id.finalbox);
                    finalBoxOutput.setVisibility(View.VISIBLE);
                    closebtnlog = (View) getView().findViewById(R.id.closeBtnlog);
                    closebtnlog.setVisibility(View.VISIBLE);
                }

                //close button

                closeBtnlog.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                        closebtnlog = (View) getView().findViewById(R.id.closeBtnlog);
                        closebtnlog.setVisibility(View.INVISIBLE);
                        finalBoxOutput = (View) getView().findViewById(R.id.finalbox);
                        finalBoxOutput.setVisibility(View.INVISIBLE);
                        General GeneralFragment = new General();
                        FragmentTransaction trans = getFragmentManager().beginTransaction();
                        trans.replace(R.id.fragmentscreen_layout, GeneralFragment );
                        trans.commit();

                       // getSupportFragmentManager().beginTransaction().replace(R.id.fragmentscreen_layout, new General());

                    }

                });

            //    unCheckbox();

                if (checkOpt1.isChecked()){

                    checkOpt1.setChecked(false);
                }

                if (checkOpt2.isChecked()){

                    checkOpt2.setChecked(false);
                }

                if (checkOpt3.isChecked()){

                    checkOpt3.setChecked(false);
                }

                if (checkOpt4.isChecked()){

                    checkOpt4.setChecked(false);
                }


            }

        });

        //checkbox button function
        checkOpt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                int Score1 = 0;
                userScoreAdd = Score1;
                nextButton = (View) getView().findViewById(R.id.nextButton);
                nextButton.setVisibility(View.VISIBLE);
                //q1++;

                if (checkOpt2.isChecked()){

                    checkOpt2.setChecked(false);
                }

                if (checkOpt3.isChecked()){

                    checkOpt3.setChecked(false);
                }

                if (checkOpt4.isChecked()){

                    checkOpt4.setChecked(false);
                }




            }


        });


        checkOpt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                int Score2 = 1;
                userScoreAdd = Score2;
                nextButton = (View) getView().findViewById(R.id.nextButton);
                nextButton.setVisibility(View.VISIBLE);
                //q1++;

                if (checkOpt1.isChecked()){

                    checkOpt1.setChecked(false);
                }

                if (checkOpt3.isChecked()){

                    checkOpt3.setChecked(false);
                }

                if (checkOpt4.isChecked()){

                    checkOpt4.setChecked(false);
                }


            }


        });

        checkOpt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                int Score3 = 2;
                userScoreAdd = Score3;

                nextButton = (View) getView().findViewById(R.id.nextButton);
                nextButton.setVisibility(View.VISIBLE);
                //q1++;

                if (checkOpt2.isChecked()){

                    checkOpt2.setChecked(false);
                }

                if (checkOpt1.isChecked()){

                    checkOpt1.setChecked(false);
                }

                if (checkOpt4.isChecked()){

                    checkOpt4.setChecked(false);
                }


            }


        });

        checkOpt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                int Score4 = 4;
                userScoreAdd = Score4;

                nextButton = (View) getView().findViewById(R.id.nextButton);
                nextButton.setVisibility(View.VISIBLE);
                //q1++;

                if (checkOpt2.isChecked()){

                    checkOpt2.setChecked(false);
                }

                if (checkOpt3.isChecked()){

                    checkOpt3.setChecked(false);
                }

                if (checkOpt1.isChecked()){

                    checkOpt1.setChecked(false);
                }


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
    View finalBoxOutput;
    View closebtnlog;
    View happyBtn;
    View anxiousBtn;
    View sadBtn;
    View feelingenterbtn;
    View feelingbox;


    // setques
    public void setQues(int quesNum){

        TextView questionOutput;
        questionOutput = getView().findViewById(R.id.quesBox);

        switch (quesNum){
            case 1:
                questionOutput.setText("Question 1");
                break;
            case 2:
                questionOutput.setText("Question 2");
                break;
            case 3:
                questionOutput.setText("Question 3");
                break;
            case 4:
                questionOutput.setText("Question 4");
                break;
            case 5:
                questionOutput.setText("Question 5");
                break;
            case 6:
                questionOutput.setText("Question 6");
                break;
            case 7:
                questionOutput.setText("Question 7");
                break;
            case 8:
                questionOutput.setText("Question 8");
                break;
            case 9:
                questionOutput.setText("Question 9");
                break;
            case 10:
                questionOutput.setText("Question 10");
                break;

        }
    }


    public void allQuOpt(){


        quesBox = (View) getView().findViewById(R.id.quesBox);
        quesBox.setVisibility(View.INVISIBLE);
        checkBox1 = (View) getView().findViewById(R.id.checkBox1);
        checkBox1.setVisibility(View.INVISIBLE);
        checkBox2 = (View) getView().findViewById(R.id.checkBox2);
        checkBox2.setVisibility(View.INVISIBLE);
        checkBox3 = (View) getView().findViewById(R.id.checkBox3);
        checkBox3.setVisibility(View.INVISIBLE);
        checkBox4 = (View) getView().findViewById(R.id.checkBox4);
        checkBox4.setVisibility(View.INVISIBLE);

        if (Mood.equals("Happy")) {
            happyResult(userScore);
        }
        if (Mood.equals("Anxious") || Mood.equals("Sad")){
            anxiousResult(userScore);
        }
        if (Mood.equals(userMood)){
            sadResult(userScore);
        }

    }


    /** fucntion for happymood
     *
     */


    TextView finalBoxoutput;

    public void happyResult(int Score) {

        // 0 means positive and 40 means negative
        finalBoxoutput = getView().findViewById(R.id.finalbox);

            if (Score >= 0 & Score <= 10 ) {

              finalBoxoutput.setText("You got: " + userScore + "/40 \nYeah! you feeling " + Mood);

            }

            if (Score >= 10 & Score <= 20 ) {

            finalBoxoutput.setText("You got: " + userScore + "/40 \nYou are feeling " + Mood + " might be little bit you are unhappy");

            }

            if (Score >= 20 & Score <=30) {

            finalBoxoutput.setText("You got: " + userScore + "/40 \nChances are less that you are feeling " + Mood);

            }

            if (Score >= 30 & Score <=40) {

            finalBoxoutput.setText("You got: " + userScore + "/40 \nChances are very less that you feeling " + Mood);

            }
    }

    /** fucntion for anxiousMood
     *
     */

    public void anxiousResult(int Score) {

        finalBoxoutput = getView().findViewById(R.id.finalbox);


        if (Score >= 0 & Score <= 10 ) {

            finalBoxoutput.setText("You got: " + userScore + "/40 \nChances are very less that you feeling " + Mood);

        }

        if (Score >= 10 & Score <= 20 ) {

            finalBoxoutput.setText("You got: " + userScore + "/40 \nChances are less that you feeling " + Mood );

        }

        if (Score >= 20 & Score <=30) {

            finalBoxoutput.setText("You got: " + userScore + "/40 \nChances are higher that you are feeling " + Mood);

        }

        if (Score >= 30 & Score <=40) {

            finalBoxoutput.setText("You got: " + userScore + "/40 \nChances are very higher that you are feeling " + Mood);

        }

    }

    public void sadResult(int Score) {

        finalBoxoutput = getView().findViewById(R.id.finalbox);


        if (Score >= 0 & Score <= 10 ) {

            finalBoxoutput.setText("You got: " + userScore + "/40 \n Chances are very less that you feeling " + Mood);

        }

        if (Score >= 10 & Score <= 20 ) {

            finalBoxoutput.setText("You got: " + userScore + "/40 \n Chances are less that you feeling " + Mood );

        }

        if (Score >= 20 & Score <=30) {

            finalBoxoutput.setText("You got: " + userScore + "/40 \n Chances are higher that you are feeling " + Mood);

        }

        if (Score >= 30 & Score <=40) {

            finalBoxoutput.setText("You got: " + userScore + "/40 \n Chances are very higher that you are feeling " + Mood);

        }

    }

}