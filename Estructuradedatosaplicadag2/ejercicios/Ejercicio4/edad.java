package Ejercicio4;
public class edad {
    private int edad;
    private double peso;

    public edad(int edad, double peso) {
        this.edad = (edad >= 0) ? edad : 0;
        this.peso = (peso >= 0) ? peso : 0;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }
}
