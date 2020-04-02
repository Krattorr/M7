package com.example.Trivial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Juego extends AppCompatActivity {


    public static int fallido =0;

    public static int acierto =0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juego);
        Button g = findViewById(R.id.literatura);
        Button dibujo = findViewById(R.id.dibujo);
        Button tecnologia = findViewById(R.id.tecnologia);
        Button deporte = findViewById(R.id.deporte);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Literatura.class);
                startActivity(i);
            }
        });

        dibujo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Arte1.class);
                startActivity(i);
            }
        });

        tecnologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Tecnologia1.class);
                startActivity(i);
            }
        });
        deporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Deportes1.class);
                startActivity(i);
            }
        });

    }
}
