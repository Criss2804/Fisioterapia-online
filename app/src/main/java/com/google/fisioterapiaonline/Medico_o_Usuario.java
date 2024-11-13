package com.google.fisioterapiaonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Medico_o_Usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medico_ousuario);
    }

    public void Pantalla_login_usuario(View view) {

        Intent a = new Intent(this, Login_Usuario.class);

        startActivity(a);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
    public void login_medico(View view){

        Intent a = new Intent(this,Login_medico.class);

        startActivity(a);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }
}