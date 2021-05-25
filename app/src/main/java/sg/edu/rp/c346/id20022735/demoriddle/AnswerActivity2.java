package sg.edu.rp.c346.id20022735.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAns2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAns2 = findViewById(R.id.textView2);

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question1");
        tvAns2.setText(questionsSelected + " answer is: Gone");
    }
}