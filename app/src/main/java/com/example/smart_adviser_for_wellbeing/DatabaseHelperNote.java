package com.example.smart_adviser_for_wellbeing;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelperNote extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "notes.db";
    public static final String TABLE_NAME = "List_of_notes";

    public static final String ID = "id";
    public static final String DATE = "date";
    public static final String FEELING = "you were feeling";
    public static final String ABOUT_FEELING = "about your feeling";
    public static final String DID_GOOD = "you did good in";


    public DatabaseHelperNote(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, DATE TEXT, FEELING TEXT, ABOUT_FEELING TEXT, DID_GOOD TEXT) " );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }


    public void insertData(String date, String feeling, String aboutfeeling, String didgood ){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DATE, date);
        contentValues.put(FEELING, feeling);
        contentValues.put(ABOUT_FEELING, aboutfeeling);
        contentValues.put(DID_GOOD, didgood);
        db.insert(TABLE_NAME, null, contentValues);

    }

    public Cursor getData(){

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("select * from " + TABLE_NAME, null);
        return data;

    }

}