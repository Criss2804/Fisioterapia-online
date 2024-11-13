package com.google.fisioterapiaonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Recordatorio_medico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recordatorio_medico);
    }
    public void Pantalla_recor_citas(View view) {

        Intent a = new Intent(this, Inicio_medico.class);

        startActivity(a);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}