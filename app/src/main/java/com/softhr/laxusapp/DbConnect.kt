package com.softhr.laxusapp

import java.sql.Connection
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DbConnect(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "MyDatabase.db"
    }

    override fun onCreate(db: SQLiteDatabase) {
        // Create your database tables here
        // Example:
        // db.execSQL("CREATE TABLE IF NOT EXISTS MyTable (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Handle database upgrades here
        // Example:
        // db.execSQL("DROP TABLE IF EXISTS MyTable")
        // onCreate(db)
    }
}