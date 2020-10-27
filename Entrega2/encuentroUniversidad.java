package entrega2_progCom;
import java.util.Scanner;
public class encuentroUniversidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("------------------ Encuentro en la Universidad ----------------\n"); // T�tulo del programa
		// Explicacion del programa
		System.out.println("Mediante este programa usted puede  verificar que dia se vuelven a ver en la universidad: Ana, Bernardo y Carlos\n");
		// Declaracion de variables.
		int a, b, c;
		System.out.print("--------- Cada cuantos dias va Ana a la universidad? (a): ");// solicita entrada
		a = leer.nextInt();// lee la entrada
		System.out.print("--------- Cada cuantos dias va Bernardo a la universidad? (b): ");// solicita entrada
		b = leer.nextInt();// lee la entrada
		System.out.print("--------- Cada cuantos dias va Carlos a la universidad? (c): ");// solicita entrada
		c = leer.nextInt();// lee la entrada
		mcm(a,b,c);
		leer.close();
		
	}//cierra metodo main
	 // funcion mcm
	public static int mcm(int a, int b, int c) {
		int num1,i;
		num1 = a; 
	    if ( b > num1) {
	        num1 = b;
	    	}
	    if ( c > num1 ) {
	        num1 = c;
	        }
	    i = num1;
	    while ((i % a != 0) || (i % b != 0) || (i % c != 0))
	        i++;
		System.out.println("--------- Ana, Bernardo y Carlos se reencontraran en la universidad en:  "+i+" dias. -------------");
		return a;
	}
			
}//cierra clase

