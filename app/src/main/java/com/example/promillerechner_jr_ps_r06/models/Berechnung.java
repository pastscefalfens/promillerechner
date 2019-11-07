package com.example.promillerechner_jr_ps_r06.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "berechnungen")
public class Berechnung {

    @PrimaryKey(autoGenerate = true)
    private Integer id;

    private String name;

    public Berechnung(String name){
        this.name = name;
    }
}
