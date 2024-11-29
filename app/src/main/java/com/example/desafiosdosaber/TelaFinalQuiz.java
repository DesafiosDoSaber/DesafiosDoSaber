package com.example.desafiosdosaber;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaFinalQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_final_quiz);

        TextView textoParabens = findViewById(R.id.textoParabens);
        TextView textoPontuacao = findViewById(R.id.textoPontuacao);
        Button botaoJogarNovamente = findViewById(R.id.botaoJogarNovamente);
        Button botaoSair = findViewById(R.id.botaoSair);

        int pontuacaoFinal = getIntent().getIntExtra("PONTUACAO", 0);
        int totalPerguntas = 12;
        int porcentagemAcertos = (int) ((pontuacaoFinal / (double) totalPerguntas) * 100);

        String nomeUsuario = getIntent().getStringExtra("NOME_USUARIO");

        textoPontuacao.setText(pontuacaoFinal + "/" + totalPerguntas);

        textoParabens.setText("Parabéns " +nomeUsuario+ " você acertou " + porcentagemAcertos + "%");

        botaoJogarNovamente.setOnClickListener(v -> {
            Intent intent = new Intent(TelaFinalQuiz.this, EscolhaMateria.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });

        botaoSair.setOnClickListener(v -> {
            Intent intent = new Intent(TelaFinalQuiz.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }
}