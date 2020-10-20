package com.edomar.battleship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FleetMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Fleet", "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fleet_menu);
    }

    public void saveFleet(View view) {
        //TODO
    }

    public void changeActivity (final View selectedMenu){
        final int viewID = selectedMenu.getId();
        Intent intent;
        Log.d("Pressed button", "changeActivity:");
        Log.d("viewId", "changeActivity: "+viewID);
        Log.d("leftButton", "changeActivity: "+R.id.left_button);
        Log.d("rightButton", "changeActivity: "+R.id.right_button);
        switch (viewID){
            case (R.id.left_button):
                Log.d("Pressed button", "changeActivity: left");
                intent = new Intent(this, SettingsMenuActivity.class);
                startActivity(intent);
                break;
            case (R.id.central_button):
                Log.d("Pressed button", "changeActivity: ");
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            case (R.id.right_button):
                intent = new Intent(this, FleetMenuActivity.class);
                startActivity(intent);
                Log.d("Pressed button", "changeActivity: rigth");
                break;
            default:
                break;
        }

    }
}