package com.trizdev.myapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.trizdev.myapps.viewModel.ProfileVM;

//tgl pengerjaan : 28/05/2021
//Nim : 10118080
//Nama : Taufiq Rizky
//Kelas : IF2/S1/VI
public class Splash extends AppCompatActivity {
    private ProfileVM viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent intent = new Intent(this, Walkthrough.class);
        final Handler handler = new Handler(Looper.getMainLooper());
        viewModel = ViewModelProviders.of(this).get(ProfileVM.class);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}