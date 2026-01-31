package main.java.com.bruno.cursojava.exercicio28a33;

import java.util.Scanner;

public class exer03 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.nome = "Gustavo";
        aluno.curso = "Ciência da Computação";
        aluno.matricula = "123";


        Scanner scan = new Scanner(System.in);

        aluno.lancarNotas(scan);
        aluno.exibirNotas();

        System.out.println("digite o numero da disciplina: ");
        int indiceDisciplina = scan.nextInt() + 1;

        aluno.calcularMedia(indiceDisciplina);
        aluno.estaAprovado(indiceDisciplina);

    }
}
