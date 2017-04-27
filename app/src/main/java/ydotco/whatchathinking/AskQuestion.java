package ydotco.whatchathinking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AskQuestion extends AppCompatActivity {

    private EditText Question;
    private EditText Option1;
    private EditText Option2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_question);
        Question = (EditText) findViewById(R.id.etQuestion);
        Option1 = (EditText) findViewById(R.id.etOption1);
        Option2 = (EditText) findViewById(R.id.etOption2);

        Button btSubmit = (Button) findViewById(R.id.btSubmit);
        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendQuestion(Question.getText().toString(), Option1.getText().toString(), Option2.getText().toString());
                //The Question Saved To DB And Now The Client Waits For Response//



            }
        });
    }

    private void sendQuestion(String Q, String O1, String O2) {
        //Adding To The DB
    }
}
