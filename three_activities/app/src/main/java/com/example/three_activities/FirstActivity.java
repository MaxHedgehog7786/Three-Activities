package com.example.three_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.three_activities.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {
    static final String KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFirstBinding binding = ActivityFirstBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Bundle q = getIntent().getExtras();
        int n = q.getInt(KEY);
        binding.act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra(KEY,1);
                Toast.makeText(FirstActivity.this, "From A1 to A2", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        binding.act3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,ThirdActivity.class);
                intent.putExtra(KEY,1);
                Toast.makeText(FirstActivity.this, "From A1 to A3", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n==1){
                    Intent intent = new Intent(FirstActivity.this, FirstActivity.class);
                    intent.putExtra(KEY,1);
                    Toast.makeText(FirstActivity.this, "From A1 to A1", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                } else if (n==2){
                    Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                    intent.putExtra(KEY,1);
                    Toast.makeText(FirstActivity.this, "From A1 to A2", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(FirstActivity.this, ThirdActivity.class);
                    intent.putExtra(KEY,1);
                    Toast.makeText(FirstActivity.this, "From A1 to A3", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            }
        });
    }
}