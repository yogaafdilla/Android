package com.example.yogaafdilla;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout btn_others;
    private LinearLayout btn_friend;
    private BottomNavigationView bottomNavigationView;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            bottomNavigationView= findViewById(R.id.bottom_navigasi);

            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    switch (menuItem.getItemId()){
                        case R.id.item_home:
                            Toast toast = Toast.makeText(getApplicationContext(),"Ini adalah Home",Toast.LENGTH_LONG);
                            toast.show();
                    };
                            return true;

                }
            });

            btn_others = findViewById(R.id.btn_others);
            btn_others.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), OthersActivity.class);
                    intent.putExtra("nama", "INI ADALAH HALAMAN OTHERS");
                    startActivity(intent);

                }
            });

        btn_friend = findViewById(R.id.btn_friend);
        btn_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FriendActivity.class);
                intent.putExtra("nama", "INI ADALAH HALAMAN FRIEND");
                startActivity(intent);
            }
        });
    }
}
