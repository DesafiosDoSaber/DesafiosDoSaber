package com.example.desafiosdosaber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TelaJogos extends AppCompatActivity {

    private String nomeUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogos);

        nomeUsuario = getIntent().getStringExtra("NOME_USUARIO");

    }

    public void irTelaQuiz (View view){
        Intent intent = new Intent(TelaJogos.this, EscolhaMateria.class);
        intent.putExtra("NOME_USUARIO", nomeUsuario);
        startActivity(intent);
    }

    public void irTelaJogoDaVelha (View view){
        Intent intent = new Intent(TelaJogos.this, TelaJogadores.class);
        intent.putExtra("NOME_USUARIO", nomeUsuario);
        startActivity(intent);
    }
}