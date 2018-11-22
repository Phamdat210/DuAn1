package com.example.hp.duan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Hanoi extends AppCompatActivity {
    private Button btnHanoiPlace;
    private Button btnHanoiFoods;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanoi);

        btnHanoiPlace = (Button) findViewById(R.id.btnHanoiPlace);
        btnHanoiFoods = (Button) findViewById(R.id.btnHanoiFoods);

        btnHanoiPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hanoi.this,HaNoiPlace.class);
                startActivity(intent);
            }
        });

        btnHanoiFoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hanoi.this,HaNoiFoods.class);
                startActivity(intent);
            }
        });

    }
}
