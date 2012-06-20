package tuxtechsoftware.com.shopassistant.database;

import android.database.sqlite.SQLiteDatabase;

public class ProductTable {
	
	public static final String TABLE_NAME = "products";
	public static final String COL_ID = "_id";
	public static final String COL_NAME = "name";
	public static final String COL_BRAND = "brand";
	public static final String COL_UNIT_TYPE = "unit_type";
	public static final String COL_PROD_TYPE_ID = "product_type_id";

	private static final String DATABASE_CREATE = "create table " + TABLE_NAME +
			" ( " + COL_ID + " integer not null primary key autoincrement, "+
			COL_NAME + " text not null, " +
			COL_BRAND + " text, " +
			COL_UNIT_TYPE + " integer not null, " +
			COL_PROD_TYPE_ID + " integer, " +
         "FOREIGN KEY( " + COL_PROD_TYPE_ID + ") REFERENCES " + ProductTypeTable.TABLE_NAME + "(" + ProductTypeTable.COL_ID + ") )";
	
	public static void onCreate(SQLiteDatabase database)
	{
		database.execSQL(DATABASE_CREATE);
	}
	
	public static void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion)
	{
		//TODO need to make this work
	}
}
