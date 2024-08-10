package com.example.listphoto;

import android.appwidget.AppWidgetHost;
import android.graphics.Picture;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

            private Button ButtonRight,ButtonLeft;
            private ImageView Photos;
            private int count=0;
            int[] images  = {R.drawable.photo_1,R.drawable.photo_2,R.drawable.photo_3,R.drawable.photo_4,R.drawable.photo_5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonRight = findViewById(R.id.buttonRight);
        ButtonLeft = findViewById(R.id.buttonLeft);
        Photos = findViewById(R.id.imageView);

            ButtonRight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    count++;
                    if (count == 5)
                    {
                        count = 0;

                    }
                    Photos.setImageResource(images[count]);

                }
            });

            ButtonLeft.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    count--;
                    if (count <= -1)
                    {
                        count = 4;

                    }
                    Photos.setImageResource(images[count]);
                }
            });
    }




}