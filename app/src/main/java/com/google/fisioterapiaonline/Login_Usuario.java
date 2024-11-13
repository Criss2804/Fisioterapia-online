package com.google.fisioterapiaonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_usuario);
    }
    public void Pantalla_login_Regis(View view) {

        Intent a = new Intent(this, Registro_usuario.class);

        startActivity(a);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void Pantalla_inicio_usu(View view) {

        Intent a = new Intent(this, Inicio_del_usuario.class);

        startActivity(a);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}