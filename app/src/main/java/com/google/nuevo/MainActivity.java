package com.google.nuevo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        View princi;
        Animation animacion2 = AnimationUtils.loadAnimation(this,R.anim.animacion_arriba);
        Animation animacion1 = AnimationUtils.loadAnimation(this,R.anim.animacion_abajo);

        TextView textinicio = findViewById(R.id.textinicio);
        ImageView image1 = findViewById(R.id.image1);

        image1.setAnimation(animacion2);
        textinicio.setAnimation(animacion1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(MainActivity.this,Usuario_o_medico.class);
                startActivity(intent);

                finish();

            }
        },4000);
    }
}