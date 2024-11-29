package com.example.desafiosdosaber;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaFinalJogoDaVelha extends AppCompatActivity {

    private TextView textoVencedorJogoDaVelha;
    private String vencedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TelaFinalJogoDaVelha", "Tela final inicializada");
        setContentView(R.layout.activity_tela_final_jogo_da_velha);

        String nomeUsuario = getIntent().getStringExtra("NOME_USUARIO");

        Button botaoJogarNovamenteJogo = findViewById(R.id.botaoJogarNovamenteJogo);
        Button botaoSairJogo = findViewById(R.id.botaoSairJogo);

        Log.d("TelaFinal", "Vencedor: " + vencedor);

        String vencedor = getIntent().getStringExtra("VENCEDOR");

        if (vencedor != null) {
            Log.d("TelaFinalJogoDaVelha", "Vencedor recebido: " + vencedor);
        } else {
            Log.d("TelaFinalJogoDaVelha", "Nenhum vencedor recebido");
        }

        textoVencedorJogoDaVelha = findViewById(R.id.textoVencedorJogoDaVelha);
        textoVencedorJogoDaVelha.setText(vencedor);

        botaoJogarNovamenteJogo.setOnClickListener(v -> {
            Intent intent = new Intent(this, TelaJogadores.class);
            intent.putExtra("NOME_USUARIO", nomeUsuario);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });

        botaoSairJogo.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }
}