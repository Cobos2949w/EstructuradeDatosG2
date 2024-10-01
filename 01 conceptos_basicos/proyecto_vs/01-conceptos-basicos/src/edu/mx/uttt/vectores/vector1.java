package edu.mx.uttt.vectores;

public class vector1 {
    //Variables
    private int[] v1;
    private int[] v2;
    private int Tam;

    public vector1(int tam) {
        if (tam > 0) {
            v1 = new int[tam];
            v2 = new int[tam];
            this.Tam = tam;
        } else {
            v1 = new int[0];
            v2 = new int[0];
            this.Tam = 0;
        }
    }

    public int productoEscalar() {
        int producto = 0;
        for (int i = 0; i < Tam; i++) {
            producto += v1[i] * v2[i];
        }
        return producto;
    }

    public int[] invertir() {
        int[] invertido = new int[Tam];
        for (int i = 0; i < Tam; i++) {
            invertido[i] = v1[Tam - 1 - i];
        }
        return invertido;
    }

    public int[] multiplicarPorEscalar(int escalar) {
        int[] resultado = new int[Tam];
        for (int i = 0; i < Tam; i++) {
            resultado[i] = v1[i] * escalar;
        }
        return resultado;
    }


    public int getTam() {
        return Tam;
    }

    public int[] getV1() {
        return v1;
    }

    public int[] getV2() {
        return v2;
    }

    public void setV1(int[] v1) {
        if (v1.length == Tam) {
            for (int i = 0; i < v1.length; i++) {
                this.v1[i] = v1[i];
            }
        }
    }

    public void setV2(int[] v2) {
        if (v2.length == this.v2.length) {
            int i = 0;
            while (i < v2.length) {
                this.v2[i] = v2[i];
                i++;
            }
        }
    }

    public int[] sumar() {
        int[] resultado = new int[Tam];

        for (int i = 0; i < Tam; i++) {
            resultado[i] = v1[i] + v2[i];
        }

        return resultado;
    }

    public static void main(String[] args) {
        vector1 vector = new vector1(3);

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        vector.setV1(array1);
        vector.setV2(array2);

        // Sumar
        int[] suma = vector.sumar();
        System.out.println("Suma de los vectores:");
        for (int i : suma) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Producto escalar
        int productoEscalar = vector.productoEscalar();
        System.out.println("Producto escalar de los vectores: " + productoEscalar);

        // Invertir
        int[] invertido = vector.invertir();
        System.out.println("Vector 1 invertido:");
        for (int i : invertido) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Multiplicar
        int escalar = 3; // Por ejemplo, multiplicamos por 3
        int[] multiplicado = vector.multiplicarPorEscalar(escalar);
        System.out.println("Vector 1 multiplicado por " + escalar + ":");
        for (int i : multiplicado) {
            System.out.print(i + " ");
        }
    }
}