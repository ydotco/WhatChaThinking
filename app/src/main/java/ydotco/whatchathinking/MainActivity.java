package ydotco.whatchathinking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btSignUp;
    private Button btSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btSignUp = (Button) findViewById(R.id.btSignUp);
        btSignUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(getApplicationContext(), SignUp.class);
                startActivity(activityChangeIntent);
            }
        });

        btSignIn = (Button) findViewById(R.id.btSignIn);
        btSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityChangeIntent = new Intent(getApplicationContext(), SignIn.class);
                startActivity(activityChangeIntent);
            }
        });
    }

}
