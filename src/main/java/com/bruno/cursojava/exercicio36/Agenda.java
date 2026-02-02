package main.java.com.bruno.cursojava.exercicio36;

import java.util.Random;
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


        for (int i = 0; i < contatos.length; i++){
            contatos[i] = new Contato();
            System.out.println("Digite o nome do " + (i+1) + "° contato: ");
            contatos[i].setNome(scan.nextLine());

            System.out.println("Digite o email do " + (i+1) + "° contato: ");
            contatos[i].setEmail(scan.nextLine());

            System.out.println("Digite o telefone do " + (i+1) + "° contato: ");
            contatos[i].setTelefone(scan.nextLine());
        }
    }


    public void listarContatos() {

        if (contatos != null) {
            for (int i = 0; i < contatos.length; i++){
                System.out.println(
                        "Contato: " + contatos[i].getNome() +
                        "\n" +
                        "E-mail: " + contatos[i].getEmail() +
                        "\n" +
                        "Telefone: " + contatos[i].getTelefone() +
                         "\n ==============================================="
                );
            }
        }
    }

    public void buscarContato() {
        if (contatos != null){
            System.out.println("Digite o ID do contato: ");
            int id;
            Scanner scan = new Scanner(System.in);

            id = scan.nextInt() + 1;
            for (int i = 0; i < contatos.length; i++){
                if (i == id){
                    System.out.println(
                            "Contato: " + contatos[i].getNome() +
                                    "\n" +
                                    "E-mail: " + contatos[i].getEmail() +
                                    "\n" +
                                    "Telefone: " + contatos[i].getTelefone() +
                                    "\n ==============================================="
                    );
                }
            }
        }
    }
}
