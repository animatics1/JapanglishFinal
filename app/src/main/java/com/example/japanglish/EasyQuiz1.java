package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EasyQuiz1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizapple1);

        Button apple = (Button) findViewById(R.id.correctanswerBTN);
        Button wrong = (Button) findViewById(R.id.NormalModeBTN);
        Button wrong1 = (Button) findViewById(R.id.DifficultModeBTN);
        Button back = (Button) findViewById(R.id.QuizMenuBackBTN);


        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyQuiz1.this, quizorange1.class));
            }
        });
        wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastMsg("Wrong Answer");

            }

        });
        wrong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastMsg("Wrong Answer");
            }

        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyQuiz1.this, QuizMenu.class));
            }
        });

    }

    private void toastMsg(String wrong_answer) {
        String msg = "wrong answer";
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
}
