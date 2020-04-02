package com.example.Trivial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button jugar = findViewById(R.id.jugar);
        Button estadisticas = findViewById(R.id.estadisticas);
        Button AÑADIRPREGUNTA = findViewById(R.id.añadirpregunta);
        Button AYUDA = findViewById(R.id.ayuda);
        AYUDA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Ayuda.class);
                startActivity(i);
            }
        });

        AÑADIRPREGUNTA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Añadirpregunta.class);
                startActivity(i);
            }
        });

        estadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Estadisticas.class);
                startActivity(i);
            }
        });

        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Juego.class);
                startActivity(i);
            }
        });

    }

}

