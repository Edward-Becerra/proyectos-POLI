package entrega2_progCom;
import java.util.Scanner;
public class valorAbsoluto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------Calcular valor absoluto |  | ----------------\n"); // T�tulo del programa
		// Explicaci�n del programa
		System.out.println("Mediante este programa usted puede calcular el valor absoluto de un numero real\n");
		
		boolean fin, opc;
		double num;
		do {
			System.out.print("--------- Ingresa un numero: ");// solicita entrada
			
			num = sc.nextDouble();// lee la entrada 		
			num = abs(num);
			
			System.out.println("--------- quieres ver otro numero y su valor absoluto? -----------------------\n");// solicita entrada
			System.out.println("1. Si/(Digite true)\n2. No/(Digite false)\n");// solicita entrada
			opc = sc.nextBoolean();
			
			fin=opcion(opc);
			
		}while(fin);
        
	sc.close();
	}// cierra metodo main
	//Funcion para hallar el valor absoluto del numero con if/else
	public static double abs (double n) {
	      double abs = 0;
	      if(n<0) {
	    	  abs = Math.abs(n);
	    	  System.out.println("El numero es : " + n + " y su valor absoluto es | "+ abs +" |");
	    	  return abs;
	      }else {
	    	  System.out.println("El numero es : " + n + " y su valor absoluto es |"+ n +"|\n");
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
