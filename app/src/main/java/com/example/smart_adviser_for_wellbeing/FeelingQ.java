package com.example.smart_adviser_for_wellbeing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class FeelingQ extends AppCompatActivity {


    private int countQnum = 0;
    private int userScore;
    private int userScoreAdd;
    public String Mood;
    public String userMood;
    private static String moodforNpage = "Click on how you feeling today in HomePage";



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeling_q);

        Button closebtnfeelingQ = findViewById(R.id.closeBtnlog);

        closebtnfeelingQ.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                finish();
            }

        });
    }




    //Image button function

        int happybtn, anxiousbtn, sadbtn, feelingbtn, nextBtn, closebtn, ques1btn, ques2btn, ques3btn, ques4btn;

    public void happybtn(View v){

        feelingQbox = findViewById(R.id.feelingQbox);
        feelingQbox.setVisibility(View.INVISIBLE);
        happyEmoji = findViewById(R.id.happyEButton);
        happyEmoji.setVisibility(View.INVISIBLE);
        firstMessageBox = findViewById(R.id.Messagebox);
        firstMessageBox.setVisibility(View.VISIBLE);
        nextButton = findViewById(R.id.nextButton);
        nextButton.setVisibility(View.VISIBLE);
        feelingenterbtn = findViewById(R.id.feelingbtn);
        feelingenterbtn.setVisibility(View.INVISIBLE);
        feelingbox = findViewById(R.id.userfeelingInputbox);
        feelingbox.setVisibility(View.INVISIBLE);
        sadBtn = findViewById(R.id.sademojibtn);
        sadBtn.setVisibility(View.INVISIBLE);
        anxiousBtn =findViewById(R.id.anxiousBtn);
        anxiousBtn.setVisibility(View.INVISIBLE);

        String currentMood = "Happy";
        Mood = currentMood;
        moodforNpage = currentMood;


    }





    public void anxiousbtn(View v){

        feelingQbox = findViewById(R.id.feelingQbox);
        feelingQbox.setVisibility(View.INVISIBLE);
        happyEmoji = findViewById(R.id.happyEButton);
        happyEmoji.setVisibility(View.INVISIBLE);
        feelingenterbtn = findViewById(R.id.feelingbtn);
        feelingenterbtn.setVisibility(View.INVISIBLE);
        feelingbox =findViewById(R.id.userfeelingInputbox);
        feelingbox.setVisibility(View.INVISIBLE);
        sadBtn = findViewById(R.id.sademojibtn);
        sadBtn.setVisibility(View.INVISIBLE);
        anxiousBtn = findViewById(R.id.anxiousBtn);
        anxiousBtn.setVisibility(View.INVISIBLE);
        firstMessageBox =findViewById(R.id.Messagebox);
        firstMessageBox.setVisibility(View.VISIBLE);
        nextButton = findViewById(R.id.nextButton);
        nextButton.setVisibility(View.VISIBLE);

        String currentMood = "Anxious";
        Mood = currentMood;
        moodforNpage = currentMood;

    }





    public void sadbtn(View v){

        feelingQbox = findViewById(R.id.feelingQbox);
        feelingQbox.setVisibility(View.INVISIBLE);
        happyEmoji = findViewById(R.id.happyEButton);
        happyEmoji.setVisibility(View.INVISIBLE);
        anxiousBtn = findViewById(R.id.anxiousBtn);
        anxiousBtn.setVisibility(View.INVISIBLE);
        feelingenterbtn = findViewById(R.id.feelingbtn);
        feelingenterbtn.setVisibility(View.INVISIBLE);
        feelingbox = findViewById(R.id.userfeelingInputbox);
        feelingbox.setVisibility(View.INVISIBLE);
        sadBtn = findViewById(R.id.sademojibtn);
        sadBtn.setVisibility(View.INVISIBLE);
        firstMessageBox = findViewById(R.id.Messagebox);
        firstMessageBox.setVisibility(View.VISIBLE);
        nextButton = findViewById(R.id.nextButton);
        nextButton.setVisibility(View.VISIBLE);

        userMood = "Sad";
        Mood = userMood;
        moodforNpage = userMood;

    }




    public void feelingbtn(View v){

        EditText userfeelingInput = findViewById(R.id.userfeelingInputbox);

            feelingQbox = findViewById(R.id.feelingQbox);
            feelingQbox.setVisibility(View.INVISIBLE);
            happyEmoji =findViewById(R.id.happyEButton);
            happyEmoji.setVisibility(View.INVISIBLE);
            anxiousBtn = findViewById(R.id.anxiousBtn);
            anxiousBtn.setVisibility(View.INVISIBLE);
            sadBtn = findViewById(R.id.sademojibtn);
            sadBtn.setVisibility(View.INVISIBLE);
            feelingenterbtn =findViewById(R.id.feelingbtn);
            feelingenterbtn.setVisibility(View.INVISIBLE);
            feelingbox =findViewById(R.id.userfeelingInputbox);
            feelingbox.setVisibility(View.INVISIBLE);
            firstMessageBox = findViewById(R.id.Messagebox);
            firstMessageBox.setVisibility(View.VISIBLE);
            nextButton = findViewById(R.id.nextButton);
            nextButton.setVisibility(View.VISIBLE);

            userMood = userfeelingInput.getText().toString();
            Mood = userMood;

        moodforNpage=userfeelingInput.getText().toString().trim();



    }




    public void nextBtn(View v) {

        countQnum++;                                                 // increment question number
        setQues(countQnum);


            userScore = userScore + userScoreAdd;
            nextButton = findViewById(R.id.nextButton);
            nextButton.setVisibility(View.INVISIBLE);
            nextButton = findViewById(R.id.Messagebox);
            nextButton.setVisibility(View.INVISIBLE);

            quesBox = findViewById(R.id.quesBox);
            quesBox.setVisibility(View.VISIBLE);
            checkBox1 = findViewById(R.id.checkBox1);
            checkBox1.setVisibility(View.VISIBLE);
            checkBox2 = findViewById(R.id.checkBox2);
            checkBox2.setVisibility(View.VISIBLE);
            checkBox3 = findViewById(R.id.checkBox3);
            checkBox3.setVisibility(View.VISIBLE);
            checkBox4 = findViewById(R.id.checkBox4);
            checkBox4.setVisibility(View.VISIBLE);

            uncheckallbox();
            questionNoBoxV = findViewById(R.id.questionNo);
            questionNoBoxV.setVisibility(View.VISIBLE);
            questionNobox = findViewById(R.id.questionNo);
            questionNobox.setText("Question no: " + countQnum  + " / " + 16 );

            if (countQnum == 17) {

                allQuOpt();
                finalBoxOutput = findViewById(R.id.finalbox);
                finalBoxOutput.setVisibility(View.VISIBLE);
                questionNoBoxV = findViewById(R.id.questionNo);
                questionNoBoxV.setVisibility(View.INVISIBLE);
                uncheckallbox();
                closebtnlog = findViewById(R.id.closeBtnlog);
                closebtnlog.setVisibility(View.VISIBLE);
            }

    }


    //checkbox button function

    public void ques1btn(View v){

        int Score1 = 0;
        userScoreAdd = Score1;

        CheckBox checkOpt1 = findViewById(R.id.checkBox1);
        CheckBox checkOpt2 = findViewById(R.id.checkBox2);
        CheckBox checkOpt3 = findViewById(R.id.checkBox3);
        CheckBox checkOpt4 = findViewById(R.id.checkBox4);

        nextButton =findViewById(R.id.nextButton);
        nextButton.setVisibility(View.VISIBLE);

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


    public void ques2btn(View v){

        int Score2 = 1;
        userScoreAdd = Score2;

        CheckBox checkOpt1 = findViewById(R.id.checkBox1);
        CheckBox checkOpt2 = findViewById(R.id.checkBox2);
        CheckBox checkOpt3 = findViewById(R.id.checkBox3);
        CheckBox checkOpt4 = findViewById(R.id.checkBox4);

        nextButton = findViewById(R.id.nextButton);
        nextButton.setVisibility(View.VISIBLE);


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


    public void ques3btn(View v){

        int Score3 = 2;
        userScoreAdd = Score3;

        CheckBox checkOpt1 = findViewById(R.id.checkBox1);
        CheckBox checkOpt2 = findViewById(R.id.checkBox2);
        CheckBox checkOpt3 = findViewById(R.id.checkBox3);
        CheckBox checkOpt4 = findViewById(R.id.checkBox4);

        nextButton =findViewById(R.id.nextButton);
        nextButton.setVisibility(View.VISIBLE);

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



    public void ques4btn(View v){

        int Score4 = 3;
        userScoreAdd = Score4;

        CheckBox checkOpt1 = findViewById(R.id.checkBox1);
        CheckBox checkOpt2 = findViewById(R.id.checkBox2);
        CheckBox checkOpt3 = findViewById(R.id.checkBox3);

        nextButton = findViewById(R.id.nextButton);
        nextButton.setVisibility(View.VISIBLE);

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
       View questionNoBoxV;

    // setques
    public void setQues(int quesNum){

       TextView questionOutput;
       questionOutput = findViewById(R.id.quesBox);

       switch (quesNum){
            case 1:
                questionOutput.setText("Do you find it hard to stop thinking about what happened?");
                break;
            case 2:
                questionOutput.setText("Do you feel tense, nervous or unable to relax?");
                break;
            case 3:
                questionOutput.setText("Do you quickly get irritated?");
                break;
            case 4:
                questionOutput.setText("Do you feel resentful towards other people or situations?");
                break;
            case 5:
                questionOutput.setText("Do you find difficulties in concentration?");
                break;
            case 6:
                questionOutput.setText("Are you struggling to make a decision?");
                break;
            case 7:
                questionOutput.setText("Are you constantly worrying?");
                break;
            case 8:
                questionOutput.setText("Are you feeling unemotional?");
                break;
            case 9:
                questionOutput.setText("Are you feeling low and losing pleasure in things that were once enjoyable?");
                break;
            case 10:
                questionOutput.setText("Are you feeling down, depressed or hopeless?");
                break;
           case 11:
               questionOutput.setText("Are you Trouble falling asleep, staying asleep, or sleeping too much?");
               break;
           case 12:
               questionOutput.setText("Do you get thoughts of being better off dead or of hurting yourself in some way?");
               break;
           case 13:
               questionOutput.setText("Are you feeling nervous, anxious or on edge?");
               break;
           case 14:
               questionOutput.setText("Are you not being able to stop or control worrying?");
               break;
           case 15:
               questionOutput.setText("Are you worrying too much about different things?");
               break;
           case 16:
               questionOutput.setText("Are you feeling afraid as if something awful might happen?");
               break;
       }
    }


    public void allQuOpt(){

        quesBox = (View) findViewById(R.id.quesBox);
        quesBox.setVisibility(View.INVISIBLE);
        checkBox1 = (View) findViewById(R.id.checkBox1);
        checkBox1.setVisibility(View.INVISIBLE);
        checkBox2 = (View) findViewById(R.id.checkBox2);
        checkBox2.setVisibility(View.INVISIBLE);
        checkBox3 = (View) findViewById(R.id.checkBox3);
        checkBox3.setVisibility(View.INVISIBLE);
        checkBox4 = (View)findViewById(R.id.checkBox4);
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



    TextView finalBoxoutput;
    TextView questionNobox;


    public void happyResult(int Score) {

        // 0 means positive and 48 means negative
        finalBoxoutput = findViewById(R.id.finalbox);


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


    public void anxiousResult(int Score) {

        finalBoxoutput = findViewById(R.id.finalbox);


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

        finalBoxoutput = findViewById(R.id.finalbox);


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


    public void uncheckallbox(){


        CheckBox checkOpt1 = findViewById(R.id.checkBox1);
        CheckBox checkOpt2 = findViewById(R.id.checkBox2);
        CheckBox checkOpt3 = findViewById(R.id.checkBox3);
        CheckBox checkOpt4 = findViewById(R.id.checkBox4);

        if (checkOpt1.isChecked()) {

            checkOpt1.setChecked(false);
        }

        if (checkOpt2.isChecked()) {

            checkOpt2.setChecked(false);
        }

        if (checkOpt3.isChecked()) {

            checkOpt3.setChecked(false);
        }

        if (checkOpt4.isChecked()) {

            checkOpt4.setChecked(false);
        }


    }



    public static String getmood() {
        return moodforNpage;
    }

}