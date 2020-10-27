package entrega3_progCom;
import java.util.Scanner;

public class palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("...Es un palindromo?...\n");
        System.out.println("Ingrese la palabra que quiere verificar : ");
        
        String palabra= sc.nextLine();
        
        if(palPalabra(palabra) == true) {
        	System.out.printf(" La palabra \"%s\" es un PALINDROMO", palabra);
        }else {
        	System.out.printf(" La palabra \"%s\" NO es un PALINDROMO", palabra);
        }     
        
        System.out.println("\n----------------");
        sc.close();
	}// cierra metodo main
	
	//funcion palindromo
	public static boolean palPalabra(String x) {
		x = x.toLowerCase();
		for(int i=0; i<x.length() ;i++) {
			if(x.charAt(i) != x.charAt(x.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
}// cierra clase
