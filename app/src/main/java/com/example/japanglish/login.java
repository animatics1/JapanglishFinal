package com.example.japanglish;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity implements View.OnClickListener {

    Button bLogin;
    EditText etUsername, etPassword;
    TextView registerlink, tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        bLogin = (Button) findViewById(R.id.LoginBTN);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        registerlink = (TextView) findViewById(R.id.registerlink);
        tv = (TextView) findViewById(R.id.etUsername);

        bLogin.setOnClickListener(this);
        registerlink.setOnClickListener(this);

        tv.setText(etUsername.getText().toString());

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.LoginBTN:

                break;

            case R.id.registerlink:

                startActivity(new Intent(this, register.class));

                break;
        }
    }
}