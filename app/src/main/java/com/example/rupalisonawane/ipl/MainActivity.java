package com.example.rupalisonawane.ipl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int scoreTeamA = 0;
    public int scoreTeamB = 0;
    public int wicketTeamA = 0;
    public int wicketTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*public void win(View view) {
        TextView TV = findViewById(R.id.tv1);

        if ((wicketTeamA) == 10 && (wicketTeamB == 10)) {
            if (scoreTeamA > scoreTeamB) {
                TV.setText("Mumbai Indians have won the match");
            }
            else
            {
                TV.setText("Chennai Super Kings have won the match");
            }
        }
    }*/

    public void setToss(View view) {
        TextView TV = findViewById(R.id.tv1);
        TV.setText("Mumbai Won the TOSS and opted Batting");
    }

    public void setOne(View view) {
        switch (view.getId()) {
            case R.id.oneA: {
                scoreTeamA += 1;
                displayTeamAScore(scoreTeamA);
                break;
            }
            case R.id.oneB: {
                scoreTeamB += 1;
                displayTeamBScore(scoreTeamB);
            }
        }
    }

    public void setTwo(View view) {

        switch (view.getId()) {
            case R.id.twoA: {
                scoreTeamA += 2;
                displayTeamAScore(scoreTeamA);
                break;
            }
            case R.id.twoB: {
                scoreTeamB += 2;
                displayTeamBScore(scoreTeamB);
            }
        }
    }

    public void setFour(View view) {
        switch (view.getId()) {
            case R.id.fourA: {
                scoreTeamA += 4;
                displayTeamAScore(scoreTeamA);
                break;
            }
            case R.id.fourB: {
                scoreTeamB += 4;
                displayTeamBScore(scoreTeamB);
            }
        }
    }

    public void setSix(View view) {
        switch (view.getId()) {
            case R.id.sixA: {
                scoreTeamA += 6;
                displayTeamAScore(scoreTeamA);
                break;
            }
            case R.id.sixB: {
                scoreTeamB += 6;
                displayTeamBScore(scoreTeamB);
            }
        }
    }

    public void setWicket(View view) {

        switch (view.getId()) {
            case R.id.wicketA: {
                if (wicketTeamA < 10) {

                    ++wicketTeamA;
                    displayTeamAWicket();
                } else {
                    if ((wicketTeamA >= 10)) {
                        if (wicketTeamB == 10) {
                            if (scoreTeamA > scoreTeamB) {
                                Toast.makeText(MainActivity.this, "MI WON THE MATCH", Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(MainActivity.this, "CSK WON THE MATCH", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                }
                break;
            }
            case R.id.wicketB: {
                if (wicketTeamB < 10) {
                    ++wicketTeamB;
                    displayTeamBWicket();
                } else {
                    if ((wicketTeamA >= 10)) {
                        if(wicketTeamA==10) {
                            if (scoreTeamA > scoreTeamB) {
                                Toast.makeText(MainActivity.this, "MI WON THE MATCH", Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(MainActivity.this, "CSK WON THE MATCH", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                }
            }
        }

    }

    public void displayTeamAScore(int scoreTeamA) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void displayTeamBScore(int scoreTeamB) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void displayTeamAWicket() {
        TextView wicketView = findViewById(R.id.team_a_wicket);
        wicketView.setText(String.valueOf(wicketTeamA));
    }

    public void displayTeamBWicket() {
        TextView wicketView = findViewById(R.id.team_b_wicket);
        wicketView.setText(String.valueOf(wicketTeamB));
    }

    public void setReset(View view) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(0));
        TextView scoreView1 = findViewById(R.id.team_b_score);
        scoreView1.setText(String.valueOf(0));
        TextView wicketView = findViewById(R.id.team_a_wicket);
        wicketView.setText(String.valueOf(0));
        TextView wicketView1 = findViewById(R.id.team_b_wicket);
        wicketView1.setText(String.valueOf(0));
        TextView TV = findViewById(R.id.tv1);
        TV.setText("");
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketTeamA = 0;
        wicketTeamB = 0;
    }
}
