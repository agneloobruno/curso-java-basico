package main.java.com.bruno.cursojava.exercicio24;

import java.util.Date;

public class Exerc02 {

    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "Titulo Livro";
        livro.autor = "Autor Livro";
        livro.dataPublicacao = new Date().getDate();
        livro.edicao = 1;
        livro.idioma = "Idioma Livro";
        livro.numeroPaginas = 2;

    }
}
