package entrega3_progCom;
import java.util.Scanner;

public class cuantosDiferentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("...Cuantos numeros diferentes hay en el arreglo X...\n");
        System.out.println("Ingrese el tamaño del arreglo: ");
        
        int tam = sc.nextInt();
        int[] nums = new int[tam];
        int n2[] = new int[nums.length];
        int n3[] = new int[nums.length];;
        int cont = 0, cont2 = 0;
        
        System.out.println("Ingrese los números uno por uno: ");
        
        for(int i = 0; i < nums.length; i++)
            nums[i] = sc.nextInt();
        
        ordenado(nums);
        imprimir(nums);
        
        System.out.println("\n----------------");

    	for(int i=0;i<nums.length-1;i++) {
	    	if(nums[i] == nums[i+1]) {
	    		n2[cont] = nums[i];
	    		cont++;
	    		//System.out.println("IF");
	    	}else {
	    		n3[cont2] = nums[i];
	    		cont2++;        		
	    		//System.out.println("ELSE");
	    	}
	    } 
    	
    	n3[cont2] = nums[nums.length-1];
    	
    	if(cont == 0) {
    		System.out.println("...Todos los elementos son DIFERENTES...\n");
    		System.out.println("...Hay "+ nums.length +" numeros en el arreglo X ..." );	
	    }else if(cont2 == 0) {
	    	System.out.println("...Todos los elementos son IGUALES...\n");
    		System.out.println("...Hay 1 numero en el arreglo X ..." );
	    }  	
    	else{
	    	System.out.println("...Numeros que se repiten en el arreglo X :");
	    	
	    	for(int i=0;i<cont;i++) {
	    	System.out.println(n2[i]);	    	
	    	}
	    	
	    	System.out.println("...Numeros diferentes en el arreglo X:");
	    	for(int i=0;i<=cont2;i++) {
	    	System.out.println(n3[i]);
	    	}
	    	
	    	if(cont > cont2) {
	    		System.out.println("...Hay " + (nums.length - cont2) + " numeros diferentes en el arreglo X ..." );
	    	}else {
	    		System.out.println("...Hay " + (nums.length - cont) + " numeros diferentes en el arreglo X ..." );
	    	}
    	}
     sc.close();
 }// cierra metodo main	

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
	
}// cierra clase

