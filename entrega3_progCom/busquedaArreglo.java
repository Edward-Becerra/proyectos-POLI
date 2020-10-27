package entrega3_progCom;
import java.util.Random;
import java.util.Scanner;
public class busquedaArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(".....Puedes encontrar el numero N en el arreglo X ???....\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println(".....Ingrese el tamaño del arreglo....\n");
		
		int x[], n;
		int tam = sc.nextInt();
	    x = new int[tam];
		
        // llenar con valores aleatorios
	    Random rnd = new Random();
        for (int i = 0; i < x.length; i++) 
             x[i] = rnd.nextInt(tam - 1);              
        
        // Ingresa el valor que quiere buscar 
        System.out.print("\nIngrese el dato que quiere buscar en el arreglo: ");
        n = sc.nextInt();
        
        // llamado a la funcion para organizar el arreglo de manera ascendente, de tal manera que sea eficiente la busqueda el valor n
        ordenado(x);       
        
        // Ciclo que evalua si el numero ingresado esta en el arreglo
        int i=0;
        while(i<x.length && x[i]< n ) {
        	i++;        	
        }
        if(i == x.length) {
        	System.out.print("\nNumero no se encuentra en el arreglo\n");
        }else {
        	if(x[i] == n) {
        		System.out.println("Numero: "+ n + " encontrado en la posicion: " + i);
        	}else {
        		System.out.print("\nNumero no se encuentra en el arreglo\n");
        	}        	
        }
        
     // muestra el arreglo ordenado
        for(int j = 0; j <x.length; j++) 
            System.out.print(x[j] + "   ");

		sc.close();// cierra instancia clase Scanner
	}// cierra metodo main
	
	// Funcion para ordenar el arreglo 
	public static void ordenado(int nums[]) {
		int aux = 0;
        for(int i = 1; i < nums.length; i++) { //metodo de la burbuja
            for(int j = 0; j < nums.length - i; j++) {
                if(nums[j] > nums[j+1]){
                    aux = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = aux;
                }
            }
        }
	}

}// cierra clase
