import java.util.Scanner;
public class Arreglos {
    public static void main(String[]args){
        //Crear la matriz (o arreglo bidimensional)
        String arreglo[][]= new String[10][3];
        Scanner sc = new Scanner(System.in);
        //Entrada de datos
        System.out.println("Nombre");
        System.out.println("Mes");
        System.out.println("A\u00f1o");
        for(int i=0; i<10; i++){
		for(int j=0; j<3; j++) {
                    System.out.print("Posicion: ["+i+"]["+j+"] ");                  
                       arreglo[i][j]=sc.next();
		}
	}

        
        //IMPRIMIR ARREGLO
        for(int i=0; i<10; i++){
		for(int j=0; j<3; j++){
			System.out.print(arreglo[i][j]+"\t");
		}
	System.out.println(" ");
	}
        //ORDENAR
        System.out.println("\nLos numeros ingresados ORDENADOS  DESCENDENTEMENTE son: ");
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.println(arreglo[i]);
        }

    
       
      
        
        
    }
}
    

