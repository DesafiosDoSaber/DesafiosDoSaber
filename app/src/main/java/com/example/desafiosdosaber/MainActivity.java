package com.example.desafiosdosaber;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText campoNomePrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNomePrincipal = findViewById(R.id.campoNomePrincipal);
        Button botaoIniciar = findViewById(R.id.botaoIniciar);

        botaoIniciar.setOnClickListener(v -> {
           String nome = campoNomePrincipal.getText().toString().trim();
           if(!nome.isEmpty()) {
               Intent intent = new Intent(this, TelaJogos.class);
               intent.putExtra("NOME_USUARIO", nome);
               startActivity(intent);
               finish();
           } else {
               campoNomePrincipal.setError("Por favor, insira seu nome");
           }
        });

    }

}