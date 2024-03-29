package com.example.smart_adviser_for_wellbeing;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewReport extends AppCompatActivity {


    String scoreDate;
    String angerScore;
    String stressScore;
    String depressionScore;
    String anxietyScore;
    String userScore;

    DatabaseHelperScore scoredb;
    Button showallscore, showbargraph, closereportbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_report);

        scoredb = new DatabaseHelperScore(this);

        showallscore = findViewById(R.id.viewscore);
        showbargraph = findViewById(R.id.viewbargraph);
        closereportbtn = findViewById(R.id.closebtnreport);

        scoreDate = FeelingQ.getdate();
        angerScore = FeelingQ.getangerscore();
        stressScore = FeelingQ.getstressscore();
        depressionScore = FeelingQ.getdepressionscore();
        anxietyScore = FeelingQ.getanxietyscore();
        userScore = FeelingQ.getuserscore();

        saveScore();

        // this handle the showallscore button activity
        showallscore.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            showData();

            }

        });


        // this handle the close button activity
        closereportbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                finish();

            }

        });



    }

    /*
    This method is used to save the data in database by calling the insertdata method from DatabaseHelperScore
     */

    public void saveScore(){

        if (Integer.parseInt(userScore) != 0){

            scoredb.insertData(scoreDate, Integer.parseInt(angerScore), Integer.parseInt(stressScore), Integer.parseInt(depressionScore), Integer.parseInt(anxietyScore),  Integer.parseInt(userScore));

        }else{

            return;
        }


    }


    /*
    This method is used to access the data from database by calling the showData method from DatabaseHelperScore
    */
    public void showData(){

        Cursor data = scoredb.getData();

        if(  data.getCount() == 0){
                    showMessage("Ops!", "No score has been added");
            return;
        }else {
                    StringBuffer buffer = new StringBuffer();
                    while(data.moveToNext()){
                        buffer.append("Date :" + data.getString(1)+ "\n");
                        buffer.append("Anger Score :" + data.getString(2)+ "\n");
                        buffer.append("Stress Score :" + data.getString(3)+ "\n");
                        buffer.append("Depression Score :" + data.getString(4)+ "\n");
                        buffer.append("Anxiety Score :" + data.getString(5)+ "\n");
                        buffer.append("Total Score :" + data.getString(6)+ "\n\n");
                    }
                    showMessage("Overall Score List",buffer.toString());
        }
    }

    /**
     * This method is used to dispaly the content which one requested by showData method
     * @param tittle tittle hold the string variable which include the name of the title
     * @param message message hold the String variable which include buffer.tostring data
     */
    public void showMessage(String tittle, String message){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle(tittle);
        builder.setMessage(message);
        builder.show();

    }
}
