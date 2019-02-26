package com.example.projek2kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Penjumlahan extends AppCompatActivity {

    private EditText etAngka1,etAngka2;
    private Button btnJumlah;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjumlahan);

        etAngka1 = findViewById(R.id.et_angka1);
        etAngka2 = findViewById(R.id.et_angka2);
        btnJumlah = findViewById(R.id.btn_jumlah);
        tvHasil = findViewById(R.id.tv_hasiljumlah);

        btnJumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka1 = etAngka1.getText().toString();
                    String sAngka2 = etAngka2.getText().toString();

                    double angka1 = Double.parseDouble(sAngka1);
                    double angka2 = Double.parseDouble(sAngka2);

                    double hasil = angka1+angka2;

                    String shasil = String.valueOf(hasil);
                    tvHasil.setText(shasil);

                }
                catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Data tidak boleh kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });







    }
}
