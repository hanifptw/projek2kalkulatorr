package com.example.projek2kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPenjumlahan,btnPenguranagan,btnPerkalian,btnPembagian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPenjumlahan = findViewById(R.id.btn_penjumlahan);
        btnPenguranagan = findViewById(R.id.btn_pengurangan);
        btnPerkalian = findViewById(R.id.btn_perkalian);
        btnPembagian = findViewById(R.id.btn_pembagian);

        btnPenjumlahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this,Penjumlahan.class);
                startActivity(moveIntent);
            }
        });

        btnPenguranagan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this,Pengurangan.class);
                startActivity(moveIntent);
            }
        });

        btnPerkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this,Perkalian.class);
                startActivity(moveIntent);
            }
        });

        btnPembagian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this,Pembagian.class);
                startActivity(moveIntent);
            }
        });





    }
}
