package com.example.primeraaplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Arte1 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arte1);
        Button dosmil = findViewById(R.id.respuesta1correcta);
        Button dosmiluno = findViewById(R.id.respuesta2);
        Button dosmilvitidos = findViewById(R.id.respuesta3);
        TextView pregunta = findViewById(R.id.pregunta);
        Button siguiente = findViewById(R.id.next);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Arte2.class);
                startActivity(i);
            }
        });
        dosmil.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Juego.acierto ++;
            System.out.println (Juego.acierto);
        }
    });
        dosmiluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.fallido ++;
                System.out.println (Juego.fallido);
            }
        });
        dosmilvitidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.fallido ++;
                System.out.println (Juego.fallido);
            }
        });
    }
}

