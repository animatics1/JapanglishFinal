package com.example.japanglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {

    Button bLogout;
    EditText etName, etAge, etUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        Button JapToEng = (Button) findViewById(R.id.JapToEngBTN);
        Button EngToJap = (Button) findViewById(R.id.EngToJapBTN);

        bLogout = (Button) findViewById(R.id.RegisterBTN);
        etName = (EditText) findViewById(R.id.etFullName);
        etAge = (EditText) findViewById(R.id.etAge);
        etUsername = (EditText) findViewById(R.id.etUsername);

        bLogout.setOnClickListener(this);
        JapToEng.setOnClickListener(this);
        EngToJap.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.JapToEngBTN:
                startActivity(new Intent(this, JapToEng.class));
                break;
            case R.id.EngToJapBTN:
                startActivity(new Intent(this, EngToJap.class));
                break;
            case R.id.LogoutBTN:
                startActivity(new Intent(this, login.class));
                break;
        }
    }
}