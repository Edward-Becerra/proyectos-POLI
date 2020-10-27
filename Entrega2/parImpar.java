package entrega2_progCom;
import java.util.Scanner;
public class parImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------Calcular si un numero es par o impar ----------------\n"); // T�tulo del programa
		// Explicacion del programa
		System.out.println("Mediante este programa usted puede calcular si el numero ingresado es par o impar\n");
		// Declaracion de variables.
		boolean fin, opc;
		int num; 
		
		do {
			System.out.print("--------- Ingresa un numero : ");// solicita entrada
			
			num = sc.nextInt();// lee la entrada 		
			num = parImpar(num); // llamado a funcion para conocer si es par o impar 
			
			System.out.println("--------- quieres ver otro numero y conocer si es par o impar ? -----------------------\n");// solicita entrada
			System.out.println("1. Si/(Digite true)\n2. No/(Digite false)\n");// solicita entrada
			opc = sc.nextBoolean();
			
			fin=opcion(opc);// llamado funcion evaluacion fin programa 
			
		}while(fin);//condicion while
        
	sc.close(); //cierra instancia objeto Scanner
	}// cierra metodo main
	
	//Funcion para hallar el si el numero es par o impar
	public static int parImpar(int n) {
	      if(n % 2 == 0) {	    	  
	    	  System.out.println( n + " Es numero Par\n");
	    	  return n;
	      }else {
	    	  System.out.println(n + " Es numero Impar\n");
	    	  return n;
	      }
		}
	
	//funcion booleana fin programa
	public static boolean opcion (boolean o) {
		if(o) {
			return o = true;
		}else {
			System.out.println(".........Eso es todo !!!........");
			return o = false;
		}
	}
	
}// cierra clase
