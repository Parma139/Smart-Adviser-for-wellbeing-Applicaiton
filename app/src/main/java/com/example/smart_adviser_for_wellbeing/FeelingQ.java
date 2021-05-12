package com.example.smart_adviser_for_wellbeing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class FeelingQ extends AppCompatActivity {


    private static int countQnum;
    private static int userScore;
    private static int userScoreAdd;
    private  static int userScoreforViewR;
    private static int anxietyScore;
    private static int angerScore;
    private static int stressScore;
    private static int depressionScore;
    public  static String Mood;
    public  static String userMood;
    private static String moodforNpage = "N/A";
    public  static String scoreDate;
    static  int Score1;
    static  int Score2;
    static  int Score3;
    static  int Score4;

    Button closebtnfeelingQ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeling_q);

        Date date = Calendar.getInstance().getTime();           // access the current date
        scoreDate = DateFormat.getDateInstance().format(date);  //hold the date in months days, year

        closebtnfeelingQ = findViewById(R.id.closeBtnlog);      //assign the button

        // this handle the close button activity
        closebtnfeelingQ.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

               finish();                                     // close the feelingQ layout page

            }

        });
    }

    String currentMood;                 //hold the string variable for current mood

    /*
     This method is called when the user clicks the feeling happy button
     */
    public void happybtn(View v){

        visibilityforSelectFeeling();
        currentMood = "Happy";
        setMood(currentMood);
        resetScore();
    }

    /*
    This method is called when the user clicks the feeling anxious button
    */

    public void anxiousbtn(View v){

        visibilityforSelectFeeling();
        currentMood = "Anxious";
        setMood(currentMood);
        resetScore();
    }

    /*
    This method is called when the user clicks the feeling stress button
    */

    public void stressbtn(View v){

        visibilityforSelectFeeling();
        currentMood = "Stress";
        setMood(currentMood);
        resetScore();
    }

    /*
    This method is called when the user clicks the feeling depressed button
    */
    public void depressiontn(View v){

        visibilityforSelectFeeling();
        currentMood = "Depression";
        setMood(currentMood);
        resetScore();

    }

    /*
    This method is called when the user clicks on entering the feeling manually
    */
    public void feelingbtn(View v){

        EditText userfeelingInput = findViewById(R.id.userfeelingInputbox);
        visibilityforSelectFeeling();
        userMood = userfeelingInput.getText().toString();
        Mood = userMood;
        moodforNpage=userfeelingInput.getText().toString().trim(); // moodforNpage hold string variable which is pass to note page
        resetScore();
    }

    /*
    This method is called when the user clicks the next button selecting a options for given quesitons
    */
    public void nextBtn(View v) {

        countQnum++;                                           // increment the countQnum which is use to change the question number
        setQues(countQnum);

            userScore = userScore + userScoreAdd;
            scoreForall();

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

            uncheckallbox();                                    //clear the selected option
            questionNoBoxV = findViewById(R.id.questionNo);
            questionNoBoxV.setVisibility(View.VISIBLE);
            questionNobox = findViewById(R.id.questionNo);
            questionNobox.setText("Question no: " + countQnum  + " / " + 16 );


            // if statement use to open a score with overall result after answering the 16 questions
            if (countQnum == 17) {

                allQuOpt();   // hide all the quesitons, options and then dispaly the result
                finalBoxOutput = findViewById(R.id.finalbox);
                finalBoxOutput.setVisibility(View.VISIBLE);
                questionNoBoxV = findViewById(R.id.questionNo);
                questionNoBoxV.setVisibility(View.INVISIBLE);
                uncheckallbox();
                closebtnlog = findViewById(R.id.closeBtnlog);
                closebtnlog.setVisibility(View.VISIBLE);
                userScoreforViewR = userScore;


            }

    }

    /*
     This method is called when the user clicks on option 1
     */
    public void ques1btn(View v){

        Score1 = 0;                     // assign the score value for option 1
        userScoreAdd = Score1;

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

    /*
     This method is called when the user clicks on options 2
     */
    public void ques2btn(View v){

        Score2 = 1;                             // assign the score value for options 2
        userScoreAdd = Score2;

        CheckBox checkOpt1 = findViewById(R.id.checkBox1);
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

    /*
     This method is called when the user clicks on options 3
     */
    public void ques3btn(View v){

        Score3 = 2;                             //assign the value for options 3
        userScoreAdd = Score3;

        CheckBox checkOpt1 = findViewById(R.id.checkBox1);
        CheckBox checkOpt2 = findViewById(R.id.checkBox2);
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

    /*
     This method is called when the user clicks on options 4
     */
    public void ques4btn(View v){

        Score4 = 3;                     //assign the value for options 4
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

    /*
    all the variable is used for view box  in the FeelingQ layout
     */
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
       View depressBtn;
       View anxiousBtn;
       View stressBtn;
       View feelingenterbtn;
       View feelingbox;
       View questionNoBoxV;
       TextView finalBoxoutput;
       TextView questionNobox;

    /**
     * This method is used to assign dispay the quesiton
     * @param quesNum quesNum hold int variable which is question number and then it passes to switch statement to display the questions
     */
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

    /*
    This method is used to hide the quesbox view and checkboxes view
     */
    public void allQuOpt(){

        quesBox = findViewById(R.id.quesBox);
        quesBox.setVisibility(View.INVISIBLE);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox1.setVisibility(View.INVISIBLE);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox2.setVisibility(View.INVISIBLE);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox3.setVisibility(View.INVISIBLE);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox4.setVisibility(View.INVISIBLE);

        // if statement used call the method according to the user mood
        if (Mood.equals("Happy")) {
            happyResult(userScore);
        }
        if (Mood.equals("Anxious") || Mood.equals("Stress") || Mood.equals("Depression") || Mood.equals("Anxious")
                ||Mood.equals(userMood)){
            resultsforOtherMood(userScore);
        }

    }


    /**
     * This method is called when user selected feeling happy button
     * @param Score score hold the int variable which include the users overall score for selected mood
     */
    public void happyResult(int Score) {


        finalBoxoutput = findViewById(R.id.finalbox);

        // 0 means positive and 48 means negative
        if (Score >= 0 & Score <= 12 ) {

            finalBoxoutput.setText("\n\nAnger Score: "+angerScore+ "/12" + "\n\nStress Score: "+stressScore+ "/12"
                    + "\n\nDepression Score: "+depressionScore+ "/12"+"\n\nAnxiety Score: " + anxietyScore + "/12"
                    +"\n\nTotal you score: " + userScore + "/48 \nYeah! you feeling " + Mood);

        }

        if (Score >= 10 & Score <= 24 ) {

            finalBoxoutput.setText("\n\nAnger Score: "+angerScore+ "/12" + "\n\nStress Score: "+stressScore+ "/12"
                    + "\n\nDepression Score: "+depressionScore+ "/12"+"\n\nAnxiety Score: " + anxietyScore + "/12"
                    +"\n\nTotal you score: " + userScore + "/48 \nYou are feeling " + Mood
                    + "might be little bit you are unhappy");

        }

        if (Score >= 20 & Score <=36) {

            finalBoxoutput.setText("\n\nAnger Score: "+angerScore+ "/12" + "\n\nStress Score: "+stressScore+ "/12"
                    + "\n\nDepression Score: "+depressionScore+ "/12"+"\n\nAnxiety Score: " + anxietyScore + "/12"
                    +"\n\nTotal you score: " + userScore + "/48 \nChances are less that you are feeling " + Mood);

        }

        if (Score >= 30 & Score <=48) {

            finalBoxoutput.setText("\n\nAnger Score: "+angerScore+ "/12" + "\n\nStress Score: "+stressScore+ "/12"
                    + "\n\nDepression Score: "+depressionScore+ "/12"+"\n\nAnxiety Score: " + anxietyScore + "/12"
                    +"\n\nTotal you score: " + userScore + "/48 \nChances are very less that you feeling " + Mood);

        }
    }

    /**
     * This method is called when user selected feeling expect happy button
     * @param Score score hold the int variable which include the users overall score for selected mood
     */

    public void resultsforOtherMood(int Score) {

        finalBoxoutput = findViewById(R.id.finalbox);


        if (Score >= 0 & Score <= 12 ) {

            finalBoxoutput.setText("\n\n\nAnger Score: "+angerScore+ "/12" + "\n\nStress Score: "+stressScore
                    + "/12"+ "\n\nDepression Score: "+depressionScore+ "/12"+"\n\nAnxiety Score: " + anxietyScore
                    + "/12"+"\n\nTotal you score: " + userScore + "/48 \nChances are very less that you feeling " + Mood);

        }

        if (Score >= 10 & Score <= 24 ) {

            finalBoxoutput.setText("\n\n\nAnger Score: "+angerScore+ "/12" + "\n\nStress Score: "+stressScore+ "/12"
                    + "\n\nDepression Score: "+depressionScore+ "/12"+"\n\nAnxiety Score: " + anxietyScore + "/12"
                    +"\n\nTotal you score: " + userScore + "/48 \nChances are less that you feeling " + Mood );

        }

        if (Score >= 20 & Score <=36) {

            finalBoxoutput.setText("\n\n\nAnger Score: "+angerScore+ "/12" + "\n\nStress Score: "+stressScore+ "/12"
                    + "\n\nDepression Score: "+depressionScore+ "/12"+"\n\nAnxiety Score: " + anxietyScore + "/12"
                    +"\n\nTotal you score: " + userScore + "/48 \nChances are higher that you are feeling " + Mood);

        }

        if (Score >= 30 & Score <=48) {

            finalBoxoutput.setText("\n\n\nAnger Score: "+angerScore+ "/12" + "\n\nStress Score: "+stressScore+ "/12"
                    + "\n\nDepression Score: "+depressionScore+ "/12"+"\n\nAnxiety Score: " + anxietyScore + "/12"
                    +"\n\nTotal you score: " + userScore + "/48 \nChances are very higher that you are feeling " + Mood);

        }

    }

    /*
     This method is uncheck all the options to uncheck state
     */
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

    /*
     This method is used to hide the view box when user click on given feeling button options
     */
    void visibilityforSelectFeeling(){

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
        stressBtn = findViewById(R.id.stressemojbtn);
        stressBtn.setVisibility(View.INVISIBLE);
        depressBtn = findViewById(R.id.depressedemojibutton);
        depressBtn.setVisibility(View.INVISIBLE);
        anxiousBtn =findViewById(R.id.anxiousBtn);
        anxiousBtn.setVisibility(View.INVISIBLE);
    }

    /*
     This method is used to calculate score for different options
     */
    private void scoreForall() {

        if (countQnum <=5){

            angerScore = angerScore+userScoreAdd;

        }
        else if(countQnum >= 6 && countQnum <=9){

            stressScore = stressScore + userScoreAdd;

        }

        else if(countQnum >= 9 && countQnum <= 13){

            depressionScore = depressionScore + userScoreAdd;

        }

        else if(countQnum >= 12 && countQnum <= 17){

            anxietyScore = anxietyScore + userScoreAdd;

        }


    }

    /*
       This method is use to send the string variable to Note layout
     */
    public  static String getmood() {
        return moodforNpage;
    }

    /*
       This method is use to send the string variable to ViewReport layout
     */
    public  static String getdate() {

        return scoreDate;
    }

    /*
      This method is use to send the string variable to ViewReport layout
    */
    public  static String getangerscore() {

        return String.valueOf(angerScore);
    }

    /*
      This method is use to send the string variable to ViewReport layout
    */
    public  static String getstressscore() {

        return String.valueOf(stressScore);
    }

    /*
      This method is use to send the string variable to ViewReport layout
    */
    public  static String getdepressionscore() {

        return String.valueOf(depressionScore);
    }

    /*
      This method is use to send the string variable to ViewReport layout
    */
    public  static String getanxietyscore() {

        return String.valueOf(anxietyScore);
    }

    /*
      This method is use to send the string variable to ViewReport layout
    */
    public  static String getuserscore() {

        return String.valueOf(userScoreforViewR);
    }

    /*
      This method set the current mood for Mood and moodforNpage string variables
    */
    public void setMood(String mood){

        Mood = mood;
        moodforNpage = mood;
    }

    /*
    This method set the score = 0
     */

    public void resetScore (){

        userScore = 0;
        userScoreforViewR =0;
        userScoreAdd = 0;
        countQnum = 0;
        angerScore = 0;
        stressScore =0;
        depressionScore = 0;
        anxietyScore =0;


    }

}