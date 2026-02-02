package main.java.com.bruno.cursojava.exercicio36;

import java.util.Scanner;

public class Agenda {

    private Contato[] contatos;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public void criarContatos(){
        contatos = new Contato[3];
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < getContatos().length; i++){
            contatos[i] = new Contato();
            System.out.println("Digite o nome do " + (i+1) + "° contato: ");
            contatos[i].setNome(scan.nextLine());
        }
    }
}
