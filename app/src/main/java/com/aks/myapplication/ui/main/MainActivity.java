package com.aks.myapplication.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

import com.aks.myapplication.R;
import com.aks.myapplication.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            finish();
            finishAffinity();
            startActivity(new Intent(context, LoginActivity.class));
        }, 3000);
    }
}