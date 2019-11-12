package com.example.promillerechner_jr_ps_r06.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.promillerechner_jr_ps_r06.models.Berechnung;

import java.util.List;

@Dao
public interface BerechnungDao {
    @Insert
    void insert(Berechnung... berechnung);

    @Update
    void update(Berechnung... berechnung);

    @Delete
    void deletePancake(Berechnung... berechnung);

    @Query("SELECT * FROM berechnungen ORDER BY berechnung_id DESC")
    List<Berechnung> getAll();
}

