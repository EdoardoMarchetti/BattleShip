package com.edomar.battleship.View.gameplayFragments;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.edomar.battleship.R;
import com.edomar.battleship.View.menuFragments.FleetFragment;
import com.edomar.battleship.View.SinglePlayerGame;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WinnerFragment extends Fragment implements View.OnTouchListener{

    public static final String TAG = FleetFragment.class.getSimpleName();

    private SinglePlayerGame mActivity;
    private TextView mTextView;

    public WinnerFragment() {
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
        return inflater.inflate(R.layout.fragment_winner, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mTextView = (TextView) getActivity().findViewById(R.id.winner);
        mTextView.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Log.d(TAG, "onTouch: ");

        getActivity().finish();
        return true;
    }
}
