package entrega3_progCom;
import java.util.Scanner;

public class contraSegura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("...Es una contraseña segura ?...\n");
		mensaje();
		String pass= sc.nextLine();
	   
		while( password(pass) == false ) {
			mensaje();			
			pass= sc.nextLine();
		}
		sc.close();				
		System.out.println(" \n***********  su contraseña es segura!!!   ***************\n");	
	}//cierra metodo main	
	
	//funcion validacion
		public static boolean password(String x) {
			boolean minus = false, mayus = false, num = false,sim = false; 
			if(x.length() > 9) {
				for(int i=0; i<x.length() ;i++) {
					if(x.charAt(i) >= 97 && x.charAt(i) <= 122) {
						minus = true;
					}
					if(x.charAt(i) >= 65 && x.charAt(i) <=90) {
						mayus = true;
					}
					if(x.charAt(i) >= 48 && x.charAt(i) <=57) {
						num = true;
					}
					if(x.charAt(i) >= 33 && x.charAt(i)<= 42) {
						sim = true;
					}
					if((minus && mayus && num && sim) == true)
						return true;					
				}
			}
				System.out.println("\n***********    E R R O R    ***************\n");
				return false;
		
		}

				
	// funcion mensaje
		public static void mensaje() {
			System.out.println("...Su contraseña debe tener una longitud de almenos 10 caracteres...");
			System.out.println("...debe tener numeros y letras (A-Z),(a-z),(0-9)...");
			System.out.println("...debe contener al menos un caracter especial [  ! , \" , # , $ , & , ' , ) , ( , * ]...\n");
	        System.out.print("Ingrese su contraseña : ");
		}
		
	
}// cierra clase 
