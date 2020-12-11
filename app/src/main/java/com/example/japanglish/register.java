package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity implements View.OnClickListener {

    DatabaseHelper myDb;
    Button bRegister;
    EditText etName, etPassword, etAge, etUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        bRegister = (Button) findViewById(R.id.RegisterBTN);
        etName = (EditText) findViewById(R.id.etFullName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etAge = (EditText) findViewById(R.id.etAge);
        etUsername = (EditText) findViewById(R.id.etUsername);
        myDb = new DatabaseHelper(this);

        bRegister.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.RegisterBTN:

                startActivity(new Intent(this, login.class));
                break;
        }
    }
}