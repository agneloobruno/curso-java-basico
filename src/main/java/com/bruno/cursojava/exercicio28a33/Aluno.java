package main.java.com.bruno.cursojava.exercicio25a27;

import java.util.Scanner;

public class Aluno {

    String nome;
    String matricula;
    String curso;
    Disciplina[] disciplinas = new Disciplina[3];

    public boolean estaAprovado(int indiceDisciplina){
        double media = calcularMedia(indiceDisciplina);
        if (media >= 7){
            System.out.println("Aprovado na matéria " + disciplinas[indiceDisciplina].nome);
        } else {
            System.out.println("Reprovado");
        }
        return media>=7;
    }

    public double calcularMedia(int indiceDisciplina){

        Disciplina d = disciplinas[indiceDisciplina];
        double soma = 0;
        for (int j = 0; j < d.notas.length; j++){
            soma += d.notas[j];
        }
        return soma / d.notas.length;
    }

    public void lancarNotas(Scanner scan){
        for (int i = 0; i < disciplinas.length; i++){

            disciplinas[i] = new Disciplina();

            System.out.println("Nome da disciplina: ");
            disciplinas[i].nome = scan.next();
            scan.nextLine();
            for(int j = 0; j < disciplinas[i].notas.length; j++){
                System.out.println("Digite a nota do " + (j + 1) + " bimestre");
                disciplinas[i].notas[j] = scan.nextDouble();
            }
        }
    }

    public void exibirNotas() {
        for (int i = 0; i < disciplinas.length; i++){
            System.out.println("Nome da disciplina: " + disciplinas[i].nome);

            for(int j = 0; j < disciplinas[i].notas.length; j++){
                System.out.println("Digite a nota do " + (j + 1) + " bimestre: " + disciplinas[i].notas[j]);

            }
        }
    }
}
