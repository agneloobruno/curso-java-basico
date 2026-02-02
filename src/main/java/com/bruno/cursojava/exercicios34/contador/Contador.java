package main.java.com.bruno.cursojava.exercicios34.contador;

public class Contador {

    private static int qtdContador;
    private int valorContador;

    public int getValorContador() {
        return valorContador;
    }

    public void setValorContador(int valorContador) {
        this.valorContador = valorContador;
    }

    public static int getQtdContador() {
        return qtdContador;
    }

    public Contador(){
        setValorContador(0);
        qtdContador++;
    }

    public int incrementarContador(int valor){
        for(int i = 0; i < valor; i++){

            System.out.print(getValorContador() + " + 1 = ");
            setValorContador(getValorContador() + 1);
            System.out.println(getValorContador());

        }

        return this.valorContador;
    }

    public void zerarContador(){
        setValorContador(0);
        System.out.println("Valor do contador foi zerado.");
    }
}
