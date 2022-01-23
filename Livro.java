package com.company;

public class Livro {
    String titulo;
    String autor;
    int paginas;
    String editora;
    int anoLeitura;
    double nota;

    public Livro(String titulo, String autor, int paginas, String editora, int anoLeitura, double nota) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.editora = editora;
        this.anoLeitura = anoLeitura;
        this.nota = nota;
    }
}