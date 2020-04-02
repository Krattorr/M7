package com.example.Trivial;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Estadisticas extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estadisticas);
        TextView fallos = findViewById(R.id.fallos);
        TextView aciertos = findViewById(R.id.aciertos);
        fallos.setText(String.valueOf(Juego.fallido));
        aciertos.setText(String.valueOf(Juego.acierto));
    }
}