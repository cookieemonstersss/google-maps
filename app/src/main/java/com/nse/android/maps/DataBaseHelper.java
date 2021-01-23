package com.nse.android.maps;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Random;

public class DataBaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME="Enrollment.db";
    public static final String TABLE_NAME="Enrollment_table";
    //Random rand=new Random();
    //int ID=rand.nextInt(30);
    public static final String COL_1="ID";
    public static final String  COL_2="NAME";
    public static final String COL_3="SURNAME";
    public static final String COL_4="PARENT";
    public static final String COL_5="CELLNUMBER";
    public static final String COL_6="DATEOFBIRTH";
    public static final String COL_7="RELATIONSHIP";
    public static final String COL_8="EMERGENCY";
    public static final String COL_9="ADDRESS";
    public DataBaseHelper(Context context){
        super(context,DATABASE_NAME,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SURNAME TEXT,PARENT TEXT,CELLNUMBER INTEGER(10), DATEOFBIRTH CHAR ,RELATIONSHIP TEXT,EMERGENCY INTEGER(10), ADDRESS CHAR)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    }


    public Boolean insertData(String name,String surname,String parent,String cellnumber,String dateofbirth,String relationship,String emergency,String address){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,surname);
        contentValues.put(COL_4,parent);
        contentValues.put(COL_5,cellnumber);
        contentValues.put(COL_6,dateofbirth);
        contentValues.put(COL_7,relationship);
        contentValues.put(COL_8,emergency);
        contentValues.put(COL_9,address);
        long result=db.insert(TABLE_NAME,null,contentValues);
        db.close();

        if(result==-1){
            return false;
        }else{
            return true;
        }

    }
}



