package com.example.promillerechner_jr_ps_r06;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BerechnenFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BerechnenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class BerechnenFragment extends Fragment {
    View view;

    private Button calcButton;
    private TextView alkwert;
    private static String FIRSTTEXT_STRING = "Der aktuelle Blutalkoholwert beträgt:";

    Integer alkoholgehalt = 5;
    Integer menge = 10;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_berechnen, container, false);
        calcButton = view.findViewById(R.id.calcbutton);
        alkwert = view.findViewById(R.id.berechnen_firsttext);

        calcButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                saveCalcOnClick();
            }

        });

        return view;
    }

    private void saveCalcOnClick(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        String strDate = formatter.format(date);

        //if (alkoholgehalt == 0 || menge == 0){
            //fehlermeldung über toast }
            // is empty - erster spinner eintrag plcaeholder, getselectedindex = placeholder --> fehler generieren
        alkwert.setText(FIRSTTEXT_STRING + (alkoholgehalt*menge));



    }
}
