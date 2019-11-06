package com.example.yogaafdilla;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout btn_others;
    private LinearLayout btn_friend;
    private BottomNavigationView bottomNavigationView;
    private final HomeFragment homeFragment = new HomeFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialView();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item_home:
//                            Toast toast = Toast.makeText(getApplicationContext(),"Ini adalah Home",Toast.LENGTH_LONG);
//                            toast.show();
                        loadFragment(homeFragment);
                        return true;
                }
                ;
                return false;

            }
        });

//        btn_others = findViewById(R.id.btn_others);
//        btn_others.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), OthersActivity.class);
//                intent.putExtra("nama", "INI ADALAH HALAMAN OTHERS");
//                startActivity(intent);
//            }
//        });
//
//        btn_friend = findViewById(R.id.btn_friend);
//        btn_friend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), FriendActivity.class);
//                intent.putExtra("nama", "INI ADALAH HALAMAN FRIEND");
//                startActivity(intent);
//            }
//        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.layout_content, fragment);
        fragmentTransaction.commit();
    }

    private void initialView() {
        bottomNavigationView = findViewById(R.id.bottom_navigasi);
    }
}
