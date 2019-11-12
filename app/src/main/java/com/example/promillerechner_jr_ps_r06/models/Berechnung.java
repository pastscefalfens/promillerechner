package com.example.promillerechner_jr_ps_r06.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "berechnungen")
public class Berechnung {

    @PrimaryKey(autoGenerate = true)
    private Integer berechnung_id;
    private String berechnung_name; // Name der Berechnung setzt sich aus dem Datum der Berechnung zusammen --> ToString Methode bei BerechnenFragment implementieren
    private Boolean berechnung_geschlecht;
    private Integer berechnung_gewicht;
    private Integer berechnung_groesse;
    private String berechnung_getraenk;
    private Float berechnung_getraenk_groesse;
    private Float berechnung_getraenk_alkohol;
    private Integer berechnung_getraenk_anzahl;
    private Float berechnung_ergebnis;


    public Berechnung(String berechnung_name, Boolean berechnung_geschlecht, Integer berechnung_gewicht,
                      Integer berechnung_groesse, String berechnung_getraenk, Float berechnung_getraenk_groesse,
                      Float berechnung_getraenk_alkohol, Integer berechnung_getraenk_anzahl,
                      Float berechnung_ergebnis){
        this.berechnung_name = berechnung_name;
        this.berechnung_geschlecht = berechnung_geschlecht;
        this.berechnung_geschlecht = berechnung_geschlecht;
        this.berechnung_gewicht = berechnung_gewicht;
        this.berechnung_groesse = berechnung_groesse;
        this.berechnung_getraenk = berechnung_getraenk;
        this.berechnung_getraenk_groesse = berechnung_getraenk_groesse;
        this.berechnung_getraenk_alkohol = berechnung_getraenk_alkohol;
        this.berechnung_getraenk_anzahl = berechnung_getraenk_anzahl;
        this.berechnung_ergebnis = berechnung_ergebnis;
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

    public Boolean getBerechnung_geschlecht() {
        return this.berechnung_geschlecht;
    }

    public void setBerechnung_geschlecht(boolean geschlecht) {
        this.berechnung_geschlecht = geschlecht;
    }

    public Integer getBerechnung_gewicht() {
        return this.berechnung_gewicht;
    }
    public void setBerechnung_gewicht(Integer gewicht) {
        this.berechnung_gewicht = gewicht;
    }

    public Integer getBerechnung_groesse() {
        return this.berechnung_groesse;
    }
    public void setBerechnung_groesse(Integer groesse) {
        this.berechnung_groesse = groesse;
    }

    public String getBerechnung_getraenk() {
        return this.berechnung_getraenk;
    }

    public void setBerechnung_getraenk(String getraenk) {
        this.berechnung_getraenk = getraenk;
    }

    public Float getBerechnung_getraenk_groesse() {
        return this.berechnung_getraenk_groesse;
    }

    public void setBerechnung_getraenk_groesse(Float getraenk_groesse) {
        this.berechnung_getraenk_groesse = getraenk_groesse;
    }

    public Float getBerechnung_getraenk_alkohol() {
        return this.berechnung_getraenk_alkohol;
    }

    public void setBerechnung_getraenk_alkohol(Float getraenk_alkohol) {
        this.berechnung_getraenk_alkohol = getraenk_alkohol;
    }

    public Integer getBerechnung_getraenk_anzahl() {
        return this.berechnung_getraenk_anzahl;
    }

    public void setBerechnung_getraenk_anzahl(Integer getraenk_anzahl) {
        this.berechnung_getraenk_anzahl = getraenk_anzahl;
    }

    public Float getBerechnung_ergebnis() {
        return this.berechnung_ergebnis;
    }

    public void setBerechnung_ergebnis(Float berechnung_ergebnis) {
        this.berechnung_ergebnis = berechnung_ergebnis;
    }
}
