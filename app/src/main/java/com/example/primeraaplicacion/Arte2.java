package com.example.primeraaplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Arte2 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arte2);
        Button Louvre = findViewById(R.id.respuesta1correcta);
        Button MueseodelPrado = findViewById(R.id.respuesta2);
        Button BritishMuseum = findViewById(R.id.respuesta3);
        TextView pregunta = findViewById(R.id.pregunta);
        Button finalizar = findViewById(R.id.fin);
        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Juego.class);
                startActivity(i);
            }
        });
        Louvre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.acierto ++;
                System.out.println (Juego.acierto);
            }
        });
        MueseodelPrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.fallido ++;
                System.out.println (Juego.fallido);
            }
        });
        BritishMuseum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.fallido ++;
                System.out.println (Juego.fallido);
            }
        });

    }
}
