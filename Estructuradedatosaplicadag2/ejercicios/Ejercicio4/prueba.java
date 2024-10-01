package Ejercicio4;
import java.util.ArrayList;

public class prueba {
    private ArrayList<edad> personas;

    public prueba() {
        this.personas = new ArrayList<>();
    }

    public void agregarPersona(edad persona) {
        this.personas.add(persona);
    }

    public void calcularPromedioPesos() {
        double sumaNiños = 0, sumaJóvenes = 0, sumaAdultos = 0, sumaViejos = 0;
        int contadorNiños = 0, contadorJóvenes = 0, contadorAdultos = 0, contadorViejos = 0;

        for (edad persona : personas) {
            int edad = persona.getEdad();
            double peso = persona.getPeso();

            if (edad >= 0 && edad <= 12) {  // Niños
                sumaNiños += peso;
                contadorNiños++;
            } else if (edad >= 13 && edad <= 29) {  // Jóvenes
                sumaJóvenes += peso;
                contadorJóvenes++;
            } else if (edad >= 30 && edad <= 59) {  // Adultos
                sumaAdultos += peso;
                contadorAdultos++;
            } else if (edad >= 60) {  // Viejos
                sumaViejos += peso;
                contadorViejos++;
            }
        }

        System.out.println("Promedio de peso de niños: " + (contadorNiños > 0 ? sumaNiños / contadorNiños : 0));
        System.out.println("Promedio de peso de jóvenes: " + (contadorJóvenes > 0 ? sumaJóvenes / contadorJóvenes : 0));
        System.out.println("Promedio de peso de adultos: " + (contadorAdultos > 0 ? sumaAdultos / contadorAdultos : 0));
        System.out.println("Promedio de peso de viejos: " + (contadorViejos > 0 ? sumaViejos / contadorViejos : 0));
    }
}
