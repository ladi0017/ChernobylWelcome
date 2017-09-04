package com.example.ladvi.chernobylwelcome;

/**
 * Created by ladvi on 05/01/2017.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper  extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 4;


    private static final String DATABASE_NAME = "land.db";

    public DBHelper(Context context ) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_TABLE_LANDMARK = "CREATE TABLE " + Landmark.TABLE  + "("
                + Landmark.KEY_ID  + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + Landmark.KEY_name + " TEXT, "
                + Landmark.KEY_description + " TEXT, "
                + Landmark.KEY_location + " TEXT )";

        db.execSQL(CREATE_TABLE_LANDMARK);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Landmark.TABLE);
        onCreate(db);

    }

}