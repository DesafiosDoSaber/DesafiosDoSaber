package com.example.desafiosdosaber;

import static android.content.Context.MODE_PRIVATE;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "QuizDatabase.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_PERGUNTAS = "Perguntas";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_AREA = "area";
    private static final String COLUMN_DIFICULDADE = "dificuldade";
    private static final String COLUMN_PERGUNTA = "pergunta";
    private static final String COLUMN_OPCAO1 = "opcao1";
    private static final String COLUMN_OPCAO2 = "opcao2";
    private static final String COLUMN_OPCAO3 = "opcao3";
    private static final String COLUMN_OPCAO4 = "opcao4";
    private static final String COLUMN_CORRETA = "correta";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        IniciadorPerguntas.inserirPerguntasIniciais(context, this);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_PERGUNTAS + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_AREA + " TEXT, " +
                COLUMN_DIFICULDADE + " TEXT, " +
                COLUMN_PERGUNTA + " TEXT, " +
                COLUMN_OPCAO1 + " TEXT, " +
                COLUMN_OPCAO2 + " TEXT, " +
                COLUMN_OPCAO3 + " TEXT, " +
                COLUMN_OPCAO4 + " TEXT, " +
                COLUMN_CORRETA + " INTEGER)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PERGUNTAS);
        onCreate(db);
    }

    public void inserirPergunta(String area, String dificuldade, String pergunta,
                                String opcao1, String opcao2, String opcao3, String opcao4, int correta) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_AREA, area);
        values.put(COLUMN_DIFICULDADE, dificuldade);
        values.put(COLUMN_PERGUNTA, pergunta);
        values.put(COLUMN_OPCAO1, opcao1);
        values.put(COLUMN_OPCAO2, opcao2);
        values.put(COLUMN_OPCAO3, opcao3);
        values.put(COLUMN_OPCAO4, opcao4);
        values.put(COLUMN_CORRETA, correta);

        db.insert(TABLE_PERGUNTAS, null, values);
        db.close();
    }

    public List<Pergunta> obterPerguntas(String area, String dificuldade) {
        List<Pergunta> perguntas = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + TABLE_PERGUNTAS + " WHERE " +
                COLUMN_AREA + " = ? AND " + COLUMN_DIFICULDADE + " = ? LIMIT 12";
        Cursor cursor = db.rawQuery(query, new String[]{area, dificuldade});

        if (cursor.moveToFirst()) {
            do {
                String textoPergunta = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_PERGUNTA));
                String opcao1 = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_OPCAO1));
                String opcao2 = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_OPCAO2));
                String opcao3 = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_OPCAO3));
                String opcao4 = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_OPCAO4));
                int correta = cursor.getInt(cursor.getColumnIndexOrThrow(COLUMN_CORRETA));

                perguntas.add(new Pergunta(textoPergunta, new String[]{opcao1, opcao2, opcao3, opcao4}, correta));
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return perguntas;
    }
}