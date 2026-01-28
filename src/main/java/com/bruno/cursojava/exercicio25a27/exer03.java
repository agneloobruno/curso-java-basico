package main.java.com.bruno.cursojava.exercicio25a27;

import java.util.Scanner;

public class exer03 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < aluno.disciplinas.length; i++){
            System.out.println("Nome da disciplina: ");
            aluno.disciplinas[i].nome = scan.next();
            for(int j = 0; j < aluno.disciplinas[i].notas.length; j++){
                System.out.println("Digite a nota do " + j + 1 + " bimestre");
                aluno.disciplinas[i].notas[j] = scan.nextDouble();
            }
        }

        for (int i = 0; i < aluno.disciplinas.length; i++){
            System.out.println("Nome da disciplina: " + aluno.disciplinas[i]);

            for(int j = 0; j < aluno.disciplinas[i].notas.length; j++){
                System.out.println("Digite a nota do " + j + 1 + " bimestre: " + aluno.disciplinas[i].notas[j]);

            }
        }
    }
}
