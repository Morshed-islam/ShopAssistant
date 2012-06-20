package tuxtechsoftware.com.shopassistant.database;

import android.database.sqlite.SQLiteDatabase;

public class StoreTable {
	
	public static final String TABLE_NAME = "stores";
	public static final String COL_ID = "_id";
	public static final String COL_NAME = "name";
	public static final String COL_LOCATION = "location";
	public static final String COL_HOURS = "hours";

	private static final String DATABASE_CREATE = "create table " + TABLE_NAME +
			" ( " + COL_ID + " integer not null primary key autoincrement, "+
			COL_NAME + " text not null, " +
         COL_LOCATION + " text not null, " +
			COL_HOURS + " text )";
	
	public static void onCreate(SQLiteDatabase database)
	{
		database.execSQL(DATABASE_CREATE);
	}
	
	public static void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion)
	{
		//TODO need to make this work
	}
}
