import java.util.Arrays;
public class Ejercicio9 {
    public static void main(String[]args){
        //Declarar el arreglo
        int[] numeros = {4,14,17,19};
        System.out.println("Arreglo original: ");
        for(int i=0; i<numeros.length; i++){
            System.out.print(numeros[i]+"."+" ");
        }
        System.out.println(" ");
        System.out.println("-------------------");
        /*Copiar el arreglo
        Parámetros:
        numeros -> se refiere al arreglo original (numeros)
        numeros.length --> se refiere a la longitud del arreglo original(numeros)
        */
        int[] numeros2=Arrays.copyOf(numeros, numeros.length);
        //Imprimir arreglo
        System.out.println("Copia del arreglo: ");
        for(int i=0; i<numeros2.length; i++){
            System.out.print(numeros2[i]+"."+" ");
        }
        System.out.println(" ");
        
        
        
    }
    
    
}
