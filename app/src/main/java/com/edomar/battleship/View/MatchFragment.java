package com.edomar.battleship.View;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.edomar.battleship.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MatchFragment extends Fragment implements View.OnClickListener {

    public static final String TAG = MatchFragment.class.getSimpleName();

    private SinglePlayerGame mActivity;
    private Button mButton;

    public MatchFragment() {
        //Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        mActivity = (SinglePlayerGame) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mActivity= null;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_match, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mButton = (Button) getActivity().findViewById(R.id.win_button);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "onClick: ");
        Fragment nextFragment = new WinnerFragment();
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.anchor_point_for_game, nextFragment)
                .commit();
    }

}
