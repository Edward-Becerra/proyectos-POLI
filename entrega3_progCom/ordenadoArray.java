package entrega3_progCom;
import java.util.Scanner;
public class ordenadoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);
		        System.out.println("Ingrese el tamaño del arreglo: ");
		        
		        int tam = sc.nextInt();
		        int[] nums = new int[tam];
		        
		        System.out.println("Ingrese los números uno por uno: ");
		        
		        for(int i = 0; i < nums.length; i++)
		            nums[i] = sc.nextInt();
		        
		        for(int i = 0; i < nums.length; i++) 
        			System.out.print(nums[i] + "   ");
		        
		        System.out.println("\n----------------");
		        
		        for(int i = 1; i < nums.length; i++) { //usamos el metodo de la burbuja
		            for(int j = 0; j < nums.length - i; j++) {
		                if(nums[j] > nums[j+1]){
		                	System.out.println("\n......El array NO esta ordenado de menor a mayor!....\n");
		                }
		            }
		        } 
		        System.out.println("... Quiere organizar el array? ...\n1.Si\n2.No");
		        int opc = sc.nextInt();
		        if(opc == 1)
		        	ordenado(nums);
		        else if(opc == 2)
		        	System.out.println("\n... eso es todo! ...");
		        else
		        	System.out.println("\n....Opcion INVALIDA!! ....");
		        sc.close();     		        
	       
		    }// cierra metodo main
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
	        
	        for(int i = 0; i <nums.length; i++) 
	            System.out.print(nums[i] + "   ");
		}
		
}// cierra clase
