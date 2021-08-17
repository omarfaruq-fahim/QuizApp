package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {
     RadioButton selectedButton;
    RadioGroup outputshow;
    String values;
    int mark1;
            int result;

     public static String quizMark = "com.example.quizapplication";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent second = getIntent();
        mark1 = second.getIntExtra(MainActivity.quizMark, 0);
        outputshow = findViewById(R.id.radioGroupId);
    }

    public void handleSubmit2(View view) {
        int radioButtonId = outputshow.getCheckedRadioButtonId();
        selectedButton = findViewById(radioButtonId);
        values = selectedButton.getText().toString();
        if(values.equals("Google")){
            mark1=  mark1+5;
        }
        Intent first = new Intent(MainActivity2.this, MainActivity3.class);
        first.putExtra(quizMark, mark1);
        startActivity(first);
    }
}