package main.hari1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import static main.hari1.R.layout.halaman2;

public class menu extends AppCompatActivity{

    ImageButton satu, dua, tiga, empat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman2);

        satu = (ImageButton) findViewById(R.id.bkamera);
        dua = (ImageButton) findViewById(R.id.bbelanja);
        tiga = (ImageButton) findViewById(R.id.bcari);
        empat = (ImageButton) findViewById(R.id.bjam);

        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent balik = new Intent(menu.this,Fotomain.class);
                startActivity(balik);
            }
        });
        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent balik = new Intent(menu.this,BelanjaMain.class);
                startActivity(balik);
            }
        });
        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent balik = new Intent(menu.this,Homepage.class);
                startActivity(balik);
            }
        });
        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent balik = new Intent(menu.this,Jammain.class);
                startActivity(balik);
            }
        });
    }
}