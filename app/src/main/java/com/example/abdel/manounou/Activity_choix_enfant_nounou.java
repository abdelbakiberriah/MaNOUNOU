package com.example.abdel.manounou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_choix_enfant_nounou extends AppCompatActivity {


    //variable
    private TextView mSelectChildView;
    private Button mChild1Btn;
    private Button mChild2Btn;
    private Button mChild3Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_enfant_nounou);


        //referencement
        mSelectChildView = (TextView) findViewById(R.id.activity_choix_enfant_nounou_txt);
        mChild1Btn = (Button) findViewById(R.id.activity_choix_enfant_nounou_enfant1_btn);
        mChild2Btn = (Button) findViewById(R.id.activity_choix_enfant_nounou_enfant2_btn);
        mChild3Btn = (Button) findViewById(R.id.activity_choix_enfant_nounou_enfant3_btn);


        // on Clic
        mChild1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        mChild2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mChild3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

//intent vers fiche enfant
        
    }
}
