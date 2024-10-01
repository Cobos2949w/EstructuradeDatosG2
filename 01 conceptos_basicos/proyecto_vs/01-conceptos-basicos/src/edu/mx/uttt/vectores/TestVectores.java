package edu.mx.uttt.vectores;

public class TestVectores {
    public static void main(String[] args) {
        //Declaración de vectores
        int tam =4;
        int [] x = new int [3];
        System.out.println(x[1]);

        double [] y = new double [tam];
        System.out.println(y[3]);

        boolean z1[];
        z1 = new boolean [4];
        z1 = new boolean [4];
        System.out.println(z1[3]);

        char x1[], x2[], x3[];
        x1 = new char [tam];
        tam = 8;
        x2 = new char [tam];

        System.out.println(x2[3]);

        String zz[] ={"Iván", "Héctor", "Emmanuel", "Victor"};

        try {
            System.out.println(zz[4]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        zz[1] = "Nick";
        System.out.println(zz[1]);

    }
}
