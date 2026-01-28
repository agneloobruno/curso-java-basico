package main.java.com.bruno.cursojava.exercicio25a27;

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

    private double calcularMedia(int indiceDisciplina){

        Disciplina d = disciplinas[indiceDisciplina];
        double soma = 0;
        for (int j = 0; j < d.notas.length; j++){
            soma += d.notas[j];
        }
        return soma / d.notas.length;
    }
}
