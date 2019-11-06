package com.example.yogaafdilla;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FriendActivity extends AppCompatActivity{
    private TextView txtfriend;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);
        txtfriend = findViewById(R.id.txt_friend);


        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        txtfriend.setText(nama);
    }
}
