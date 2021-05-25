package sg.edu.rp.c346.id20022735.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvq1;
    Button btnreq1;
    TextView tvq2;
    Button btnreq2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvq1 = findViewById(R.id.textViewQ1);
        btnreq1 = findViewById(R.id.buttonRevealQ1);
        tvq2 = findViewById(R.id.textViewQ2);
        btnreq2 = findViewById(R.id.buttonRevealQ2);

        btnreq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AnswerActivity1.class);
                intent.putExtra("Question", "Q1");
                startActivity(intent);

            }
        });
        btnreq2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AnswerActivity2.class);
                intent.putExtra("Question1", "Q2");
                startActivity(intent);

            }
        });
    }
}