package com.bruno.cursojava.aula20lab;

import java.util.Scanner;

/**
 *
 * @author 3714194
 */
public class Agenda {
    // Função para limpar o console e reposicionar o cursor
    public static void clearConsole() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }
    
    public static void main(String[] args) {
        final int TAMANHO_MES = 31, HORAS_DO_DIA =24;
        Scanner scan = new Scanner(System.in);
        Object[][] agenda = new Object[TAMANHO_MES][HORAS_DO_DIA];
        int dia = 0, hora = 0, entrada =0;
        String resposta;
        
        String boldOn = "\u001B[1m";
        String boldOff = "\u001B[0m";
        
        System.out.println("===================================");
        System.out.println("--------Bem-Vindo a Agenda---------");
        System.out.println("===================================\n\n\n");
        
        System.out.println("Escolha o que gostaria de fazer:\n"+boldOn+"[1]"+boldOff+" Adicionar um novo evento a sua agenda.\n"+boldOn+"[2]"+boldOff+" Alterar um evento existente na agenda.\n"+boldOn+"[3]"+boldOff+" Ver um evento existente na agenda.");
        entrada = scan.nextInt();
        
        switch(entrada){
            case 1:
                clearConsole();
                System.out.println("Entre com o dia(somente o dia) e a hora(24hrs) que deseja agendar seu compromisso: ");
                dia = scan.nextInt();
                hora = scan.nextInt();
                scan.nextLine();
        
                System.out.println("Entre com o nome do compromisso: ");
                agenda[dia][hora] = scan.nextLine();
        
                System.out.println("Dia: "+ dia+ "\nHora: "+ hora+"\nCompromisso: "+agenda[dia][hora]);
                break;
                
            case 2:
                System.out.println("Entre com o dia(somente o dia) e a hora(24hrs) que deseja alterar seu compromisso: ");
                dia = scan.nextInt();
                hora = scan.nextInt();
                scan.nextLine();
                
                System.out.println("Compromisso atual:");
                System.out.println("Dia: "+ dia+ "\nHora: "+ hora+"\nCompromisso: "+agenda[dia][hora]+"\n\n\n");
                System.out.println("Deseja Alterar esse compromisso? [Y/n]");
                resposta = scan.next();
                boolean entradaValida = false;
                do{
                  if(resposta.equalsIgnoreCase("Y") || resposta.equalsIgnoreCase("yes")){
                        System.out.println("Entre com o novo compromisso: ");
                        agenda[dia][hora] = scan.nextLine();
                        entradaValida = true;
                    }else if(resposta.equalsIgnoreCase("N")||resposta.equalsIgnoreCase("no")){
                        System.out.println("Compromisso não alterado.");
                        entradaValida = true;
                    } else {
                        System.out.println("Digite uma entrada valida.");
                    }  
                }while(!entradaValida);
                break;
                
            case 3:
                System.out.println("Entre com o dia(somente o dia) e a hora(24hrs) que deseja ver seu compromisso: ");
                dia = scan.nextInt();
                hora = scan.nextInt();
                
        
                System.out.println("Dia: "+ dia+ "\nHora: "+ hora+"\nCompromisso: "+agenda[dia][hora]);
                break;
                
            default:
                System.out.println("Entrada invalida.");
        }
    }
}
