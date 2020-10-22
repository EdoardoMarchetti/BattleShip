package com.edomar.battleship.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.edomar.battleship.R;
import com.edomar.battleship.View.menuFragments.FleetFragment;
import com.edomar.battleship.View.menuFragments.MainMenuFragment;
import com.edomar.battleship.View.menuFragments.SettingsFragment;

public class HudActivity extends AppCompatActivity {

    public static final String TAG = HudActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hud);
        if(savedInstanceState == null){
            final MainMenuFragment mainMenuFragment = new MainMenuFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.anchor_point, mainMenuFragment, MainMenuFragment.TAG)
                    .commit();
        }
    }

    public void showFragment(final View selectedMenu){
        final int viewID = selectedMenu.getId();
        Fragment nextFragment;
        Log.d("Pressed button", "changeActivity:");
        Log.d("viewId", "changeActivity: "+viewID);
        Log.d("leftButton", "changeActivity: "+R.id.left_button);
        Log.d("rightButton", "changeActivity: "+R.id.right_button);
        Log.d("centralButton", "changeActivity: "+R.id.central_button);
        switch (viewID){
            case (R.id.left_button):
                Log.d("Pressed button", "changeActivity: left");
                nextFragment = new SettingsFragment();
                break;
            case (R.id.central_button):
                Log.d("Pressed button", "changeActivity: central");
                nextFragment=new MainMenuFragment();
                break;
            case (R.id.right_button):
                nextFragment = new FleetFragment();
                Log.d("Pressed button", "changeActivity: right");
                break;
            default:
                throw new IllegalArgumentException("No Fragment for the given item");
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.anchor_point, nextFragment, TAG)
                .commit();

    }
}