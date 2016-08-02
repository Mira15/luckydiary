package com.example.android.layouttest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void halloWelt (View view) {
        EditText textField = (EditText) findViewById(R.id.ideas_new);
        String ideas = textField.getText().toString();

        String subject = "my brand new idea";

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, ideas);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }
}
