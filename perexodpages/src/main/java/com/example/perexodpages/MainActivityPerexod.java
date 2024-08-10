package com.example.perexodpages;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.Instant;

public class MainActivityPerexod extends AppCompatActivity {

   public EditText names1;
   //public Button Dalee1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_perexod);

        names1 = findViewById(R.id.HumanName);
    }

    public void Nazad(View v)
    {
        Intent intent = new Intent(this, MainActivityPerexodStart.class);
        startActivity(intent);
    }
    @SuppressLint("ResourceType")
    public void Dalee1(View v)
    {



        names1 = findViewById(R.id.HumanName);
        Intent intent1 = new Intent(this, MainActivityPerexodDone.class);
        intent1.putExtra("names",names1.getText().toString());
        startActivity(intent1);



    }

}