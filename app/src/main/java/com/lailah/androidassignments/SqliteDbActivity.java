package com.lailah.androidassignments;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SqliteDbActivity extends AppCompatActivity {

    //create an object of sqlitedb
    SQLiteDatabase SQliteDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_db);

    //create or open already created database
        SQliteDB = openOrCreateDatabase("assignment.db", Context.MODE_PRIVATE, null);

        //create a table
        SQliteDB.execSQL("create table IF NOT EXISTS emp(id integer primary key autoincrement not null, empname varchar(50), dept varchar(25), salary float);");

    }
}
