package com.example.prabin.lab1_flashcard;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.option_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.option_one).setBackgroundColor(Color.parseColor("#ff0000"));
                findViewById(R.id.option_two).setBackgroundColor(Color.parseColor("#008000"));
            }
        });

        findViewById(R.id.option_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.option_two).setBackgroundColor(Color.parseColor("#008000"));
            }
        });

        findViewById(R.id.option_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.option_three).setBackgroundColor(Color.parseColor("#ff0000"));
                findViewById(R.id.option_two).setBackgroundColor(Color.parseColor("#008000"));
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.option_one).setBackgroundColor(Color.parseColor("#FFA500"));
                findViewById(R.id.option_two).setBackgroundColor(Color.parseColor("#FFA500"));
                findViewById(R.id.option_three).setBackgroundColor(Color.parseColor("#FFA500"));
            }
        });

    }
}