package Ejercicio2;
import javax.swing.JOptionPane;

public class prueba {
    public static void main(String[] args) {
        calificación grupo1 = new calificación(4);

        grupo1.agregarCalificacion(0, 8.0);
        grupo1.agregarCalificacion(1, 6.5);
        grupo1.agregarCalificacion(2, 7.0);
        grupo1.agregarCalificacion(3, 9.5);

        JOptionPane.showMessageDialog(null, grupo1.toString());

        calificación grupo2 = new calificación(3);

        grupo2.agregarCalificacion(0, 5.0);
        grupo2.agregarCalificacion(1, 7.5);
        grupo2.agregarCalificacion(2, 8.5);

        JOptionPane.showMessageDialog(null, grupo2.toString());
    }
}
