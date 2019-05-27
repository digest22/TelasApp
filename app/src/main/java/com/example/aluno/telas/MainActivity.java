package com.example.aluno.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button sobre;
    private Button lab1;
    private Button lab2;
    private ImageButton imgLab3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sobre = (Button) findViewById(R.id.btnSobre);
                sobre.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this, "Indo para outra tela!", Toast.LENGTH_SHORT).show();
                        //Comando para chamar outra tela
                        // o new Intent precisa de dois parâmetros: a tela atual.this e a tela que será chamada
                        startActivity( new Intent(MainActivity.this, SobreActivity.class));
                    }
                });

        lab1 = (Button) findViewById(R.id.btnLab1);
        lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Lab1Activity.class));
            }
        });

        lab2 = (Button) findViewById(R.id.btnLab2);
        lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Lab2Activity.class));
            }
        });

        imgLab3 = (ImageButton) findViewById(R.id.imgBtnLab3);
        imgLab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Lab3Activity.class));
            }
        });
    }
}
