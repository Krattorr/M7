package com.example.primeraaplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Tecnologia1 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tecnologia1);
        Button CharlesBabbage = findViewById(R.id.bottoncorrecto);
        Button BillGates = findViewById(R.id.botton2);
        Button SteveJobs = findViewById(R.id.botton3);
        TextView pregunta = findViewById(R.id.textView);
        Button siguiente = findViewById(R.id.next);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Tecnologia2.class);
                startActivity(i);
            }
        });

        CharlesBabbage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.acierto ++;
                System.out.println (Juego.acierto);
            }
        });
        BillGates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.fallido ++;
                System.out.println (Juego.fallido);
            }
        });
        SteveJobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Juego.fallido ++;
                System.out.println (Juego.fallido);
            }
        });
    }
}