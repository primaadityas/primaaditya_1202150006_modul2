package com.example.prima.primaaditya_1202150006_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {
    RadioGroup ragr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        ragr = findViewById(R.id.ragr);
    }

    public void masukmenu(View view) {
        int id = ragr.getCheckedRadioButtonId();
        RadioButton rb = findViewById(id);
        String pilih = rb.getText().toString();
        switch (pilih) {
            case "Take Away":
                startActivity(new Intent(MenuUtama.this, TakeAway.class));
                Toast.makeText(MenuUtama.this, "Take Away", Toast.LENGTH_SHORT).show();
                break;
            case "Dine In":
                startActivity(new Intent(MenuUtama.this, DineIn.class));
                Toast.makeText(MenuUtama.this, "Dine In", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}