package edu.mx.uttt.practicar;

public class CalcularFibonacci {

    // Método recursivo para calcular Fibonacci
    public int calcularFibonacci(int n) {
        // Condición base: F(0) = 0, F(1) = 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Fórmula recursiva: F(n) = F(n-1) + F(n-2)
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
    //public static double calcularFactorial(int n) {
        //if (n == 0 || n == 1) {
            //return 1;
        //}

        //double factorial = 1;
        //for (int i = 2; i <= n; i++) {
            //factorial *= i;
        //}
        //return factorial;
    //}


    // Método para imprimir el Fibonacci calculado
    public void imprimirFibonacci(int n) {
        int resultado = calcularFibonacci(n);
        System.out.println("El Fibonacci de " + n + " es: " + resultado);
    }

    public static void main(String[] args) {
        CalcularFibonacci cf = new CalcularFibonacci();

        // Ejemplo: calcular Fibonacci de 5
        cf.imprimirFibonacci(5);  // Debería imprimir 5

        // Ejemplo: calcular Fibonacci de 10
        cf.imprimirFibonacci(10);  // Debería imprimir 55
    }
}
