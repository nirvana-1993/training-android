package th.ac.sut.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Button buttonSecondActivity;
    private TextView textViewSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        infixView();

        buttonSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void infixView() {

        buttonSecondActivity = (Button) findViewById(R.id.buttonSecondActivity);
        textViewSecondActivity = (TextView) findViewById(R.id.textViewSecondActivity);
    }
}
