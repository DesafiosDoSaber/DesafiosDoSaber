package com.example.desafiosdosaber;

public class Pergunta {
    private String textoPergunta;
    private String[] opcoes;
    private int indiceCorreto;
    private int novaPosicaoCorreta;

    public Pergunta(String textoPergunta, String[] opcoes, int indiceCorreto) {
        this.textoPergunta = textoPergunta;
        this.opcoes = opcoes;
        this.indiceCorreto = indiceCorreto;
    }

    public String getTextoPergunta() {
        return textoPergunta;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public int getIndiceCorreto() {
        return indiceCorreto;
    }

    public int getNovaPosicaoCorreta() {
        return novaPosicaoCorreta;
    }

    public void setNovaPosicaoCorreta(int novaPosicaoCorreta) {
        this.novaPosicaoCorreta = novaPosicaoCorreta;
    }
}


