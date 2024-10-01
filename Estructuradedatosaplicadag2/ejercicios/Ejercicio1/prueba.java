package Ejercicio1;
import javax.swing.JOptionPane;

public class prueba {
    public static void main(String[] args) {
        promedio alumno1 = new promedio();
        JOptionPane.showMessageDialog(null, "Número de calificaciones: " + alumno1.getN());

        promedio alumno2 = new promedio(3);
        JOptionPane.showMessageDialog(null, "Número de calificaciones: " + alumno2.getN());

        alumno2.agregarCalificacion(0, 7.0);
        alumno2.agregarCalificacion(1, 9.0);
        alumno2.agregarCalificacion(2, 8.0);
        JOptionPane.showMessageDialog(null, alumno2.toString());
    }
}
