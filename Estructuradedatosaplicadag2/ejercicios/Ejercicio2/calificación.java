package Ejercicio2;
    public class calificación {
    private int numAlumnos;  
    private double[] calificaciones;  

    public calificación() {
        this.numAlumnos = 1;
        this.calificaciones = new double[numAlumnos];
    }

    public calificación(int numAlumnos) {
        this.numAlumnos = (numAlumnos > 0) ? numAlumnos : 1;
        this.calificaciones = new double[this.numAlumnos];
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        if (numAlumnos > 0) {
            this.numAlumnos = numAlumnos;
            this.calificaciones = new double[this.numAlumnos];  
        } else {
            System.out.println("El número de alumnos no puede ser negativo o cero");
            this.numAlumnos = 1;
            this.calificaciones = new double[this.numAlumnos];
        }
    }

    public void agregarCalificacion(int indice, double calificacion) {
        if (indice >= 0 && indice < this.numAlumnos) {
            this.calificaciones[indice] = calificacion;
        } else {
            System.out.println("Índice fuera de rango");
        }
    }

    public double calcularMedia() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / numAlumnos;
    }

    public double calificacionMasBaja() {
        double minima = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion < minima) {
                minima = calificacion;
            }
        }
        return minima;
    }

    @Override
    public String toString() {
        return "La calificación media es: " + this.calcularMedia() + 
               "\nLa calificación más baja es: " + this.calificacionMasBaja();
    }
}
