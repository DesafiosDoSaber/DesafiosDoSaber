package com.example.desafiosdosaber;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaJogadores extends AppCompatActivity {

    private EditText campoSegundoJogador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogadores);

        String nomeUsuario = getIntent().getStringExtra("NOME_USUARIO");

        TextView campoPrimeiroJogador = findViewById(R.id.campoPrimeiroJogador);
        campoPrimeiroJogador.setText(nomeUsuario);
        campoSegundoJogador = findViewById(R.id.campoSegundoJogador);
        Button botaoComecarAJogar = findViewById(R.id.botaoComecarAJogar);

        botaoComecarAJogar.setOnClickListener(v -> {
            String nomeSegundoJogador = campoSegundoJogador.getText().toString().trim();
            if(!nomeSegundoJogador.isEmpty()) {
                Intent intent = new Intent(this, TelaJogoDaVelha.class);
                intent.putExtra("NOME_USUARIO", nomeUsuario);
                intent.putExtra("NOME_SEGUNDOUSUARIO", nomeSegundoJogador);
                startActivity(intent);
                finish();
            } else {
                campoSegundoJogador.setError("Por favor, insira seu nome");
            }
        });

    }
}