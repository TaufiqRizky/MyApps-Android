package com.trizdev.myapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.trizdev.myapps.Database.ProfileDatabase;
import com.trizdev.myapps.Database.profileDAO;
import com.trizdev.myapps.Entity.ProfileRoomEntity;

import java.util.ArrayList;
import java.util.List;

//tgl pengerjaan : 28/05/2021
//Nim : 10118080
//Nama : Taufiq Rizky
//Kelas : IF2/S1/VI

public class MainActivity extends AppCompatActivity {

    MeowBottomNavigation botNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        botNav = findViewById(R.id.bottomNav);

        botNav.add(new MeowBottomNavigation.Model(1,R.drawable.ic_activity));
        botNav.add(new MeowBottomNavigation.Model(2,R.drawable.ic_gallery));
        botNav.add(new MeowBottomNavigation.Model(3,R.drawable.ic_home));
        botNav.add(new MeowBottomNavigation.Model(4,R.drawable.ic_music));
        botNav.add(new MeowBottomNavigation.Model(5,R.drawable.ic_profile));

        botNav.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                Fragment fragment =  null;

                switch (item.getId()){
                    case 1 :
                        fragment = new dailyActivity();
                        break;
                    case 2 :
                        fragment = new galleryFragment();
                        break;
                    case 3 :
                        fragment = new Home();
                        break;
                    case 4 :
                        fragment = new musicFragment();
                        break;
                    case 5 :
                        fragment = new profile();

                        break;
                }
                loadFragment(fragment);
            }
        });
        botNav.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                Fragment fragment =  null;

                switch (item.getId()){
                    case 1 :
                        fragment = new dailyActivity();
                        break;
                    case 2 :
                        fragment = new galleryFragment();
                        break;
                    case 3 :
                        fragment = new Home();
                        break;
                    case 4 :
                        fragment = new musicFragment();
                        break;
                    case 5 :
                        fragment = new profile();
                        break;
                }
                loadFragment(fragment);
            }
        });
        botNav.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragment =  null;

                switch (item.getId()){
                    case 1 :
                        fragment = new dailyActivity();
                        break;
                    case 2 :
                        fragment = new galleryFragment();
                        break;
                    case 3 :
                        fragment = new Home();
                        break;
                    case 4 :
                        fragment = new musicFragment();
                        break;
                    case 5 :
                        fragment = new profile();
                        break;
                }
                loadFragment(fragment);
            }
        });
        botNav.show(3,true);
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,fragment).commit();
    }
}