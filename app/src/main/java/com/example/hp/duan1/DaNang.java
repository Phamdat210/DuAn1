package com.example.hp.duan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DaNang extends AppCompatActivity {
    private Button btnDanangPlace;
    private Button btnDanangFoods;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_da_nang);


        btnDanangPlace = (Button) findViewById(R.id.btnDanangPlace);
        btnDanangFoods = (Button) findViewById(R.id.btnDanangFoods);

        btnDanangPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaNang.this,DaNangPlace.class);
                startActivity(intent);
            }
        });

        btnDanangFoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaNang.this,DaNangFoods.class);
                startActivity(intent);
            }
        });

    }
}
