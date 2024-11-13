package com.google.fisioterapiaonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inicio_del_usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_del_usuario);
    }
    public void Pantalla_Informacion(View view) {

        Intent a = new Intent(this, Informacion.class);

        startActivity(a);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void Pantalla_Nuestro_servicio(View view) {

        Intent a = new Intent(this, Nuestros_servicios.class);

        startActivity(a);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
    public void Pantalla_Citas(View view) {

        Intent a = new Intent(this, Citas.class);

        startActivity(a);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void Pantalla_Detalles(View view) {

        Intent a = new Intent(this, Detalles.class);

        startActivity(a);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void Pantalla_recor_citas(View view) {

        Intent a = new Intent(this, Recordatorio_citas.class);

        startActivity(a);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void Pantalla_videollamada(View view) {

        Intent a = new Intent(this, Videollamada.class);

        startActivity(a);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

}