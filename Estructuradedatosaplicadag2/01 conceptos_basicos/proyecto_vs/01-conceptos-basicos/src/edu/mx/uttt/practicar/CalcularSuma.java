package edu.mx.uttt.practicar;

public class CalcularSuma {
    //Método recursivo
    public int sumarHasta(int numero) {
        if (numero < 0){
            System.out.println("El número no puede ser negativo");
        } else if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero + sumarHasta(numero - 1);
        }
        return 0;
    }
    //Método para ejecutar
    public void imprimirSuma(int numero) {
        if (numero < 0){
            try {
                int resultado = sumarHasta(numero);
                System.out.println(resultado);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //Metdo para ejecutar

    }
    public static void main(String[] args) {
        CalcularSuma calcularSuma = new CalcularSuma();
        calcularSuma.imprimirSuma(5);


    }

}
