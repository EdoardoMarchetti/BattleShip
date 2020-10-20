package com.edomar.battleship.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.edomar.battleship.R;

public class SinglePlayerGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player_game);
        if(savedInstanceState == null){
            final ScenarioSelectionFragment scenarioSelectionFragment = new ScenarioSelectionFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.anchor_point_for_game, scenarioSelectionFragment, ScenarioSelectionFragment.TAG)
                    .commit();
        }
    }


}