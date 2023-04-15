package com.example.aprilactivity.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.aprilactivity.SecondActivity;
import com.example.aprilactivity.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        final Button buttonGotosecond = binding.buttonGotosecond;

        buttonGotosecond.setOnClickListener(new View.OnClickListener() {

        @Override
            public void onClick(View v) {
            Intent intent = new Intent(getContext(), SecondActivity.class);
            intent.putExtra("PASS_ME", "This is Second Fragment");
            startActivity(intent);
        }
    });
            return root;
}

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;

    }
}