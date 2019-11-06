package com.example.yogaafdilla;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OthersActivity extends AppCompatActivity {
    private TextView txtothers;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);
        txtothers = findViewById(R.id.txt_others);


        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        txtothers.setText(nama);
    }
}