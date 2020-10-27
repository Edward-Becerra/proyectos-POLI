package entrega2_progCom;
import java.util.Scanner;
public class dardosGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("------------------Puntaje dardos ----------------\n"); // T�tulo del programa
		// Explicacion del programa
		System.out.println("Mediante este programa usted puede calcular el puntaje obtenido en el juego de dardos\n");
		// Declaracion de variables.
		double num1, num2, dist;
		int tiros = 0,puntos;
		do {
			System.out.print("--------- Ingresa la posicion del dardo en X : ");// solicita entrada
			num1 = leer.nextDouble();// lee la entrada
			System.out.print("--------- Ingresa la posicion del dardo en Y : ");// solicita entrada
			num2 = leer.nextDouble();// lee la entrada
			dist = distancia(num1, num2);
			puntos = radioDistancia(dist);			
			tiros++;			
		} while (tiros < 5);
		leer.close();
	}// cierra metodo main

	// funcion para conocer el radio
	public static double distancia(double x, double y) {
		double distancia;
		distancia = Math.hypot(x, y);
		//System.out.print("hipotenusa: " + distancia + "\n");
		return distancia;		
	}
	//funcion comparacion radio Distancia
	public static int radioDistancia(double p) {
		int puntaje = 0;
		if( p>=0 && p<=1) {
			puntaje = 15;
			System.out.print("CIRCULO ROJO\n");
			System.out.print("Puntos: " + puntaje+"\n");
		}else if (p>1 && p<=2) {
			puntaje = 9;
			System.out.print("CIRCULO NARANJA\n");
			System.out.print("Puntos: " + puntaje+"\n");
		}else if (p>2 && p<=3) {
			puntaje = 5;
			System.out.print("CIRCULO AMARILLO\n");
			System.out.print("Puntos: " + puntaje+"\n");
		}else if (p>3 && p<=4) {
			puntaje = 2;
			System.out.print("CIRCULO VERDE\n");
			System.out.print("Puntos: " + puntaje+"\n");
		}else if (p>4 && p<=5) {
			puntaje = 1;
			System.out.print("CIRCULO AZUL\n");
			System.out.print("Puntos: " + puntaje +"\n");
		}else {
			System.out.print("Puntos: 0..... dardo fuera del tablero...\n");
		}
		return puntaje;
	}
}// cierra clase
