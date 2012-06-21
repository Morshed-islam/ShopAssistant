package com.tuxtechsoftware.shopassistant.database;

import android.database.sqlite.SQLiteDatabase;

public class ProductTypeTable {
	
	public static final String TABLE_NAME = "product_type";
	public static final String COL_ID = "_id";
	public static final String COL_TYPE = "type";

	private static final String DATABASE_CREATE = "create table " + TABLE_NAME +
			" ( " + COL_ID + " integer not null primary key autoincrement, "+
			COL_TYPE + " text not null)";
	
	public static void onCreate(SQLiteDatabase database)
	{
		database.execSQL(DATABASE_CREATE);
	}
	
	public static void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion)
	{
		//TODO need to make this work
	}
}
