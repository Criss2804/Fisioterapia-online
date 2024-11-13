package com.google.fisioterapiaonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registro_usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);
    }
    public void Pantalla_login_Regis(View view) {

        Intent a = new Intent(this, Login_Usuario.class);

        startActivity(a);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}