package main.java.com.bruno.cursojava.exercicio36;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome da agenda: ");
        agenda.setNome(scan.next());

        agenda.criarContatos();
        agenda.listarContatos();
        agenda.buscarContato();
    }
}
