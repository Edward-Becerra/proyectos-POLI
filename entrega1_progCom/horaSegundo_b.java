package entrega1_progCom;
import java.util.Scanner;// Importar librer�a Scanner 

public class horaSegundo_b { // definici�n del la clase 
	public static void main (String[]args) { // inicio del m�todo main
		Scanner leer = new Scanner(System.in);		
		
		// Explicaci�n del programa
		System.out.println("Mediante este programa usted puede calcular la cantidad de segundos que han transcurrido el dia de hoy....\n");
		// el programa se va ejecutar hasta que el usuario ingrese valores incorrectos o no validos 
		boolean fin = true;
		int horas,minutos,segundos,sTotal;
		String error = null, formato = null;
		do {
			// T�tulo del programa
			System.out.println("----------Bienvenido----------\n");
			formato(formato);			
			// pide al usuario horas			
				System.out.println("----------Ingrese las horas que quiere calcular:   ----------\n");			
				horas = leer.nextInt();
				// Evalua si el valor ingresado es valido, de lo contrario muestra mensaje de error al usuario
					if (horas >= 0 && horas <= 23) {	
						System.out.println("Ud ingres� : " + horas + " horas\n" );
						}else{
							errorIngreso(error);
							fin=false;
							return;
						}

			// pide al usuario minutos
				System.out.println("----------Ingrese las minutos que quiere calcular:   ----------\n");			
				minutos = leer.nextInt();
				// Evalua si el valor ingresado es valido, de lo contrario muestra mensaje de error al usuario
					if (minutos >= 0 && minutos <= 59) {
						System.out.println("Ud ingres� : " + minutos + " minutos\n" );
						}else{
							errorIngreso(error);
							fin = false;
							return;
						}
				// pide al usuario minutos
				System.out.println("----------Ingrese las segundos:   ----------\n");	
				segundos = leer.nextInt();
				// Evalua si el valor ingresado es valido, de lo contrario muestra mensaje de error al usuario
					if (segundos >= 0 && segundos <= 59) {								
							 System.out.println("-----------------La hora ingresada es : " + horas  + ":"+ minutos +":"+ segundos + "--------------\n");
							 sTotal = conversionSegundos(horas,minutos,segundos); //Almacena en la variable "sTotal" la funcion de conversion
							 imprimir(sTotal); // Llamado a la funcion imprimir									
							}else{
								errorIngreso(error);
								fin = false;
								return;
							}
				leer.close();// cierra clase Scanner	
			 }while(fin);	// condicion ciclo while 
		
	}// Cierra m�todo main
	
	// Funcion para convertir hora local en segundos	
			public static int conversionSegundos(int h,int m,int s) {
				int seg = (h*60*60)+(m*60)+ s;
				return seg;
			}
	// Funcion para imprimir resultados
			public static void imprimir(int seg) {
				System.out.println("La cantidad de segundos transcurridas hoy es de: " + seg + "\n"); // mensaje final
			}
	 // Funcion para imprimir mensaje de error
			public static void errorIngreso(String e1) { 
				e1=".... valor ingresado no es v�lido....\n.... maxima hora para un dia : 23:59:59 ....\n.... Por favor ingrese un numero valido....\n";
				System.out.println(e1);
			}
	 // Funcion para imprimir mensaje de error
			public static void formato(String f1) { 
				f1="--------- Hora a Segundos ----------\n----- el formato es hh:mm:ss -----\n----- maxima hora para un dia : 23:59:59 -----\n";
				System.out.println(f1);
			}
}// Cierra clase 