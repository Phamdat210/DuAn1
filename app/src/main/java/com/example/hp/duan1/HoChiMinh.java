package com.example.hp.duan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HoChiMinh extends AppCompatActivity {
    private Button btnHochiminhPlace;
    private Button btnHochiminhFoods;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ho_chi_minh);

        btnHochiminhPlace = (Button) findViewById(R.id.btnHochiminhPlace);
        btnHochiminhFoods = (Button) findViewById(R.id.btnHochiminhFoods);

        btnHochiminhPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HoChiMinh.this,HoChiMinhPlace.class);
                startActivity(intent);
            }
        });

        btnHochiminhFoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HoChiMinh.this,HoChiMinhFoods.class);
                startActivity(intent);
            }
        });

    }
}
