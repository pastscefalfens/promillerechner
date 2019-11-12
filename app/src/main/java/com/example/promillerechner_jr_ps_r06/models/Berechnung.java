package com.example.promillerechner_jr_ps_r06.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "berechnungen")
public class Berechnung {

    @PrimaryKey(autoGenerate = true)
    private Integer berechnung_id;

    private String berechnung_name; // Name der Berechnung setzt sich aus dem Datum der Berechnung zusammen --> ToString Methode bei BerechnenFragment implementieren

    // alle Werte wie in Mockup von Verlauf --> alles was gespeichert werden soll

    //private String


    // nachfolgend ergänzen und alle Attribute einfügen

    public Berechnung(String berechnung_name /*, String alkoholart*/){
        this.berechnung_name = berechnung_name;
        //this.berechnung_alkoholart = alkoholart;
    }

    public Integer getBerechnung_id() {
        return this.berechnung_id;
    }

    public void setBerechnung_id(Integer id){
        this.berechnung_id = id;
    }

    public String getBerechnung_name(){
        return this.berechnung_name;
    }

   // public Berechnung(String )
}
