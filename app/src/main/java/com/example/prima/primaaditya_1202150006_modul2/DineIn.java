package com.example.prima.primaaditya_1202150006_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;


public class DineIn extends AppCompatActivity {
    Spinner nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        setTitle("Dine In");
        nome = findViewById(R.id.nomeja);
    }

    public void liatmenu(View view) {
        Toast.makeText(DineIn.this, nome.getSelectedItem().toString() + " dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(DineIn.this, ListMenu.class));
        finish();
    }
}