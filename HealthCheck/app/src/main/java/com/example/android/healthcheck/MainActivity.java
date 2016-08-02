package com.example.android.healthcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int healthLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display("Do you regularly play sports?");

    }

    public void display(String text) {
        TextView t = (TextView) findViewById(R.id.question_text_view);
        t.setText(text);
    }


    public void yes(View view) {
        healthLevel = healthLevel + 1;
        String message = "You answered yes, current health level is " + healthLevel;
        display(message);
    }

    public void sometimes(View view) {
        healthLevel = healthLevel + 0;
        String message = "You answered sometimes, current health level is " + healthLevel;
        display(message);
    }

    public void no(View view) {
        healthLevel = healthLevel - 1;
        String message = "You answered no, current health level is " + healthLevel;
        display(message);
    }
}
