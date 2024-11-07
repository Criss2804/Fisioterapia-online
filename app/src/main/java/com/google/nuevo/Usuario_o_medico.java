package com.google.nuevo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Usuario_o_medico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_omedico);
    }
    public void Ir_Pan_usuario(View view){

        Intent a = new Intent(this,login.class);

        startActivity(a);

    }
    public void Ir_Pan_medico(View view){

        Intent a = new Intent(this,Login_medico.class);

        startActivity(a);

    }
}