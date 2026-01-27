package main.java.com.bruno.cursojava.exercicio24;

import java.util.Date;

public class Exec04 {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.nome = "Livro de São Cipriano";
        livro.autor = "São Cipriano";
        livro.anoLancamento = 2026;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoLivro = "Bruno Almeida";

        System.out.println(livro.emprestadoLivro + " pegou o livro: " + livro.nome );
    }
}
