package com.example.desafiosdosaber;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EscolhaMateria extends AppCompatActivity {

    private String nomeUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_materia);

        nomeUsuario = getIntent().getStringExtra("NOME_USUARIO");

        Button botaoConhecimentoGerais = findViewById(R.id.botaoConhecimentoGerais);
        botaoConhecimentoGerais.setOnClickListener(v -> abrirDificuldade("Conhecimentos Gerais"));

        Button botaoArteCultura = findViewById(R.id.botaoArteCultura);
        botaoArteCultura.setOnClickListener(v -> abrirDificuldade("Arte e Cultura"));

        Button botaoEsportes = findViewById(R.id.botaoEsportes);
        botaoEsportes.setOnClickListener(v -> abrirDificuldade("Esportes"));

        Button botaoTecnologia = findViewById(R.id.botaoTecnologia);
        botaoTecnologia.setOnClickListener(v -> abrirDificuldade("Tecnologia"));
    }

    private void abrirDificuldade(String areaEstudo) {
        Intent intent = new Intent(this, TelaDificuldade.class);
        intent.putExtra("AREA_ESTUDO", areaEstudo);
        intent.putExtra("NOME_USUARIO", nomeUsuario);
        startActivity(intent);
    }
}