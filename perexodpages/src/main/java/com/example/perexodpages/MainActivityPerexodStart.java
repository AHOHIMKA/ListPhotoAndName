package com.example.perexodpages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityPerexodStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_perexod_start);
    }

    public void Dalee(View v)
    {
        Intent intent = new Intent(this, MainActivityPerexod.class);
        startActivity(intent);
    }
}