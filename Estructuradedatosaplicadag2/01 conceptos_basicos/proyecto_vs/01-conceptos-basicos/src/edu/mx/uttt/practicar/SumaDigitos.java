package edu.mx.uttt.practicar;

public class SumaDigitos {
    public int sumaDigitos(int n) {
        if (n==0){
            return 0;

        }
        return (n % 10) + sumaDigitos(n/10);
    }

    //Método para imprimir
    public void imprimir(int n){
        int resultado = sumaDigitos(n);
        System.out.println("La suma de digitos es: " + resultado);

    }
    public static void main(String[] args) {
        SumaDigitos suma = new SumaDigitos();

        suma.imprimir(1235);
    }
}
