package com.example.projek2kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pengurangan extends AppCompatActivity {
    private EditText etAngka1,etAngka2;
    private Button btnKurang;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengurangan);

        etAngka1 = findViewById(R.id.et_angka1);
        etAngka2 = findViewById(R.id.et_angka2);
        btnKurang = findViewById(R.id.btn_kurang);
        tvHasil = findViewById(R.id.tv_hasilkurang);

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAngka1 = etAngka1.getText().toString();
                    String sAngka2 = etAngka2.getText().toString();

                    double angka1 = Double.parseDouble(sAngka1);
                    double angka2 = Double.parseDouble(sAngka2);

                    double hasil = angka1-angka2;

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
