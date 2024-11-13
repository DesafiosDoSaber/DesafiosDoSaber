package com.example.desafiosdosaber;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Collections;
import java.util.List;

import java.util.ArrayList;

public class TelaQuiz extends AppCompatActivity {
    private DatabaseHelper dbHelper;
    private List<Pergunta> perguntas;
    private int perguntaAtual = 0;
    private TextView textPergunta;
    private TextView textoContadorPergunta;
    private RadioGroup opcoesGrupo;
    private RadioButton[] opcoes = new RadioButton[4];
    private Button botaoProxima;
    private int pontuacao = 0;
    private String nomeUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_quiz);

        nomeUsuario = getIntent().getStringExtra("NOME_USUARIO");

        textPergunta = findViewById(R.id.textoPergunta);
        textoContadorPergunta = findViewById(R.id.textoContadorPergunta);
        opcoesGrupo = findViewById(R.id.opcoesGrupo);
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

        opcoesGrupo.setOnCheckedChangeListener((group, checkedId) -> botaoProxima.setEnabled(true));

        botaoProxima.setOnClickListener(v -> {
            verificarResposta();
            perguntaAtual++;
            if (perguntaAtual < perguntas.size()) {
                mostrarPergunta();
            } else {
                finalizarQuiz();
            }
        });
    }

    private void mostrarPergunta() {
        opcoesGrupo.clearCheck();
        botaoProxima.setEnabled(false);

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

    private void verificarResposta() {
        int respostaSelecionada = opcoesGrupo.indexOfChild(findViewById(opcoesGrupo.getCheckedRadioButtonId()));

        Pergunta perguntaAtualObj = perguntas.get(perguntaAtual);
        int corretaIndex = perguntaAtualObj.getNovaPosicaoCorreta();

        if (respostaSelecionada == corretaIndex) {
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
