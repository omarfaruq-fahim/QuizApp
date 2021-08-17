package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    int mark1;
    TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent third = getIntent();
         mark1= third.getIntExtra(MainActivity2.quizMark, 0);
        show = findViewById(R.id.textviewid);
        show.setText("Total Number\n  You get"+" " +  mark1 + " " + "out of 10");
    }

    public void tryagainbuttonid(View view) {
        Intent four = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(four);
    }

}