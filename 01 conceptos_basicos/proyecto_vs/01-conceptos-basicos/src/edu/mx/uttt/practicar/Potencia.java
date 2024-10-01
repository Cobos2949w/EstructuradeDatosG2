package edu.mx.uttt.practicar;

public class Potencia {
    public int potencia(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * potencia(a, b - 1);

    }

    public void imprimir(int a, int b) {
        int resultado = potencia(a, b);
        System.out.println("El resultado de la potencia es: " + a + "^" + b + " = " + resultado);

    }
    public static void main(String[] args) {
        Potencia p = new Potencia();
        p.imprimir(4, 2);
    }
}
