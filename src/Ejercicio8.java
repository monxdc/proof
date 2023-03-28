//Importar la librería de la clase Arrays
import java.util.Arrays;

public class Ejercicio8 {

    public static void main(String[] args) {
       //Declarar el arreglo
        int[] numeros = new int[6];
        /*Llenarlo con el método FILL 
        Todas las posiciones tendrán el mismo valor
        */
        Arrays.fill(numeros, 3);
        System.out.println("ARREGLO: ");
        //Imprimirlo 
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(" ");
    }

    
}
