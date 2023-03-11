package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;

public class MainFragmentActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        Button button3 = view.findViewById(R.id.button3);
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), FragmentB.class);
            startActivity(intent);
        });

        Button button4 = view.findViewById(R.id.button4);
        button4.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), FragmentC.class);
            startActivity(intent);
        });

        return view;
    }
}