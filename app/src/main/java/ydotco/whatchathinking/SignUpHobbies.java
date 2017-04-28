package ydotco.whatchathinking;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class SignUpHobbies extends AppCompatActivity implements View.OnClickListener {
    ImageButton entertainment, fashion, finance,
            literature, music, photography, programming, relationship, technology, travel;
    Boolean entertainmentFlag = true, fashionFlag = true, financeFlag = true, literatureFlag = true,
            musicFlag = true, photographyFlag = true, travelFlag = true, programmingFlag = true,
            relationshipFlag = true, technologyFlag = true;
    ArrayList<String> hobbies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_hobbies);
        init();
        setClick();
        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //the hobbies are stored in  an arrayList "hobbies"
                addHobbies();
               //add to firebase here
                addToServer();
                Toast.makeText(SignUpHobbies.this, hobbies.toString(), Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(getApplicationContext(),AskQuestion.class);
                finish();
                startActivity(intent);
            }
        });
    }

    private void addToServer() {
    }

    private void addHobbies() {
        if (!entertainmentFlag)
            hobbies.add("entertainment");
        if(!fashionFlag)
            hobbies.add("fashion");
        if(!financeFlag)
            hobbies.add("finance");
        if(!literatureFlag)
            hobbies.add("literature");
        if(!musicFlag)
            hobbies.add("music");
        if(!photographyFlag)
            hobbies.add("photography");
        if(!travelFlag)
            hobbies.add("travel");
        if(!programmingFlag)
            hobbies.add("programming");
        if(!relationshipFlag)
            hobbies.add("relationship");
        if(!technologyFlag)
            hobbies.add("technology");
    }

    private void setClick() {
        entertainment.setOnClickListener(this);
        fashion.setOnClickListener(this);
        finance.setOnClickListener(this);
        literature.setOnClickListener(this);
        music.setOnClickListener(this);
        photography.setOnClickListener(this);
        programming.setOnClickListener(this);
        relationship.setOnClickListener(this);
        technology.setOnClickListener(this);
        travel.setOnClickListener(this);
    }

    private void init() {
        entertainment = (ImageButton) findViewById(R.id.entertainment);
        fashion = (ImageButton) findViewById(R.id.fashion);
        finance = (ImageButton) findViewById(R.id.finance);
        literature = (ImageButton) findViewById(R.id.literature);
        music = (ImageButton) findViewById(R.id.music);
        photography = (ImageButton) findViewById(R.id.photography);
        programming = (ImageButton) findViewById(R.id.programming);
        relationship = (ImageButton) findViewById(R.id.relationship);
        technology = (ImageButton) findViewById(R.id.technology);
        travel = (ImageButton) findViewById(R.id.travel);
        hobbies=new ArrayList<>();
    }


    @Override
    public void onClick(View view) {
        Animation fadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in_animation);
        switch (view.getId()) {
            case (R.id.entertainment): {
                entertainmentFlag = !entertainmentFlag;
                entertainment.startAnimation(fadeIn);
                if (!entertainmentFlag)
                    entertainment.setImageResource(R.drawable.entertainment_v);
                else
                    entertainment.setImageResource(R.drawable.entertainment);
                break;
            }
            case (R.id.fashion): {
                fashionFlag = !fashionFlag;
                fashion.startAnimation(fadeIn);
                if (!fashionFlag)
                    fashion.setImageResource(R.drawable.fashion_v);
                else
                    fashion.setImageResource(R.drawable.fashion);
                break;
            }
            case (R.id.finance): {
                financeFlag = !financeFlag;
                finance.startAnimation(fadeIn);
                if (!financeFlag)
                    finance.setImageResource(R.drawable.finances_v);
                else
                    finance.setImageResource(R.drawable.finances);
                break;

            }
            case (R.id.literature): {
                literatureFlag = !literatureFlag;
                literature.startAnimation(fadeIn);
                if (!literatureFlag)
                    literature.setImageResource(R.drawable.literature_v);
                else
                    literature.setImageResource(R.drawable.literature);
                break;

            }
            case (R.id.music): {
                musicFlag = !musicFlag;
                music.startAnimation(fadeIn);
                if (!musicFlag)
                    music.setImageResource(R.drawable.music_v);
                else
                    music.setImageResource(R.drawable.music);
                break;

            }
            case (R.id.photography): {
                photographyFlag = !photographyFlag;
                photography.startAnimation(fadeIn);
                if (!photographyFlag)
                    photography.setImageResource(R.drawable.photography_v);
                else
                    photography.setImageResource(R.drawable.photography);
                break;

            }
            case (R.id.programming): {
                programmingFlag = !programmingFlag;
                programming.startAnimation(fadeIn);
                if (!programmingFlag)
                    programming.setImageResource(R.drawable.programming_v);
                else
                    programming.setImageResource(R.drawable.programming);
                break;

            }
            case (R.id.relationship): {
                relationshipFlag = !relationshipFlag;
                relationship.startAnimation(fadeIn);
                if (!relationshipFlag)
                    relationship.setImageResource(R.drawable.relationships_v);
                else
                    relationship.setImageResource(R.drawable.relationships);

                break;

            }
            case (R.id.technology): {
                technologyFlag = !technologyFlag;
                technology.startAnimation(fadeIn);
                if (!technologyFlag)
                    technology.setImageResource(R.drawable.technology_v);
                else
                    technology.setImageResource(R.drawable.technology);

                break;

            }
            case (R.id.travel): {
                travelFlag = !travelFlag;
                travel.startAnimation(fadeIn);
                if (!travelFlag)
                    travel.setImageResource(R.drawable.travel_v);
                else
                    travel.setImageResource(R.drawable.travel);
                break;

            }
            default:
                Toast.makeText(this, "didnt work...", Toast.LENGTH_SHORT).show();
        }
    }
}
