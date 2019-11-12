package com.example.promillerechner_jr_ps_r06.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "berechnungen")
public class Berechnung {

    @PrimaryKey(autoGenerate = true)
    private Integer berechnung_id;
    private String berechnung_name; // Name der Berechnung setzt sich aus dem Datum der Berechnung zusammen --> ToString Methode bei BerechnenFragment implementieren
    private String



    public Berechnung(String berechnung_name){
        this.berechnung_name = berechnung_name;
    }

    public Berechnung(String )
}
