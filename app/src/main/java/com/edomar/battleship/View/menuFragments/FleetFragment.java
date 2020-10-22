package com.edomar.battleship.View.menuFragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.edomar.battleship.R;
import com.edomar.battleship.View.HudActivity;

public class FleetFragment extends Fragment {

    public static final String TAG = FleetFragment.class.getSimpleName();

    private HudActivity mActivity;

    public FleetFragment() {
        //Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        mActivity = (HudActivity) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mActivity= null;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fleet, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


}