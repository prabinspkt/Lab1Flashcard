package com.example.prabin.lab1_flashcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView answer = findViewById(R.id.answer);
        final TextView question = findViewById(R.id.question);
        answer.setVisibility(View.INVISIBLE);
        question.setVisibility(View.VISIBLE);

        Intent add_question = getIntent();
        String user_question = add_question.getStringExtra("question");
        String user_answer = add_question.getStringExtra("answer");
        answer.setText(user_answer);
        question.setText(user_question);

        findViewById(R.id.question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                answer.setVisibility(View.VISIBLE);
                question.setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setVisibility(View.INVISIBLE);
                question.setVisibility(View.VISIBLE);
            }
        });

        ImageView add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add_card = new Intent(MainActivity.this, AddCardActivity.class);
                MainActivity.this.startActivity(add_card);
                finish();
            }
        });

    }
}