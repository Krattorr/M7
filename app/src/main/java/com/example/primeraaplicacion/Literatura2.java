package com.example.primeraaplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Literatura2 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.literatura2);
        Button SunTzu = findViewById(R.id.respuesta1correcta);
        Button Confucio = findViewById(R.id.respuesta2);
        Button ShiJing = findViewById(R.id.respuesta3);
        TextView pregunta = findViewById(R.id.text);
        Button finalizar = findViewById(R.id.exit);
        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Juego.class);
                startActivity(i);
            }
        });
        SunTzu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.acierto ++;
                System.out.println (Juego.acierto);
            }
        });
        Confucio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.fallido ++;
                System.out.println (Juego.fallido);
            }
        });
        ShiJing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.fallido ++;
                System.out.println (Juego.fallido);
            }
        });
    }
}