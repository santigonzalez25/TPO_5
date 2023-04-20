/*
Luego desde el método main de una clase de nombre PruebaArreglo, invocar los métodos 
de la clase Arreglo creada por usted.
 */
package tpo_5;

/**
 *
 * @author santi
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creo vector
        int vector[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("\u001B[35;1mVector:\u001B[0m");
        Arreglo.sumarLista(vector);
        System.out.println("");

        //Creo matriz
        System.out.println("\u001B[35;1mMatriz:\u001B[0m");
        int matrix[][] = {{2, 3, 6, 50, 19}, {9, 21, 4, 6, 17, 4}, {4, 8, 69, 6}};
        System.out.println(
                "Número mayor: " + Arreglo.buscarMayor(matrix));
        System.out.println(
                "");

        //Creo String
        String s = "Armagedon Argentino de Anarquia Absoluta";

        System.out.println(
                "\u001B[35;1mString (" + s + "):\u001B[0m");
        System.out.println(
                "Cuenta vocales: " + Arreglo.cuentaVocales(s));
        System.out.println(
                "");

        //Creo Char y uso la misma String del método anterior
        char c = 'A';

        System.out.println(
                "\u001B[35;1mLetra (" + c + ") en String (" + s + "):\u001B[0m");
        System.out.println(
                "Cantidad veces repetida: " + Arreglo.cuentaVocales(s, c));
    }

}
