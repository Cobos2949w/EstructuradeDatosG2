package Ejercicio1;
public class promedio {
    private int n; 
    private double[] calificaciones;  

    public promedio() {
        this.n = 1;
        this.calificaciones = new double[n];
    }

    public promedio(int n) {
        this.n = (n > 0) ? n : 1;
        this.calificaciones = new double[this.n];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n > 0) {
            this.n = n;
            this.calificaciones = new double[this.n];  
        } else {
            System.out.println("El valor no puede ser negativo o cero");
            this.n = 1;
            this.calificaciones = new double[this.n];
        }
    }

    public void agregarCalificacion(int indice, double calificacion) {
        if (indice >= 0 && indice < this.n) {
            this.calificaciones[indice] = calificacion;
        } else {
            System.out.println("Índice fuera de rango");
        }
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / n;
    }

    @Override
    public String toString() {
        return "El promedio de " + this.n + " calificaciones es: " + this.calcularPromedio();
    }
}
