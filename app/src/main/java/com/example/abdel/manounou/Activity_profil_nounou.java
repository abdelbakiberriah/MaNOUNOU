package com.example.abdel.manounou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_profil_nounou extends AppCompatActivity {


    //variable
    private TextView mGreetingView;
    private EditText mIDParenttxt;
    private Button mOKBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_nounou);

        //referencement
        mGreetingView = (TextView) findViewById(R.id.activity_profil_nounou_txt);
        mIDParenttxt = (EditText) findViewById(R.id.activity_profil_nounou_ID_parents_txt);
        mOKBtn = (Button) findViewById(R.id.activity_profil_nounou_ID_parents_btn);


        // desactivement du bouton
        mOKBtn.setEnabled(false);
        mIDParenttxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            // reactivation du bouton a la saisie du champs username
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mIDParenttxt.setEnabled(charSequence.toString().length() != 0);
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
        //lancer la fiche choix de l'enfant
        //Intent
    }
}