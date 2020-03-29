package com.example.primeraaplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Literatura extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.literatura);
        Button Homero = findViewById(R.id.respuesta1correcta);
        Button Seneca = findViewById(R.id.respuesta2);
        Button Herodoto = findViewById(R.id.respuesta3);
        TextView pregunta = findViewById(R.id.pregunta1);
        Button siguiente = findViewById(R.id.next);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Literatura2.class);
                startActivity(i);
            }
        });
        Homero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.acierto ++;
                System.out.println (Juego.acierto);
            }
        });
        Seneca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.fallido ++;
                System.out.println (Juego.fallido);
            }
        });
        Herodoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.fallido ++;
                System.out.println (Juego.fallido);
            }
        });
    }
}
