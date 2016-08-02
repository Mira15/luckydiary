package com.example.android.exercise;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Wow! \nYou are awesome\n:) :) :)\n\nYou are becoming a great programmer <3");
        textView.setTextSize(40);
        textView.setTextColor(Color.MAGENTA);

        setContentView(textView);
    }
}
