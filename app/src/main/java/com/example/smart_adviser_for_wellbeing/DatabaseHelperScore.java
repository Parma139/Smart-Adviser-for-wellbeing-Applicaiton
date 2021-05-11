package com.example.smart_adviser_for_wellbeing;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;


public class DatabaseHelperScore extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "userscore.db";
    public static final String TABLE_NAME = "User_score_table";

    public static final String ID = "id";
    public static final String DATE = "date";
    public static final String ANGER = "anger";
    public static final String STRESS = "stress";
    public static final String DEPRESSION = "depression";
    public static final String ANXIETY = "anxiety";
    public static final String TOTAL_SCORE = "total_score";

    public DatabaseHelperScore(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, DATE TEXT, ANGER TEXT, STRESS TEXT, DEPRESSION TEXT, ANXIETY TEXT, TOTAL_SCORE TEXT) " );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    /**
     * This method use to insert the data in database
     * @param date date hold the date content in format months days, year
     * @param anger   anger hold the int variable as score
     * @param stress stress hold the int variable as score
     * @param depression depression hold the int variable as score
     * @param anxiety anxiety hold the int variable as score
     * @param tscore tscore hold the int variable total score
     */
    public void insertData(String date, int anger, int stress, int depression, int anxiety, int tscore ){

        SQLiteDatabase db = this.getWritableDatabase();
        // contentValues hold the data and then db.inseert add those data in database
        ContentValues contentValues = new ContentValues();
        contentValues.put(DATE, date);
        contentValues.put(ANGER, anger);
        contentValues.put(STRESS, stress);
        contentValues.put(DEPRESSION, depression);
        contentValues.put(ANXIETY, anxiety);
        contentValues.put(TOTAL_SCORE, tscore);
        db.insert(TABLE_NAME, null, contentValues);

    }

    /**
     * This method use to access the data from the database and return those data
     * @return return the result of rawquery
     */

    public Cursor getData(){

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("select * from " + TABLE_NAME, null);
        return data;

    }

}
