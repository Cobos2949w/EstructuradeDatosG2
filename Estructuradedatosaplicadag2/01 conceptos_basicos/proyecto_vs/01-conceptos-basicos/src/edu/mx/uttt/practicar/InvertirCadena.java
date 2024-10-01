package edu.mx.uttt.practicar;

public class InvertirCadena {
    public String invertir(String cadena) {
        if (cadena.isEmpty()){
            return cadena;
        }
        return invertir(cadena.substring(1)) + cadena.charAt(0);

    }
    public void imprimir(String cadena) {
        String resultado = invertir(cadena);
        System.out.println(resultado);
    }
    public static void main(String[] args) {
        InvertirCadena ic = new InvertirCadena();

        ic.imprimir("Hello World");

    }

}
