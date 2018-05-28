package com.example.abdel.manounou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.abdel.manounou.Activity_login;
import com.example.abdel.manounou.R;

public class MainActivity extends AppCompatActivity {

    //variable
    private TextView mGreetingView;
    private Button mLogBtn;
    private Button mNewBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencement
        mGreetingView = (TextView) findViewById(R.id.main_activity_greeing_txt);
        mLogBtn = (Button) findViewById(R.id.main_activity_log_btn);
        mNewBtn = (Button) findViewById(R.id.main_activity_new_btn);

        //on click
        mLogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //lancer la page de login
                Intent LoginActivityIntent = new Intent(MainActivity.this, Activity_login.class);
                startActivity(LoginActivityIntent);

                //on click
                mNewBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
            }
        });
    }
}
