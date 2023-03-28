public class Ejercicio7 {
    public static void main(String[] args) {
        //Declarar el primer arreglo
        int[] arreglo = {11, 12, 13, 14, 15};
        System.out.println("ARREGLO 1: ");
        /*imprimirlo en pantalla
        El ciclo  va a recorrer todo el arreglo
        */
        for(int i=0; i<arreglo.length; i++){
           System.out.print(arreglo[i]+" ");
		}
        System.out.println(" ");
        System.out.println("----------------- ");
        
        System.out.println("ARREGLO 2: ");
        //Se declara el arreglo 2 del mismo tamaño que el arreglo anterior
        int[]arreglo2= new int[arreglo.length];
        
        /* 
        Se recorren los elementos  de los 2 arreglos y se acomodan
        */
        for(int i =arreglo2.length - 1, j=0; i>= 0; i--, j++){
            arreglo2[i]=arreglo[j];
        }
        //Imprimir el arreglo invertido 
        for (int i=0; i<arreglo2.length; i++){
            System.out.print(arreglo2[i]+" ");}
           System.out.println(" ");
    }

        
    }
    
    
    

