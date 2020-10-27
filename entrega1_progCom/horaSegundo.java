package entrega1_progCom;  
import java.time.LocalDateTime;// Importar la libreria Time

public class horaSegundo { // definicion del la clase 
	public static void main (String[]args) { // inicio del metodo main
		
		System.out.println("------Hora a Segundos------"); // Titulo del programa
		// Explicacion del programa
		System.out.println("Mediante este programa usted puede calcular la cantidad de segundos que han transcurrido el dia de hoy....");
		int horas, minutos, segundos,sTotal;
		LocalDateTime horaLocal = LocalDateTime.now(); // inicializar la instancia del metodo localdate
		horas  = horaLocal.getHour(); // almacena la hora en variable "horas" mediante getHour()
		minutos = horaLocal.getMinute(); // almacena minutos en varuable "minutos" mediante getMinute()
		segundos = horaLocal.getSecond(); // almacena segundos en variables "segundos" mediante getSecond()
		sTotal = conversionSegundos(horas,minutos,segundos); //Almacena en la variable "sTotal" la funcion de conversion
		
		System.out.println("La hora actual es:  " + horas  + ":"+ minutos +":"+ segundos); // mensaje de hora local 
		imprimir(sTotal); // Llamado a la funcion imprimir
		
		}// Cierra metodo main
	
		// Funcion para convertir hora local en segundos	
		public static int conversionSegundos(int h,int m,int s) {
			int seg = (h*60*60)+(m*60)+ s;
			return seg;
		}
		
		// Funcion para imprimir resultado 
		public static void imprimir(int seg) {
			System.out.println("La cantidad de segundos transcurridas hoy es de: " + seg); // mensaje final
		}
}// Cierra clase 