package com.Coffeepoffee.app.aplikasicaffe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.jar.Attributes;

public class HalamanUtama extends AppCompatActivity {

    private boolean isDataIntentAvailable = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

        final CheckBox original = (CheckBox)findViewById(R.id.coffeoriginal);
        final CheckBox Espresso = (CheckBox)findViewById(R.id.coffeEspresso);
        final CheckBox FlatWhite = (CheckBox)findViewById(R.id.coffeFlatWhite);
        final CheckBox Liqueur = (CheckBox)findViewById(R.id.coffeLiqueurCoffee);
        final CheckBox Macchiato = (CheckBox)findViewById(R.id.coffeMacchiato);
        final CheckBox Cappuccino = (CheckBox)findViewById(R.id.coffeCappuccino);
        final CheckBox Latte = (CheckBox)findViewById(R.id.coffeLatte);
        final CheckBox Americano = (CheckBox)findViewById(R.id.coffeAmericano);
        final CheckBox CafeMocha = (CheckBox)findViewById(R.id.coffeCafeMocha);
        final CheckBox Freddo = (CheckBox)findViewById(R.id.coffeFreddo);
        final CheckBox Hag = (CheckBox)findViewById(R.id.coffeHag);
        final CheckBox Marocchino = (CheckBox)findViewById(R.id.coffeMarocchino);
        final CheckBox Granitta = (CheckBox)findViewById(R.id.coffeGranitta);

        final EditText jml_original = (EditText)findViewById(R.id.quantityoriginal);
        final EditText jml_Espresso = (EditText)findViewById(R.id.quantityEspresso);
        final EditText jml_FlatWhite = (EditText)findViewById(R.id.quantityFlatWhite);
        final EditText jml_Liqueur = (EditText)findViewById(R.id.quantityLiqueurCoffee);
        final EditText jml_Macchiato = (EditText)findViewById(R.id.quantityMacchiato);
        final EditText jml_Cappuccino = (EditText)findViewById(R.id.quantityCappuccino);
        final EditText jml_Latte = (EditText)findViewById(R.id.quantityLatte);
        final EditText jml_Americano = (EditText)findViewById(R.id.quantityAmericano);
        final EditText jml_CafeMocha = (EditText)findViewById(R.id.quantityCafeMocha);
        final EditText jml_Freddo = (EditText)findViewById(R.id.quantityFreddo);
        final EditText jml_Hag = (EditText)findViewById(R.id.quantityHag);
        final EditText jml_Marocchino = (EditText)findViewById(R.id.quantityMarocchino);
        final EditText jml_Granitta = (EditText)findViewById(R.id.quantityGranitta);

        final EditText nama = (EditText)findViewById(R.id.nama);
        final EditText meja = (EditText)findViewById(R.id.meja);

        final int harga_original = 5000;
        final int harga_Espresso = 10000;
        final int harga_FlatWhite = 15000;
        final int harga_Liqueur = 25000;
        final int harga_Macchiato = 23000;
        final int harga_Cappuccino = 27000;
        final int harga_Latte = 18000;
        final int harga_Americano = 35000;
        final int harga_CaféMocha = 20000;
        final int harga_Freddo = 30000;
        final int harga_Hag = 17000;
        final int harga_Marocchino = 13000;
        final int harga_Granitta = 26000;

        Button pesan = (Button)findViewById(R.id.pesan);

        final Intent intent = getIntent();

        if (!intent.getStringExtra("isnew").equals("new")){
            isDataIntentAvailable = true;
            nama.setText(intent.getStringExtra("nama"));
            meja.setText(intent.getStringExtra("meja"));
        }else{
            isDataIntentAvailable = false;
        }

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String summOrder = "";
                int totOlder = 0;
                if (original.isChecked()){
                    String txt = "- coffe original";
                    int jml =Integer.parseInt(String.valueOf(jml_original.getText()));
                    int calc = jml*harga_original;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (Espresso.isChecked()){
                    String txt = "- coffe Espresso";
                    int jml =Integer.parseInt(String.valueOf(jml_Espresso.getText()));
                    int calc = jml*harga_Espresso;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (FlatWhite.isChecked()){
                    String txt = "- coffe Flat White";
                    int jml =Integer.parseInt(String.valueOf(jml_FlatWhite.getText()));
                    int calc = jml*harga_FlatWhite;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (Liqueur.isChecked()){
                    String txt = "- coffe Liqueur Coffee";
                    int jml =Integer.parseInt(String.valueOf(jml_Liqueur.getText()));
                    int calc = jml*harga_Liqueur;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (Macchiato.isChecked()){
                    String txt = "- coffe Macchiato";
                    int jml =Integer.parseInt(String.valueOf(jml_Macchiato.getText()));
                    int calc = jml*harga_Macchiato;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (Cappuccino.isChecked()){
                    String txt = "- coffe Cappuccino";
                    int jml =Integer.parseInt(String.valueOf(jml_Cappuccino.getText()));
                    int calc = jml*harga_Cappuccino;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (Latte.isChecked()){
                    String txt = "- coffe Latte";
                    int jml =Integer.parseInt(String.valueOf(jml_Latte.getText()));
                    int calc = jml*harga_Latte;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (Americano.isChecked()){
                    String txt = "- coffe Americano";
                    int jml =Integer.parseInt(String.valueOf(jml_Americano.getText()));
                    int calc = jml*harga_Americano;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (CafeMocha.isChecked()){
                    String txt = "- coffe Café Mocha";
                    int jml =Integer.parseInt(String.valueOf(jml_CafeMocha.getText()));
                    int calc = jml*harga_CaféMocha;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (Freddo.isChecked()){
                    String txt = "- coffe Freddo";
                    int jml =Integer.parseInt(String.valueOf(jml_Freddo.getText()));
                    int calc = jml*harga_Freddo;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (Hag.isChecked()){
                    String txt = "- coffe Hag";
                    int jml =Integer.parseInt(String.valueOf(jml_Hag.getText()));
                    int calc = jml*harga_Hag;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (Marocchino.isChecked()){
                    String txt = "- coffe Marocchino";
                    int jml =Integer.parseInt(String.valueOf(jml_Marocchino.getText()));
                    int calc = jml*harga_Marocchino;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }
                if (Granitta.isChecked()){
                    String txt = "- coffe Granitta";
                    int jml =Integer.parseInt(String.valueOf(jml_Granitta.getText()));
                    int calc = jml*harga_Granitta;
                    summOrder += txt+" "+jml+"\n";
                    totOlder +=calc;
                }

                if(isDataIntentAvailable){
//                    if (intent.getStringExtra("summaryOrder").equals(null) || intent.getStringExtra("summaryOrder") == null)
                        summOrder += intent.getStringExtra("summaryOrder");
//                    if (intent.getStringExtra("totalOrder").equals(null) || intent.getStringExtra("totalOrder") == null)
                        totOlder += Integer.parseInt(intent.getStringExtra("totalOrder"));
                }
                

                Intent myIntent = new Intent(HalamanUtama.this,struk.class);
                myIntent.putExtra("summaryOrder",summOrder);
                myIntent.putExtra("totalOrder",totOlder);
                myIntent.putExtra("nama", nama.getText().toString());
                myIntent.putExtra("meja", meja.getText().toString());
                myIntent.putExtra("type","minuman");
                startActivity(myIntent);
            }
        });






    }
}
