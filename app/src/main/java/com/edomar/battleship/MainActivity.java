package com.edomar.battleship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import static android.widget.LinearLayout.*;

public class MainActivity extends AppCompatActivity {

    private static View mHud;
    private static LinearLayout mButtonsMenu;
    private static RelativeLayout leftButton, centralButton, rightButton;
    private static LinearLayout mGameModeMenu;
    private static ImageView rightArrow, leftArrow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Main", "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHud = findViewById(R.id.hud_layout);
        mButtonsMenu = (LinearLayout) mHud.findViewById(R.id.buttons_menu);
        //LinearLayout.LayoutParams lp= new LinearLayout.LayoutParams(mButtonsMenu.getWidth(), mButtonsMenu.getHeight());
        leftButton = (RelativeLayout) mButtonsMenu.findViewById(R.id.left_button);
        //lp.weight=1;
        //leftButton.setLayoutParams(lp);
        centralButton = (RelativeLayout) mButtonsMenu.findViewById(R.id.central_button);
        //lp.weight=2;
        //centralButton.setLayoutParams(lp);
        rightButton = (RelativeLayout) mButtonsMenu.findViewById(R.id.right_button);
        //lp.weight=1;
        //rightButton.setLayoutParams(lp);

        mGameModeMenu = (LinearLayout) findViewById(R.id.game_mode_menu);
        leftArrow = (ImageView) mGameModeMenu.findViewById(R.id.left_arrow);
        rightArrow = (ImageView) mGameModeMenu.findViewById(R.id.right_arrow);

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