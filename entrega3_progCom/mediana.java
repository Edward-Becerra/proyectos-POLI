package entrega3_progCom;
import java.util.Scanner;
public class mediana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("...Calcular la mediana del arreglo...\n");
        System.out.println("Ingrese el tamaño del arreglo: ");
        
        int tam = sc.nextInt();
        int[] nums = new int[tam];
        System.out.println("Ingrese los números uno por uno: ");
        
        for(int i = 0; i < nums.length; i++)
            nums[i] = sc.nextInt();
        
        ordenado(nums);
        imprimir(nums);
        
        System.out.println("\n----------------");
        
        medArreglo(nums);
        
        
        sc.close();
	}//cierra metodo main	
	
	// funcion para ordenar el arreglo 
		public static void ordenado(int nums[]) {
			int aux = 0;
	        for(int i = 1; i < nums.length; i++) { //usamos el metodo de la burbuja
	            for(int j = 0; j < nums.length - i; j++) {
	                if(nums[j] > nums[j+1]){
	                    aux = nums[j];
	                    nums[j] = nums[j+1];
	                    nums[j+1] = aux;
	                }
	            }
	        }
		}
		
		// funcion imprimir arreglo
		public static void imprimir(int x[]) {
			for(int i = 0; i < x.length; i++) 
				System.out.print(x[i] + "   ");
		}
		
		// funcion mediana
		public static double medArreglo(int x[]) {			
			double mediana = 0.0;
			int pos = x.length/2;
			if(x.length%2 == 0 ) {
				mediana = (x[pos-1] + x[pos]) / 2.0;
				System.out.println("Mediana : " + mediana);
			}else {
				mediana = x[pos];
				System.out.println("Mediana : " + mediana);
			}
			return mediana;
			
		}
		
	
}// cierra clase 
