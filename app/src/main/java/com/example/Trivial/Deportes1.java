package com.example.Trivial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Deportes1 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deportes1);
        Button messi = findViewById(R.id.botoncorrecto);
        Button Juaquin = findViewById(R.id.botton2);
        Button Ronaldo = findViewById(R.id.botton3);
        TextView pregunta = findViewById(R.id.text);
        Button siguiente = findViewById(R.id.exit);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Deportes2.class);
                startActivity(i);
            }
        });

        messi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.acierto ++;
                System.out.println (Juego.acierto);
            }
        });

        Juaquin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.fallido ++;
                System.out.println (Juego.fallido);
            }
        });

        Ronaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.fallido ++;
                System.out.println (Juego.fallido);
            }
        });

    }
}

