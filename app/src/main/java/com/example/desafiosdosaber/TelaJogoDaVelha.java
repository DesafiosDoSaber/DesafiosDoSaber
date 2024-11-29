package com.example.desafiosdosaber;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.Collections;
import android.util.Log;


public class TelaJogoDaVelha extends AppCompatActivity {
    private boolean jogador1Ativo = true;
    private boolean podeJogar = false;
    private String[][] tabuleiro = new String[3][3];
    private Button[][] botoes = new Button[3][3];
    private TextView textoPerguntaQuizJogoDaVelha, indicadorJogador1, indicadorJogador2;
    private Button botaoVerdadeiro, botaoFalso;
    private String respostaCorreta;
    private String[] perguntas = {
            "A construção da Torre Eiffel foi concluída em 31 de março de 1890;FALSO",
            "A água ferve a 100°C no nível do mar;VERDADEIRO",
            "O sol é uma estrela anã vermelha;FALSO",
            "Python é uma linguagem de programação;VERDADEIRO"
    };

    private final Handler handler = new Handler();

    private String nomeJogador1;
    private String nomeJogador2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogo_da_velha);

        nomeJogador1 = getIntent().getStringExtra("NOME_USUARIO");
        nomeJogador2 = getIntent().getStringExtra("NOME_SEGUNDOUSUARIO");

        indicadorJogador1 = findViewById(R.id.campoPrimeiroJogador);
        indicadorJogador2 = findViewById(R.id.campoSegundoJogador);
        indicadorJogador1.setText(nomeJogador1);
        indicadorJogador2.setText(nomeJogador2);

        textoPerguntaQuizJogoDaVelha = findViewById(R.id.textoPerguntaQuizJogoDaVelha);
        botaoVerdadeiro = findViewById(R.id.botaoVerdadeiro);
        botaoFalso = findViewById(R.id.botaoFalso);

        GridLayout gridTabuleiro = findViewById(R.id.gridJogoVelha);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button botao = (Button) gridTabuleiro.getChildAt(i * 3 + j);
                botoes[i][j] = botao;
                int finalI = i;
                int finalJ = j;

                botao.setOnClickListener(v -> {
                    if (!podeJogar) {
                        Toast.makeText(this, "Responda a pergunta para jogar!", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (botao.getText().toString().isEmpty()) {
                        botao.setText(jogador1Ativo ? "O" : "X");
                        tabuleiro[finalI][finalJ] = jogador1Ativo ? "O" : "X";
                        podeJogar = false;

                        if (verificarVitoria()) {
                            abrirTelaResultado(jogador1Ativo ? "Jogador 1" : "Jogador 2");
                        } else {
                            jogador1Ativo = !jogador1Ativo;
                            atualizarIndicadorJogador();
                            gerarPergunta();
                        }
                    }
                });
            }
        }

        botaoVerdadeiro.setOnClickListener(v -> verificarResposta(botaoVerdadeiro, "VERDADEIRO"));
        botaoFalso.setOnClickListener(v -> verificarResposta(botaoFalso, "FALSO"));

        reiniciarJogo();
    }

    private void atualizarIndicadorJogador() {
        if (jogador1Ativo) {
            indicadorJogador1.setBackgroundResource(R.drawable.bg_jogador_selecionado);
            indicadorJogador2.setBackgroundResource(R.drawable.bg_jogador_deselecionado);
        } else {
            indicadorJogador2.setBackgroundResource(R.drawable.bg_jogador_selecionado);
            indicadorJogador1.setBackgroundResource(R.drawable.bg_jogador_deselecionado);
        }
    }

    private void gerarPergunta() {
        Collections.shuffle(Arrays.asList(perguntas));
        String[] perguntaEscolhida = perguntas[0].split(";");
        textoPerguntaQuizJogoDaVelha.setText(perguntaEscolhida[0]);
        respostaCorreta = perguntaEscolhida[1];
        habilitarTabuleiro(false);
    }

    private void verificarResposta(Button botaoSelecionado, String respostaUsuario) {
        if (respostaUsuario.equals(respostaCorreta)) {
            botaoSelecionado.setBackgroundResource(R.drawable.botao_quiz_correto);
            podeJogar = true;
            habilitarTabuleiro(true);

            handler.postDelayed(() -> {
                botaoSelecionado.setBackgroundResource(R.drawable.botao_quiz);
            }, 2000);
        } else {
            botaoSelecionado.setBackgroundResource(R.drawable.botao_quiz_errado);

            handler.postDelayed(() -> {
                botaoSelecionado.setBackgroundResource(R.drawable.botao_quiz);
                jogador1Ativo = !jogador1Ativo;
                atualizarIndicadorJogador();
                gerarPergunta();
            }, 2000);
        }
    }

    private void habilitarTabuleiro(boolean habilitar) {
        for (Button[] linha : botoes) {
            for (Button botao : linha) {
                botao.setEnabled(habilitar && botao.getText().toString().isEmpty());
            }
        }
    }

    private boolean verificarVitoria() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] != null && tabuleiro[i][0].equals(tabuleiro[i][1]) && tabuleiro[i][0].equals(tabuleiro[i][2])) {
                return true;
            }
            if (tabuleiro[0][i] != null && tabuleiro[0][i].equals(tabuleiro[1][i]) && tabuleiro[0][i].equals(tabuleiro[2][i])) {
                return true;
            }
        }
        if (tabuleiro[0][0] != null && tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[0][0].equals(tabuleiro[2][2])) {
            return true;
        }
        if (tabuleiro[0][2] != null && tabuleiro[0][2].equals(tabuleiro[1][1]) && tabuleiro[0][2].equals(tabuleiro[2][0])) {
            return true;
        }

        boolean velha = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == null) {
                    velha = false;
                    break;
                }
            }
        }

        if (velha) {
            Toast.makeText(this, "Empate! Reiniciando o jogo.", Toast.LENGTH_SHORT).show();
            reiniciarJogo();
        }

        return false;
    }

    private void abrirTelaResultado(String vencedor) {
        Intent intent = new Intent(this, TelaFinalJogoDaVelha.class);

        if(vencedor.equals("Jogador 1")) {
            intent.putExtra("VENCEDOR", nomeJogador1);
            intent.putExtra("NOME_USUARIO", nomeJogador1);
        } else if (vencedor.equals("Jogador 2")){
            intent.putExtra("VENCEDOR", nomeJogador2);
            intent.putExtra("NOME_USUARIO", nomeJogador1);
        }

        startActivity(intent);
        finish();
    }

    private void reiniciarJogo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = null;
                botoes[i][j].setText("");
                botoes[i][j].setEnabled(false);
            }
        }
        jogador1Ativo = true;
        podeJogar = false;
        atualizarIndicadorJogador();
        gerarPergunta();
    }
}
