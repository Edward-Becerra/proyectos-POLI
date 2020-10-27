package entrega1_progCom;
import java.util.Scanner;

// pide celcius
// convierte a Fahrenheit, Kelvin y Rankine
public class temperatura {
	public static void main(String[]args) {
		
		Scanner leer = new Scanner(System.in);
		System.out.println("------------------Conversion de medidas de Temperatura----------------\n"); // T�tulo del programa
		// Explicaci�n del programa
		System.out.println("Mediante este programa usted puede calcular diferentes medidas de temperatura\nen Celcius expresada en otras medidas de temperatura\n");
		System.out.println("--------- Cuantos grados celcius quieres ver en otras unidades de medida?     -----------------------");// solicita entrada
		double cel = leer.nextDouble();// lee la entrada 
		
		System.out.println("---------Ha ingresado : " + cel  +" grados Celcius-----------------------\n");		// muestra la entrada en pantalla
		
		System.out.println(cel + " grados Celcius equivalen a : " + fah(cel) +  " grados Fahrenheit");
		System.out.println(cel + " grados Celcius equivalen a : " + kel(cel) +  " grados Kelvin");
		System.out.println(cel + " grados Celcius equivalen a : " + ran(cel) +  " grados Rankine");
		leer.close();// cierra clase Scanner
	}//cierra metodo main
	
	static double fah(double cel) {
		return (cel * 1.8)+32;
	}
	static double kel(double cel) {
		return cel + 273.15;
	}
	static double ran(double cel) {
		return kel(cel)*1.8;
	}
}// cierra clase programa