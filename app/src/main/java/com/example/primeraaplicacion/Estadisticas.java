package com.example.primeraaplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
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