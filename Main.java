package com.company;

public class Main {

    public static void main(String[] args) {
        Estante minhaEstante = new Estante();

        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "JK Rowling",
                500, "Rocco", 2022, 9.0);
        minhaEstante.adicionarLeitura(livro1);

        Livro livro2 = new Livro("Harry Potter e a Câmara Secreta", "JK Rowling",
                400, "Rocco", 2021, 8.5);
        minhaEstante.adicionarLeitura(livro2);

        Livro resultado = minhaEstante.procurarLivro("Harry Potter e a Pedra Filosofal");
        System.out.println(resultado.anoLeitura);
    }
}
