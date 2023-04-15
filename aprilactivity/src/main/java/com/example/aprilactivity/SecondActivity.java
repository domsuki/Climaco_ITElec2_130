package com.example.aprilactivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aprilactivity.databinding.ActivityAprilBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivityAprilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView) findViewById(R.id.text_second);

        Intent intent = getIntent();
        String fromMain = intent.getStringExtra("PASS_ME");

        textView.setText(fromMain);
    }
}