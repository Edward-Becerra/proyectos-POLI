package entrega1_progCom;
// convierte a centimetros, milimetros, pies, pulgadas,yardas, a;os luz, angstroms
import java.util.Scanner; // importar la libreria scanner 
public class conversionMedidas { // clase del programa
	public static void main(String[]args) { // inicia metodo main
		
		Scanner leer = new Scanner(System.in);
		System.out.println("------------------Conversion de medidas de longitud----------------\n"); // T�tulo del programa
		// Explicaci�n del programa
		System.out.println("Mediante este programa usted puede calcular diferentes medidas de longitud\nen metros expresada en otras medidas de longitud\n");
		System.out.println("--------- Cuantos metros quieres ver en otras unidades de medida?     -----------------------");// solicita entrada
		double entrada = leer.nextDouble();// lee la entrada 
		
		System.out.println("---------Ha ingresado : " + entrada  +" metros-----------------------\n");		// muestra la entrada en pantalla
		
		double centimetros = centimetros(entrada); // almacena en variable centimetros el metodo centimetros, que es la conversion de metros a centimetros 

		System.out.println(entrada + " metros son: " + centimetros(entrada) + " centimetros");//muestra centimetros
		System.out.println(entrada + " metros son: " + milimetros(centimetros) + " milimetros");// muestra milimetros
		System.out.println(entrada + " metros son: " + pies(centimetros) + " pies");// muestra pies
		System.out.println(entrada + " metros son: " + pulgadas(centimetros) + " pulgadas");// muestra pulgadas
		System.out.println(entrada + " metros son: " + yardas(centimetros) + " yardas");// muestra yardas
		System.out.println(entrada + " metros son: " + aLuz(entrada) + " a�os luz");// muestra a�os luz
		System.out.println(entrada + " metros son: " + angs(entrada) + " Ansgtroms");// muestra Angstroms
		
		leer.close();// cierra clase Scanner	
	}//cierra metodo main	
	
	static double centimetros(double entrada) {		// metodo centimetros para calcular mts a cms
		return entrada * 100;		
	}
	static double milimetros(double centimetros) {	//metodo milimetros para calcular cms hallados anteriormente a mms
		double milimetros = centimetros * 10;
		return milimetros; 
	}
	static double pies(double centimetros) {	//metodo pies para calcular cms hallados anteriormente a pies
		double pies = centimetros / 30.48;  
		return pies;
	}
	static double pulgadas(double centimetros) {	//metodo pulgadas para calcular cms hallados anteriormente a pulgadas
		double pulgadas = centimetros / 2.54;
		return pulgadas;
	}
	static double yardas(double centimetros) {	//metodo yardas para calcular cms hallados anteriormente a yardas
		double yardas = centimetros / 91.44;
		return yardas;
	}
	static double aLuz(double entrada) { //metodo a�os luz para calcular mts a a�os luz
		double aLuz = entrada / (9.460528405 * 10E14);
		return aLuz;
	}
	static double angs(double entrada) {	//metodo Angstroms para calcular mts a Angstroms
		double angs = entrada / (1.0E-10);
		return angs;
	}

}// cierra clase de programa 