package com.example.hp.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll=(Button)findViewById(R.id.button);
        final ImageView left=(ImageView)findViewById(R.id.imagedicel);
        final ImageView right=(ImageView) findViewById(R.id.imagedice2);
       final int[] array={
                R.drawable.dice1
        ,R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6};

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();
                int randno=random.nextInt(6);
                left.setImageResource(array[randno]);
                randno=random.nextInt(6);
                right.setImageResource(array[randno]);
            }
        });
    }
}
