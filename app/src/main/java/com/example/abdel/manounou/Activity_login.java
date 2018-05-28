package com.example.abdel.manounou;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Activity_login extends AppCompatActivity {

    // variable
    private EditText mUsernameText;
    private EditText mPwdText;
    private Button mLogBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // referencement
        mUsernameText = (EditText) findViewById(R.id.activity_login_usr_txt);
        mPwdText = (EditText) findViewById(R.id.activity_login_pwd_txt);
        mLogBtn = (Button) findViewById(R.id.activity_login_log_btn);

        // desactivement du bouton
        mLogBtn.setEnabled(false);
        mUsernameText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            // reactivation du bouton a la saisie du champs username
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mUsernameText.setEnabled(charSequence.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

// on click
        mLogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}

