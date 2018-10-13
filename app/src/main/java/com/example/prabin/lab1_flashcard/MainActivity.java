package com.example.prabin.flashcardlab1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.prabin.lab1_flashcard.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.answer).setVisibility(View.INVISIBLE);

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (findViewById(R.id.question).getVisibility() == View.VISIBLE) {
                    findViewById(R.id.question).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer).setVisibility(View.VISIBLE);
                } else if (findViewById(R.id.question).getVisibility() == View.INVISIBLE) {
                    findViewById(R.id.question).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer).setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}