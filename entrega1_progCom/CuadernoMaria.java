package entrega1_progCom;
import java.util.Scanner;
public class CuadernoMaria {

	public static void main(String[] args) {
		
		System.out.println("------------------Programa Cuaderno Maria----------------\n"); // T�tulo del programa
		// Explicaci�n del programa
		System.out.println("Mediante este programa usted puede calcular cuantos cuadritos tiene cada pagina del cuaderno de Maria\n");
		Scanner leer = new Scanner(System.in);
		System.out.println("------------------Digite Largo de la hoja del cuaderno en centimetros (A)----------------\n");
		double a = leer.nextDouble();
		System.out.println("------------------Digite Ancho de la hoja del cuaderno en centimetros (B)----------------\n");
		double b = leer.nextDouble();

		System.out.println("----------------------------- El area de la Hoja  es: " + hoja(a,b) + " cms -----------------------\n");
		System.out.println("------------------El area de la pagina cuadriculada es: " + margen(a,b) + " cms ----------------\n");
		System.out.println("En la hoja de: " + hoja(a,b) + " cms hay un total de: " + cuadritos(a,b) + " cuadritos de 0.5 cms * 0.5 cms");
		leer.close();// cierra clase Scanner
	} //cierra Metodo main
	
	static double hoja(double a, double b) {
		return a*b;
	}
	static double margen(double a, double b) {
		return (a - 2)*(b - 1);
	}
	static double cuadritos(double a, double b) {
		return margen(a,b)/(0.5 * 0.5);
	}

}// cierra clase 
