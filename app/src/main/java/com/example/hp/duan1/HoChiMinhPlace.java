package com.example.hp.duan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HoChiMinhPlace extends AppCompatActivity {
    private Button btnHochiminhChurch;
    private Button btnHochiminhBitexco;
    private Button btnHochiminhTemple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ho_chi_minh_place);

        btnHochiminhChurch = (Button) findViewById(R.id.btnHochiminhChurch);
        btnHochiminhBitexco = (Button) findViewById(R.id.btnHochiminhBitexco);
        btnHochiminhTemple = (Button) findViewById(R.id.btnHochiminhTemple);

        btnHochiminhChurch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HoChiMinhPlace.this, HoChiMinhChurchPlace.class);
                startActivity(intent);
            }
        });
        btnHochiminhBitexco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HoChiMinhPlace.this,HoChiMinhBitexcoPlace.class);
                startActivity(intent);
            }
        });
        btnHochiminhTemple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HoChiMinhPlace.this,HoChiMinhTemplePlace.class);
                startActivity(intent);
            }
        });
    }
}
