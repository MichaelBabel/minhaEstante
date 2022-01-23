package com.company;

public class Estante {
    static Livro [] leituras;
    static int contagemLeituras;

    Estante() {
        this.contagemLeituras = 0;
        this.leituras = new Livro[500];
    }

    static void adicionarLeitura(Livro livro) {
        leituras[contagemLeituras] = livro;
        contagemLeituras++;
    }

    Livro procurarLivro(String nomeLivro) {
        for(int i = 0; i < contagemLeituras; i++) {
            if(leituras[i].titulo.equals(nomeLivro)) {
                return leituras[i];
            }
        }
        return null;
    }
}
