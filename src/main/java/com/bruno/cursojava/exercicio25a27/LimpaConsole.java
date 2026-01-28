package main.java.com.bruno.cursojava.exercicio25a27;

public class LimpaConsole {
    public static void clearConsole() {
        System.out.print("\u001b[H\u001b[2J");
        System.out.flush();
    }
}
