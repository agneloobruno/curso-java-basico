package main.java.com.bruno.cursojava.exercicio24;

public class Exer01 {

    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.tensao = "Bivolt";
        lampada.modelo = "A60";
        lampada.garantiaMeses = 4;
        lampada.potenciaWatts = 7;
        lampada.cor = "Azul";
        lampada.tipoLuz = "Luz";
        lampada.tipoAbajur = true;

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";
    }
}
