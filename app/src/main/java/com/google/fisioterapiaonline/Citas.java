package com.google.fisioterapiaonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Citas extends AppCompatActivity {

    Spinner opciones_hora;
    Spinner opciones_terapia;
    Spinner modalidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citas);

        //spinner1
        opciones_terapia= findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter1= ArrayAdapter.createFromResource(this,
                R.array.terapia, android.R.layout.simple_spinner_item );

        opciones_terapia.setAdapter(adapter1);

        //spinner2
        opciones_hora= findViewById(R.id.spinner2);

        ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(this,
                R.array.horario, android.R.layout.simple_spinner_item );

        opciones_hora.setAdapter(adapter2);

        //spinner3
        opciones_hora= findViewById(R.id.spinner3);

        ArrayAdapter<CharSequence> adapter3= ArrayAdapter.createFromResource(this,
                R.array.medico, android.R.layout.simple_spinner_item );

        opciones_hora.setAdapter(adapter3);

        //spinner4
                opciones_hora= findViewById(R.id.spinner4);

        ArrayAdapter<CharSequence> adapter4= ArrayAdapter.createFromResource(this,
                R.array.modalidad, android.R.layout.simple_spinner_item );

        opciones_hora.setAdapter(adapter4);
    }

    public void login_medico(View view){

        Intent a = new Intent(this,Inicio_del_usuario.class);

        startActivity(a);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }


}