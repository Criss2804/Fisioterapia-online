package com.google.nuevo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
    }


    public void Ir_Pan_registro(View view) {

        Intent a = new Intent(this, Pan_registrarse.class);

        startActivity(a);

    }

    public void Ir_ini_usuario(View view) {

        Intent a = new Intent(this, Inicio_usuario.class);

        startActivity(a);

    }
}