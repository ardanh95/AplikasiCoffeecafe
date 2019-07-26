package com.Coffeepoffee.app.aplikasicaffe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class struk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struk);

        TextView pesanan = (TextView)findViewById(R.id.totalpesanan);
        TextView total = (TextView)findViewById(R.id.totalharga);
        final TextView nama = (TextView)findViewById(R.id.nama);
        TextView meja = (TextView)findViewById(R.id.meja);
        final Button tombol =(Button) findViewById(R.id.tombol);
        Button tidak = (Button) findViewById(R.id.tidak);

        final Intent intent = getIntent();
        final String sum = intent.getStringExtra("summaryOrder");
        final int tot = intent.getIntExtra("totalOrder",0);

        System.out.println("xxxx total order atas = " + tot);

        pesanan.setText(sum);
        total.setText("Rp. "+tot);

        final String nam = intent.getStringExtra("nama");
        final String mej = intent.getStringExtra("meja");

        nama.setText(nam);
        meja.setText(mej);

        tidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( struk.this, "Terimakasih Telah Melakukan Pesanan", Toast.LENGTH_LONG).show();
                startActivity(new Intent(struk.this, MainActivity.class));
            }
        });
        if (intent.getStringExtra("type").equals("makanan")){
            tombol.setText("Minuman");
        }
        else {
            tombol.setText("Makanan");
        }
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intent.getStringExtra("type").equals("makanan")){
                    Intent intent1= new Intent(struk.this, HalamanUtama.class);
                    intent1.putExtra("summaryOrder", sum);
                    System.out.println("xxxx total order = " + tot);
                    intent1.putExtra("totalOrder", String.valueOf(tot));
                    intent1.putExtra("nama", nam);
                    intent1.putExtra("meja", mej);
                    intent1.putExtra("isnew", "no");
                    startActivity(intent1);
                }
                else {
                    Intent intent1= new Intent(struk.this, HalamanKetiga.class);
                    intent1.putExtra("summaryOrder", sum);
                    System.out.println("xxxx total order = " + tot);
                    intent1.putExtra("totalOrder", String.valueOf(tot));
                    intent1.putExtra("nama", nam);
                    intent1.putExtra("meja", mej);
                    intent1.putExtra("isnew", "no");
                    startActivity(intent1);
                }
            }
        });
    }
}
