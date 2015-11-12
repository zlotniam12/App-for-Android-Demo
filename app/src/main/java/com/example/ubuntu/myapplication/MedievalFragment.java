package com.example.ubuntu.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ubuntu.myapplication.R;

/**
 * Created by ubuntu on 11/12/15.
 */
public class MedievalFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_medieval, container, false);
return rootView;
    }
}