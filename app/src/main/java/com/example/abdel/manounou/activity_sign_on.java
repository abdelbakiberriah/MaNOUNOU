package com.example.abdel.manounou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import java.util.ArrayList;
import java.util.List;


public class activity_sign_on extends AppCompatActivity {

    // Variable
    private Spinner mSpinner;
    private static final String[] items = {"Nounous", "Parents"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_on);

        // referencement
        mSpinner = (Spinner) findViewById(R.id.activity_sign_on_Spinner);


        final List <String> simpleList = new ArrayList<String>();

        simpleList.add("Nounous");
        simpleList.add("Parents");


        ArrayAdapter<String> simpleAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, simpleList);











    }
}

