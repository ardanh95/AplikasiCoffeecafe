package com.Coffeepoffee.app.aplikasicaffe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HalamanPertama extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_pertama);

        Button makanan = (Button) findViewById(R.id.makanan);
        Button minuman = (Button) findViewById(R.id.minuman);

        makanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HalamanPertama.this, HalamanUtama.class);
                intent.putExtra("isnew", "new");
                startActivity(intent);
            }
        });

        minuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HalamanPertama.this, HalamanKetiga.class);
                intent.putExtra("isnew", "new");
                startActivity(intent);
            }
        });


    }
}
