package com.example.android.happydiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int questionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the question button is clicked.
     */
    public void askQuestion (View view) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        if (questionNumber == 0) {

            TextView firstQuestion = (TextView) findViewById(R.id.first_question);
            firstQuestion.setVisibility(View.VISIBLE);
            firstQuestion.setText(getString(R.string.what_was_the_best_thing_you_did_today, name));

            EditText firstAnswerField = (EditText) findViewById(R.id.first_answer_field);
            String firstAnswer = firstAnswerField.getText().toString();
            firstAnswerField.setVisibility(View.VISIBLE);
        }

        if (questionNumber == 1) {

            TextView secondQuestion = (TextView) findViewById(R.id.second_question);
            secondQuestion.setVisibility(View.VISIBLE);
            secondQuestion.setText(getString(R.string.what_made_you_happy_today, name));

            EditText secondAnswerField = (EditText) findViewById(R.id.second_answer_field);
            String secondAnswer = secondAnswerField.getText().toString();
            secondAnswerField.setVisibility(View.VISIBLE);
        }

        if (questionNumber == 2) {

            TextView thirdQuestion = (TextView) findViewById(R.id.third_question);
            thirdQuestion.setVisibility(View.VISIBLE);
            thirdQuestion.setText(getString(R.string.what_are_the_nicest_talk_you_had_today, name));

            EditText thirdAnswerField = (EditText) findViewById(R.id.third_answer_field);
            String thirdAnswer = thirdAnswerField.getText().toString();
            thirdAnswerField.setVisibility(View.VISIBLE);
        }

        if (questionNumber == 3) {

            TextView fourthQuestion = (TextView) findViewById(R.id.fourth_question);
            fourthQuestion.setVisibility(View.VISIBLE);
            fourthQuestion.setText(getString(R.string.what_did_you_really_liked_today, name));

            EditText fourthAnswerField = (EditText) findViewById(R.id.fourth_answer_field);
            String thirdAnswer = fourthAnswerField.getText().toString();
            fourthAnswerField.setVisibility(View.VISIBLE);
        }

        if (questionNumber == 4) {

            TextView fifthQuestion = (TextView) findViewById(R.id.fifth_question);
            fifthQuestion.setVisibility(View.VISIBLE);
            fifthQuestion.setText(getString(R.string.what_made_you_smile_today, name));

            EditText fifthAnswerField = (EditText) findViewById(R.id.fifth_answer_field);
            String fifthAnswer = fifthAnswerField.getText().toString();
            fifthAnswerField.setVisibility(View.VISIBLE);
        }

        questionNumber = questionNumber + 1;
    }

    /**
     * This method is called when the send button is clicked.
     */

    public void sendQuestion (View view) {
        EditText firstAnswerField = (EditText) findViewById(R.id.first_answer_field);
        String firstAnswer = firstAnswerField.getText().toString();

        EditText secondAnswerField = (EditText) findViewById(R.id.second_answer_field);
        String secondAnswer = secondAnswerField.getText().toString();

        EditText thirdAnswerField = (EditText) findViewById(R.id.third_answer_field);
        String thirdAnswer = thirdAnswerField.getText().toString();

        EditText fourthAnswerField = (EditText) findViewById(R.id.fourth_answer_field);
        String fourthAnswer = fourthAnswerField.getText().toString();

        EditText fifthAnswerField = (EditText) findViewById(R.id.fifth_answer_field);
        String fifthAnswer = fifthAnswerField.getText().toString();

        String fullAnswer = firstAnswer + "\n" + secondAnswer + "\n" + thirdAnswer + "\n" + fourthAnswer + "\n" + fifthAnswer;

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, fullAnswer);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}
