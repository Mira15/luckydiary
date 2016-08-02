package com.example.android.glueckstagebuch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int questionNumber = 0;

    String fullAnswer;
    String firstAnswer;
    String secondAnswer;
    String thirdAnswer;
    String fourthAnswer;
    String fifthAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the question button is clicked.
     */
    public void askQuestion(View view) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        if (questionNumber == 0) {

            TextView firstQuestion = (TextView) findViewById(R.id.first_question);
            firstQuestion.setVisibility(View.VISIBLE);
            firstQuestion.setText(getString(R.string.what_was_the_best_thing_you_did_today, name));

            EditText firstAnswerField = (EditText) findViewById(R.id.first_answer_field);
            firstAnswerField.setVisibility(View.VISIBLE);
        }

        if (questionNumber == 1) {

            TextView secondQuestion = (TextView) findViewById(R.id.second_question);
            secondQuestion.setVisibility(View.VISIBLE);
            secondQuestion.setText(getString(R.string.what_made_you_happy_today, name));

            EditText secondAnswerField = (EditText) findViewById(R.id.second_answer_field);
            secondAnswerField.setVisibility(View.VISIBLE);
        }

        if (questionNumber == 2) {

            TextView thirdQuestion = (TextView) findViewById(R.id.third_question);
            thirdQuestion.setVisibility(View.VISIBLE);
            thirdQuestion.setText(getString(R.string.what_are_the_nicest_talk_you_had_today, name));

            EditText thirdAnswerField = (EditText) findViewById(R.id.third_answer_field);
            thirdAnswerField.setVisibility(View.VISIBLE);
        }

        if (questionNumber == 3) {

            TextView fourthQuestion = (TextView) findViewById(R.id.fourth_question);
            fourthQuestion.setVisibility(View.VISIBLE);
            fourthQuestion.setText(getString(R.string.what_did_you_really_liked_today, name));

            EditText fourthAnswerField = (EditText) findViewById(R.id.fourth_answer_field);
            fourthAnswerField.setVisibility(View.VISIBLE);
        }

        if (questionNumber == 4) {

            TextView fifthQuestion = (TextView) findViewById(R.id.fifth_question);
            fifthQuestion.setVisibility(View.VISIBLE);
            fifthQuestion.setText(getString(R.string.what_made_you_smile_today, name));

            EditText fifthAnswerField = (EditText) findViewById(R.id.fifth_answer_field);
            fifthAnswerField.setVisibility(View.VISIBLE);

            Button askQuestion = (Button) findViewById(R.id.ask_question);
            askQuestion.setVisibility(View.GONE);

            TextView statusTag = (TextView) findViewById(R.id.status_tag);
            statusTag.setVisibility(View.VISIBLE);

            RadioGroup barometerGlueck =(RadioGroup) findViewById(R.id.glueck_barometer);
            barometerGlueck.setVisibility(View.VISIBLE);

            Button shareButton = (Button) findViewById(R.id.share_button);
            shareButton.setVisibility(View.VISIBLE);

            TextView heuteWar = (TextView) findViewById(R.id.heute_war);
            heuteWar.setVisibility(View.VISIBLE);

            Button weilSo = (Button) findViewById(R.id.weil_button);
            weilSo.setVisibility(View.VISIBLE);

        }


        questionNumber = questionNumber + 1;

    }

    /**
     * Only one picture is shown when one radio button is clicked.
     */

    public void esIstRund(View view) {
        ImageView rundImageView = (ImageView) findViewById(R.id.kleeblatt_rund_image_view);
        rundImageView.setVisibility(View.VISIBLE);
        ImageView kaeferImageView = (ImageView) findViewById(R.id.kleeblatt_kaefer_image_view);
        kaeferImageView.setVisibility(View.GONE);
        ImageView braunImageView = (ImageView) findViewById(R.id.kleeblatt_braun_image_view);
        braunImageView.setVisibility(View.GONE);
        ImageView handImageView = (ImageView) findViewById(R.id.kleeblatt_hand_image_view);
        handImageView.setVisibility(View.GONE);
        ImageView gruenImageView = (ImageView) findViewById(R.id.kleeblatt_gruen_image_view);
        gruenImageView.setVisibility(View.GONE);
    }

    public void esIstBraun(View view) {
        ImageView braunImageView = (ImageView) findViewById(R.id.kleeblatt_braun_image_view);
        braunImageView.setVisibility(View.VISIBLE);
        ImageView rundImageView = (ImageView) findViewById(R.id.kleeblatt_rund_image_view);
        rundImageView.setVisibility(View.GONE);
        ImageView kaeferImageView = (ImageView) findViewById(R.id.kleeblatt_kaefer_image_view);
        kaeferImageView.setVisibility(View.GONE);
        ImageView handImageView = (ImageView) findViewById(R.id.kleeblatt_hand_image_view);
        handImageView.setVisibility(View.GONE);
        ImageView gruenImageView = (ImageView) findViewById(R.id.kleeblatt_gruen_image_view);
        gruenImageView.setVisibility(View.GONE);
    }

    public void esIstHand(View view) {
        ImageView handImageView = (ImageView) findViewById(R.id.kleeblatt_hand_image_view);
        handImageView.setVisibility(View.VISIBLE);
        ImageView braunImageView = (ImageView) findViewById(R.id.kleeblatt_braun_image_view);
        braunImageView.setVisibility(View.GONE);
        ImageView rundImageView = (ImageView) findViewById(R.id.kleeblatt_rund_image_view);
        rundImageView.setVisibility(View.GONE);
        ImageView kaeferImageView = (ImageView) findViewById(R.id.kleeblatt_kaefer_image_view);
        kaeferImageView.setVisibility(View.GONE);
        ImageView gruenImageView = (ImageView) findViewById(R.id.kleeblatt_gruen_image_view);
        gruenImageView.setVisibility(View.GONE);
    }


    public void esIstGruen(View view) {
        ImageView gruenImageView = (ImageView) findViewById(R.id.kleeblatt_gruen_image_view);
        gruenImageView.setVisibility(View.VISIBLE);
        ImageView handImageView = (ImageView) findViewById(R.id.kleeblatt_hand_image_view);
        handImageView.setVisibility(View.GONE);
        ImageView braunImageView = (ImageView) findViewById(R.id.kleeblatt_braun_image_view);
        braunImageView.setVisibility(View.GONE);
        ImageView rundImageView = (ImageView) findViewById(R.id.kleeblatt_rund_image_view);
        rundImageView.setVisibility(View.GONE);
        ImageView kaeferImageView = (ImageView) findViewById(R.id.kleeblatt_kaefer_image_view);
        kaeferImageView.setVisibility(View.GONE);
    }

    public void esIstKaefer(View view) {
        ImageView kaeferImageView = (ImageView) findViewById(R.id.kleeblatt_kaefer_image_view);
        kaeferImageView.setVisibility(View.VISIBLE);
        ImageView gruenImageView = (ImageView) findViewById(R.id.kleeblatt_gruen_image_view);
        gruenImageView.setVisibility(View.GONE);
        ImageView handImageView = (ImageView) findViewById(R.id.kleeblatt_hand_image_view);
        handImageView.setVisibility(View.GONE);
        ImageView braunImageView = (ImageView) findViewById(R.id.kleeblatt_braun_image_view);
        braunImageView.setVisibility(View.GONE);
        ImageView rundImageView = (ImageView) findViewById(R.id.kleeblatt_rund_image_view);
        rundImageView.setVisibility(View.GONE);
    }

    /**
     * This method is called when the weil button is clicked.
     */

    public void weil(View view) {
        TextView allTogether = (TextView) findViewById(R.id.all_together);
        allTogether.setVisibility(View.VISIBLE);

        EditText firstAnswerField = (EditText) findViewById(R.id.first_answer_field);
        firstAnswer = firstAnswerField.getText().toString();
        String firstHint = firstAnswerField.getHint().toString();

        EditText secondAnswerField = (EditText) findViewById(R.id.second_answer_field);
        secondAnswer = secondAnswerField.getText().toString();
        String secondHint = secondAnswerField.getHint().toString();

        EditText thirdAnswerField = (EditText) findViewById(R.id.third_answer_field);
        thirdAnswer = thirdAnswerField.getText().toString();
        String thirdHint = thirdAnswerField.getHint().toString();

        EditText fourthAnswerField = (EditText) findViewById(R.id.fourth_answer_field);
        fourthAnswer = fourthAnswerField.getText().toString();
        String fourthHint = fourthAnswerField.getHint().toString();

        EditText fifthAnswerField = (EditText) findViewById(R.id.fifth_answer_field);
        fifthAnswer = fifthAnswerField.getText().toString();
        String fifthHint = fifthAnswerField.getHint().toString();

        fullAnswer = firstHint + ":" + "\n" + firstAnswer + "\n" + secondHint + ":" + "\n" + secondAnswer + "\n" + thirdHint + ":" + "\n" + thirdAnswer + "\n" + fourthHint + ":" + "\n" + fourthAnswer + "\n" + fifthHint + ":" + "\n" + fifthAnswer;

        allTogether.setText(fullAnswer);
    }

    /**
     * This method is called when the send button is clicked.
     */

    public void sendQuestion(View view) {
        TextView heuteWar = (TextView) findViewById(R.id.heute_war);
        String subject = heuteWar.getText().toString();

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.setType("*/*");
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        sendIntent.putExtra(Intent.EXTRA_TEXT, fullAnswer);

        startActivity(Intent.createChooser(sendIntent, null));

        /*if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendIntent);
        }
        */

    }

}