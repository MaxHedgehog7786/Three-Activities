package com.example.three_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.three_activities.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    static final String KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = new Intent(this, FirstActivity.class);
        intent.putExtra(KEY, 1);
        startActivity(intent);
    }
}