package entrega3_progCom;
import java.util.Arrays;
import java.util.Scanner;

public class anagrama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("...Es un Anagrama?...\n");
        System.out.print("Ingrese una palabra : ");        
        String t= sc.nextLine().toLowerCase(); 
        
        System.out.printf("Ingrese otra palabra para verificar si es un anagrama de  \"%s\" : ", t);        
        String s= sc.nextLine().toLowerCase();
        anaPalabra(t,s);        
        
    sc.close();    
	}// cierra metodo main
	
	// funcion anagrama
	public static void anaPalabra(String a, String b) {
		
		if(b.length() != a.length()) {
        	System.out.printf("\nLa palabra \"%s\" NO es un anagrama de \"%s\".", b,a);
        }else {
        	
        	char[] t1 = a.toCharArray();
        	char[] s1 = b.toCharArray();
        	Arrays.sort(t1);
        	Arrays.sort(s1);
        	if(Arrays.equals(t1,s1)) {
        		System.out.printf("\nLa palabra \"%s\" ES un anagrama de \"%s\".", b,a);
        	}else {
        		System.out.printf("\nLa palabra \"%s\" NO es un anagrama de \"%s\".", b,a);
        	}
        }
	}
}// cierra clase
