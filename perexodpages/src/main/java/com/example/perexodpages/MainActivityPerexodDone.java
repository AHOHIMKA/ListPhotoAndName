package com.example.perexodpages;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivityPerexodDone extends AppCompatActivity {

    public TextView namesDone;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_perexod_done);

        namesDone = findViewById(R.id.textViewDone);

        Intent intent = getIntent();
        String name = intent.getStringExtra("names");
        namesDone.setText("Здравствуйте, " + name);
    }

    public void Nazad1(View v)
    {
        Intent intent2 = new Intent(this, MainActivityPerexod.class);
        startActivity(intent2);


    }




}