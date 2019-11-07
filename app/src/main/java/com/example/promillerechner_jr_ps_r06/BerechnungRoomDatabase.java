package com.example.promillerechner_jr_ps_r06;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.promillerechner_jr_ps_r06.models.Berechnung;


@Database(entities = Berechnung.class,version = 1, exportSchema = false)
public class BerechnungRoomDatabase extends RoomDatabase {
    public abstract BerechnungDao berechnungDao();
    private static BerechnungRoomDatabase INSTANCE;

    public static BerechnungRoomDatabase getDatabase(Context context){
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    BerechnungRoomDatabase.class,"db").build();
        }
        return INSTANCE;
    }
}
