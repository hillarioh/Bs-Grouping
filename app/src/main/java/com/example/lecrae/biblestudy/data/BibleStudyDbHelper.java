package com.example.lecrae.biblestudy.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BibleStudyDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "bible.db";
    private static final int DATABASE_VERSION = 1;

    public BibleStudyDbHelper(Context context){
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {



        String SQL_CREATE_MEMBER_TABLE=" CREATE TABLE "+ BibleStudyContractor.BibleEntry.TABLE_1 + "("
                + BibleStudyContractor.BibleEntry.MEMBER_ID + " TEXT PRIMARY KEY, "
                + BibleStudyContractor.BibleEntry.MEMBER_ZONE + " TEXT NOT NULL, "
                + BibleStudyContractor.BibleEntry.MEMBER_GROUP + " TEXT NOT NULL, "
                + BibleStudyContractor.BibleEntry.MEMBER_STATUS + " TEXT NOT NULL);";

        String SQL_CREATE_GROUP_TABLE=" CREATE TABLE "+ BibleStudyContractor.BibleEntry.TABLE_2 + "("
                + BibleStudyContractor.BibleEntry.GROUP_ZONE + " TEXT PRIMARY KEY, "
                + BibleStudyContractor.BibleEntry.GROUP_NO + " TEXT NOT NULL);";

        db.execSQL(SQL_CREATE_MEMBER_TABLE);
        db.execSQL(SQL_CREATE_GROUP_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
