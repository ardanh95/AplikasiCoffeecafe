package com.Coffeepoffee.app.aplikasicaffe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.jar.Attributes;

public class HalamanKetiga extends AppCompatActivity {

    private boolean isDataIntentAvailable = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_ketiga);


        final EditText nama = (EditText)findViewById(R.id.nama);
        final EditText meja = (EditText)findViewById(R.id.meja);

        final CheckBox pisanggoreng = (CheckBox) findViewById(R.id.pisanggoreng);
        final CheckBox rotibakar = (CheckBox) findViewById(R.id.rotibakar);
        final CheckBox kentanggoreng =(CheckBox) findViewById(R.id.kentanggoreng);
        final CheckBox sosisbakar = (CheckBox) findViewById(R.id.sosisbakar);
        final CheckBox pisangbakar = (CheckBox) findViewById(R.id.pisangbakar);
        final CheckBox martabakmie = (CheckBox) findViewById(R.id.martabakmie);
        final CheckBox chickenfingers = (CheckBox) findViewById(R.id.chickenfingers);
        final CheckBox crispychicken = (CheckBox) findViewById(R.id.crispychicken);
        final CheckBox onoionring = (CheckBox) findViewById(R.id.onionring);
        final CheckBox nachos = (CheckBox) findViewById(R.id.nachos);

        final EditText jml_pisanggoreng = (EditText) findViewById(R.id.pisanggoreng1);
        final EditText jml_rotibakar = (EditText) findViewById(R.id.rotibakar1);
        final EditText jml_kentanggoreng = (EditText) findViewById(R.id.kentanggoreng1);
        final EditText jml_sosisbakar = (EditText) findViewById(R.id.sosisbakar1);
        final EditText jml_pisangbakar = (EditText) findViewById(R.id.pisangbakar1);
        final EditText jml_martabakmie = (EditText) findViewById(R.id.martabakmie1);
        final EditText jml_chickenfingers = (EditText) findViewById(R.id.chickenfingers1);
        final EditText jml_crispychicken = (EditText) findViewById(R.id.crispychicken1);
        final EditText jml_onoionring = (EditText) findViewById(R.id.onionring1);
        final EditText jml_nachos = (EditText) findViewById(R.id.nachos1);

        final int harga_pisanggoreng = 10000;
        final int harga_rotibakar = 15000;
        final int harga_kentanggoreng = 10000;
        final int harga_sosisbakar = 15000;
        final int harga_pisangbakar = 10000;
        final int harga_martabakmie= 15000;
        final int harga_chickenfingers = 30000;
        final int harga_crispychicken = 25000;
        final int harga_onoionring = 18000;
        final int harga_nachos = 25000;

        final Intent intent = getIntent();

        if (!intent.getStringExtra("isnew").equals("new")){
            isDataIntentAvailable = true;
            nama.setText(intent.getStringExtra("nama"));
            meja.setText(intent.getStringExtra("meja"));
        }else{
            isDataIntentAvailable = false;
        }


        Button pesan = (Button)findViewById(R.id.pesan);

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String summOrder = "";
                int totOlder = 0;
                if (pisanggoreng.isChecked()){
                    String txt = "- Pisang Goreng";
                    int jml =Integer.parseInt(String.valueOf(jml_pisanggoreng.getText()));
                    int calc = jml*harga_pisanggoreng;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (kentanggoreng.isChecked()){
                    String txt = "- Kentang Goreng ";
                    int jml =Integer.parseInt(String.valueOf(jml_kentanggoreng.getText()));
                    int calc = jml*harga_kentanggoreng;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (sosisbakar.isChecked()){
                    String txt = "- Sosis Bakar";
                    int jml =Integer.parseInt(String.valueOf(jml_sosisbakar.getText()));
                    int calc = jml*harga_sosisbakar;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (pisangbakar.isChecked()){
                    String txt = "- Pisang Bakar";
                    int jml =Integer.parseInt(String.valueOf(jml_pisangbakar.getText()));
                    int calc = jml*harga_pisangbakar;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (rotibakar.isChecked()){
                    String txt = "- Roti Bakar";
                    int jml =Integer.parseInt(String.valueOf(jml_rotibakar.getText()));
                    int calc = jml*harga_rotibakar;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (martabakmie.isChecked()){
                    String txt = "- Martabak Mie";
                    int jml =Integer.parseInt(String.valueOf(jml_martabakmie.getText()));
                    int calc = jml*harga_martabakmie;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (chickenfingers.isChecked()){
                    String txt = "- Chicken Fingers";
                    int jml =Integer.parseInt(String.valueOf(jml_chickenfingers.getText()));
                    int calc = jml*harga_chickenfingers;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (crispychicken.isChecked()){
                    String txt = "- Crispy Chicken";
                    int jml =Integer.parseInt(String.valueOf(jml_crispychicken.getText()));
                    int calc = jml*harga_crispychicken;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (onoionring.isChecked()){
                    String txt = "- Onion Ring";
                    int jml =Integer.parseInt(String.valueOf(jml_onoionring.getText()));
                    int calc = jml*harga_onoionring;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (nachos.isChecked()){
                    String txt = "- Nachos ";
                    int jml =Integer.parseInt(String.valueOf(jml_nachos.getText()));
                    int calc = jml*harga_nachos;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }

                if(isDataIntentAvailable){
                    summOrder+=intent.getStringExtra("summaryOrder");
                    totOlder+=Integer.parseInt(intent.getStringExtra("totalOrder"));
                }

                Intent myIntent = new Intent(HalamanKetiga.this,struk.class);
                myIntent.putExtra("summaryOrder",summOrder);
                myIntent.putExtra("totalOrder",totOlder);
                myIntent.putExtra("nama", nama.getText().toString());
                myIntent.putExtra("meja", meja.getText().toString());
                myIntent.putExtra("type","makanan");
                startActivity(myIntent);
            }
        });


    }
}
