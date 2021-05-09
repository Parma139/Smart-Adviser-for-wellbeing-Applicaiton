package com.example.smart_adviser_for_wellbeing;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NoteDetailActivity extends AppCompatActivity {

    String feeling;
    TextView textView;
    DatabaseHelperNote dbnote;
    String date;
//    String feelingToday;
//    String feelinginfo;
//    String didgoodinfo;
    EditText feelinginfo, didgoodinfo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_detail);


//        feelingToday = FeelingQ.getmood();
//        feelinginfo =

        textView = findViewById(R.id.feelingtoday);
        textView.setText(FeelingQ.getmood());

        feelinginfo = findViewById(R.id.feelinginfo);
        didgoodinfo = findViewById(R.id.didgoodinfo);
        date = FeelingQ.getdate();


        dbnote = new DatabaseHelperNote(this);


        Button closebtnNDA = findViewById(R.id.closebtnNDA);
        Button savebtn = findViewById(R.id.saveBtn);
        Button openbtn = findViewById(R.id.openNote);

        closebtnNDA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                finish();
            }

        });

//        savebtn.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//
//                saveNotes();
//                finish();
//            }
//
//        });

        openbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

//               showData();
            }

        });



    }


    public void saveNotes(){

    if(feelinginfo.getText().toString().length() != 0 || feelinginfo.getText().toString() != null) {

        dbnote.insertData(date, FeelingQ.getmood(), feelinginfo.getText().toString(), didgoodinfo.getText().toString());

    }else{
        return;
    }

    }
//
//    public void showData(){
//
//        Cursor data = dbnote.getData();
//
//        if(  data.getCount() == 0){
//            showMessage("Ops!", "No Notes has been added");
//            return;
//        }else {
//
//            StringBuffer buffer = new StringBuffer();
//            while(data.moveToNext()){
//
//
//                buffer.append("Date :" + data.getString(1)+ "\n");
//                buffer.append("You felt :" + data.getString(2)+ "\n");
//                buffer.append("Informaiton about your feeling :" + data.getString(3)+ "\n");
//                buffer.append("You did good :" + data.getString(4)+ "\n\n");
//
//
//
//            }
//            showMessage("Notes List",buffer.toString());
//        }
//
//    }
//
//    public void showMessage(String tittle, String message){
//
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//
//        builder.setCancelable(true);
//        builder.setTitle(tittle);
//        builder.setMessage(message);
//        builder.show();
//
//    }
}