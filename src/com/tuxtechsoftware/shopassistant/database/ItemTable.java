package com.tuxtechsoftware.shopassistant.database;

import android.database.sqlite.SQLiteDatabase;

public class ItemTable {
	
	public static final String TABLE_NAME = "items";
	public static final String COL_ID = "_id";
	public static final String COL_PRODUCT_ID = "product_id";
	public static final String COL_STORE_ID = "store_id";
	public static final String COL_NUM_UNITS = "num_units";
	public static final String COL_PRICE = "item_price";
	public static final String COL_PRICE_PER_UNIT = "unit_price";
	public static final String COL_BARCODE = "barcode";

	private static final String DATABASE_CREATE = "create table " + TABLE_NAME +
			" ( " + COL_ID + " integer not null primary key autoincrement, "+
         COL_PRODUCT_ID + " integer, " +
         COL_STORE_ID + " integer, " +
         COL_NUM_UNITS + " float not null, " +
         COL_PRICE + " float not null, " +
         COL_PRICE_PER_UNIT + " float, " +
			COL_BARCODE + " INTEGER(13), " +
         "FOREIGN KEY( " + COL_PRODUCT_ID + ") REFERENCES " + ProductTable.TABLE_NAME + "(" + ProductTable.COL_ID + ")," + 
         "FOREIGN KEY( " + COL_STORE_ID + ") REFERENCES " + StoreTable.TABLE_NAME + "(" + StoreTable.COL_ID + ") )";
	
	public static void onCreate(SQLiteDatabase database)
	{
		database.execSQL(DATABASE_CREATE);
	}
	
	public static void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion)
	{
		//TODO need to make this work
	}
}
