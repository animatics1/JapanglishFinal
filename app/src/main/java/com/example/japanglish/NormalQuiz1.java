package com.example.japanglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NormalQuiz1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizapple2);

        Button apple = (Button) findViewById(R.id.correctanswerBTN);
        Button wrong = (Button) findViewById(R.id.wronganswerBTN);
        Button wrong1 = (Button) findViewById(R.id.wronganswer2BTN);
        Button back = (Button) findViewById(R.id.NormalQuizBackBTN);


        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NormalQuiz1.this, quizorange2.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NormalQuiz1.this, QuizMenu.class));
            }
        });

    }
}