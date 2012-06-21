package com.tuxtechsoftware.shopassistant.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

	private static final String DB_NAME = "shopassistant.db";
	private static final int DB_VERSION = 1;

   /*------------------------------------------------------------------------------
    * Constructor
    *------------------------------------------------------------------------------
    */
	public DBHelper(Context context) 
	{
		super(context, DB_NAME, null, DB_VERSION);
	}

   /*------------------------------------------------------------------------------
    * SQLiteOpenHelper functions
    *------------------------------------------------------------------------------
    */
	@Override
	public void onCreate(SQLiteDatabase db) {
      // Create each table.
      StoreTable.onCreate(db);
      ProductTypeTable.onCreate(db);
      ProductTable.onCreate(db);
      ItemTable.onCreate(db);
	}

	@Override
	public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
	   //MyCollectionsTable.onUpgrade(database, oldVersion, newVersion);

	}
}
