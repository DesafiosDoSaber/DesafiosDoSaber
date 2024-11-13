package com.example.desafiosdosaber;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TelaDificuldade extends AppCompatActivity {

    private String nomeUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dificuldade);

        nomeUsuario = getIntent().getStringExtra("NOME_USUARIO");

        String areaEstudo = getIntent().getStringExtra("AREA_ESTUDO");

        Button botaoFacil = findViewById(R.id.botaoFacil);
        botaoFacil.setOnClickListener(v -> iniciarQuiz(areaEstudo, "Fácil"));

        Button botaoMedio = findViewById(R.id.botaoMedio);
        botaoMedio.setOnClickListener(v -> iniciarQuiz(areaEstudo, "Médio"));

        Button botaoDificil = findViewById(R.id.botaoDificil);
        botaoDificil.setOnClickListener(v -> iniciarQuiz(areaEstudo, "Difícil"));
    }

    private void iniciarQuiz(String areaEstudo, String dificuldade) {
        Intent intent = new Intent(this, TelaQuiz.class);
        intent.putExtra("AREA_ESTUDO", areaEstudo);
        intent.putExtra("DIFICULDADE", dificuldade);
        intent.putExtra("NOME_USUARIO", nomeUsuario);
        startActivity(intent);
    }
}