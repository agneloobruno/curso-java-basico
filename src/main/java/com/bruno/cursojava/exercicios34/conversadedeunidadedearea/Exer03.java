package main.java.com.bruno.cursojava.exercicios34.conversadedeunidadedearea;

import static main.java.com.bruno.cursojava.exercicios34.imprimirtela.ImprimirTela.imprimirTela;

public class Exer03 {
    public static void main(String[] args) {
        imprimirTela(ConversaoDeUnidadesDeArea.converteMetrosParaPes(10));

        imprimirTela(ConversaoDeUnidadesDeArea.converteMilhasParaAcres(10));

        imprimirTela(ConversaoDeUnidadesDeArea.convertePesParaCentimetros(10));

        imprimirTela(ConversaoDeUnidadesDeArea.converteAcresParaPes(10));
    }
}
