package Ejercicio3;
public class tabla {
    private int numero;  

    public tabla() {
        this.numero = 1;  
    }

    public tabla(int numero) {
        this.numero = (numero > 0) ? numero : 1;  
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("El número debe ser positivo.");
            this.numero = 1;
        }
    }

    public void imprimirTabla() {
        System.out.println("Tabla de multiplicar del " + this.numero + ":");
        for (int i = 1; i <= 10; i++) {
            int producto = this.numero * i;
            System.out.println(this.numero + " x " + i + " = " + producto);
        }
    }
}
