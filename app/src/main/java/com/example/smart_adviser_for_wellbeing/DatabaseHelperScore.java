package com.example.smart_adviser_for_wellbeing;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.ConnectivityManager;

import androidx.annotation.Nullable;

public class DatabaseHelperScore extends SQLiteOpenHelper {

    // Database name and variable

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
        SQLiteDatabase db = this.getWritableDatabase();

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
}
