package com.example.abdel.manounou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Profil_Parents extends AppCompatActivity {


    //variable
    private TextView mGreetingView;
    private EditText mIDnounoutxt;
    private Button mOKBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__profil__parents);

        //referencement
        mGreetingView = (TextView) findViewById(R.id.activity_profil_parents_txt);
        mIDnounoutxt = (EditText) findViewById(R.id.activity_profil_parents_ID_nounou_txt);
        mOKBtn = (Button) findViewById(R.id.activity_profil_parents_ID_nounou_btn);


        // desactivement du bouton
        mOKBtn.setEnabled(false);
        mIDnounoutxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            // reactivation du bouton a la saisie du champs username
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mIDnounoutxt.setEnabled(charSequence.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

            // on clic
               mOKBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //lancer la fiche enfant
        //Intent
    }
}
