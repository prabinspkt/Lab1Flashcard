package com.example.prabin.lab1_flashcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        ImageView add_button = findViewById(R.id.add_card);
        ImageView save_button = findViewById(R.id.save);
        final EditText question = findViewById(R.id.add_question);
        final EditText answer = findViewById(R.id.add_answer);

        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main_activity = new Intent(AddCardActivity.this, MainActivity.class);
                main_activity.putExtra("question", question.getText().toString());
                main_activity.putExtra("answer", answer.getText().toString() );
                AddCardActivity.this.startActivity(main_activity);
                finish();
            }
        });
    }
}
