/*
En un nuevo proyecto, crear una clase de nombre Arreglo con los siguientes métodos 
estáticos (static):
 */
package tpo_5;

/**
 *
 * @author santi
 */
public class Arreglo {

//a) Método sumarLista que reciba por parámetro un arreglo unidimensional de 
//enteros y muestre por pantalla la suma y promedio de los mismos.
    public static void sumarLista(int arr[]) {
        int suma = 0;
        for (int elem : arr) {
            suma += elem;
        }
        System.out.println("Suma = " + suma + " | Promedio = " + (float) suma / arr.length);
    }

//b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e 
//irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
    public static int buscarMayor(int matrix[][]) {
        int mayor = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > mayor) {
                    mayor = matrix[i][j];
                }
            }
        }
        return mayor;
    }

//c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad 
//de vocales que tiene la cadena.
    public static int cuentaVocales(String s) {
        int cantidad = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (Character.toLowerCase(s.charAt(i))) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cantidad++;
            }
        }
        return cantidad;
    }

//d) Método cuentaCaracter que reciba por parámetro un String y un caracter, luego 
//retorne la cantidad de veces que se repite en la cadena el carácter recibido.  
    public static int cuentaVocales(String s, char c) {
        int cantidad = 0;
        char letra = Character.toLowerCase(c);
        for (int i = 0; i < s.length(); i++) {
            char caracterString = Character.toLowerCase(s.charAt(i));
            if (letra == caracterString) {
                cantidad++;
            }
        }
        return cantidad;
    }
}
