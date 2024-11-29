package com.example.desafiosdosaber;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TelaQuiz extends AppCompatActivity {
    private DatabaseHelper dbHelper;
    private List<Pergunta> perguntas;
    private int perguntaAtual = 0;
    private TextView textPergunta;
    private TextView textoContadorPergunta;
    private Button[] opcoes = new Button[4];
    private Button botaoProxima;
    private int pontuacao = 0;
    private String nomeUsuario;
    private int opcaoSelecionada = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_quiz);

        nomeUsuario = getIntent().getStringExtra("NOME_USUARIO");

        textPergunta = findViewById(R.id.textoPergunta);
        textoContadorPergunta = findViewById(R.id.textoContadorPergunta);
        opcoes[0] = findViewById(R.id.opcao1);
        opcoes[1] = findViewById(R.id.opcao2);
        opcoes[2] = findViewById(R.id.opcao3);
        opcoes[3] = findViewById(R.id.opcao4);
        botaoProxima = findViewById(R.id.botaoProxima);

        dbHelper = new DatabaseHelper(this);

        String areaEstudo = getIntent().getStringExtra("AREA_ESTUDO");
        String dificuldade = getIntent().getStringExtra("DIFICULDADE");

        perguntas = dbHelper.obterPerguntas(areaEstudo, dificuldade);

        Collections.shuffle(perguntas);

        mostrarPergunta();

        for (int i = 0; i < opcoes.length; i++) {
            final int index = i;
            opcoes[i].setOnClickListener(v -> {
                if (opcaoSelecionada == -1) {
                    verificarResposta(index);
                }
            });
        }

        botaoProxima.setOnClickListener(v -> {
            perguntaAtual++;
            if (perguntaAtual < perguntas.size()) {
                mostrarPergunta();
            } else {
                finalizarQuiz();
            }
        });
    }

    private void mostrarPergunta() {
        opcaoSelecionada = -1;
        botaoProxima.setEnabled(false);

        for (Button botao : opcoes) {
            botao.setBackgroundResource(R.drawable.botao_quiz);
            botao.setEnabled(true);
        }

        Pergunta pergunta = perguntas.get(perguntaAtual);
        textPergunta.setText(pergunta.getTextoPergunta());

        List<String> alternativas = new ArrayList<>();
        Collections.addAll(alternativas, pergunta.getOpcoes());

        int indiceCorretoOriginal = pergunta.getIndiceCorreto();

        Collections.shuffle(alternativas);

        int novaPosicaoCorreta = alternativas.indexOf(pergunta.getOpcoes()[indiceCorretoOriginal]);

        for (int i = 0; i < 4; i++) {
            opcoes[i].setText(alternativas.get(i));
        }

        pergunta.setNovaPosicaoCorreta(novaPosicaoCorreta);

        textoContadorPergunta.setText((perguntaAtual + 1) + "/12");
    }

    private void verificarResposta(int indexSelecionado) {
        opcaoSelecionada = indexSelecionado;
        botaoProxima.setEnabled(true);

        Pergunta perguntaAtualObj = perguntas.get(perguntaAtual);
        int corretaIndex = perguntaAtualObj.getNovaPosicaoCorreta();

        for (int i = 0; i < opcoes.length; i++) {
            if (i == corretaIndex) {
                opcoes[i].setBackgroundResource(R.drawable.botao_quiz_correto);
            } else if (i == opcaoSelecionada) {
                opcoes[i].setBackgroundResource(R.drawable.botao_quiz_errado);
            }
            opcoes[i].setEnabled(false);
        }

        if (opcaoSelecionada == corretaIndex) {
            pontuacao++;
        }
    }

    private void finalizarQuiz() {
        Intent intent = new Intent(this, TelaFinalQuiz.class);
        intent.putExtra("PONTUACAO", pontuacao);
        intent.putExtra("NOME_USUARIO", nomeUsuario);
        startActivity(intent);
        finish();
    }
}
