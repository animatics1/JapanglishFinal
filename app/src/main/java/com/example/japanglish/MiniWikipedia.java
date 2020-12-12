package com.example.japanglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.nio.charset.MalformedInputException;

public class MiniWikipedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.miniwikipedia);

        Button FoodSection = (Button) findViewById(R.id.FoodWikiBTN);
        Button ItemSection = (Button) findViewById(R.id.ItemWikiBTN);
        Button Vocabulary = (Button) findViewById(R.id.VocabularyWikiBTN);

        FoodSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MiniWikipedia.this, FoodSectionJ.class));
            }
        });
        ItemSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MiniWikipedia.this, ItemSectionJ.class));
            }
        });
        Vocabulary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MiniWikipedia.this, VocabularyJ.class));
            }
        });

    }

}
