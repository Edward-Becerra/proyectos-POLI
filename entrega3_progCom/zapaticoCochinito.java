package entrega3_progCom;
import java.util.Scanner;

public class zapaticoCochinito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("...Zapatico Cochinito...\n");
		Scanner leer = new Scanner(System.in);
		 System.out.println("Ingresa la cantidad de ninos en el juego: ");
		 int i = leer.nextInt();
		 String [] ninos = new String[i];
		 int azar, cant=0;
		 
		// Solicitando los nombres según la dimensión ingresada
		 for (int j = 0; j < i; j++) {
		 System.out.println("Ingresa el nombre del nino para la posición "+j+" del juego");
		 String val = leer.next();
		 ninos[j] = val;
		 }
		 System.out.println("--------------------------");
		//Recorriendo el Arreglo
		 System.out.println("Estos son los ninos en el juego: ");
		 for (int j = 0; j < i; j++) {
		 System.out.println("Nino en la posicion  "+j+" : "+ninos[j]);
		 }
		 System.out.println("--------------------------");
		 while(cant < i) {
			 azar = (int)(Math.random()*i);
			 System.out.println("Numero generado: " + azar);
			 ninos[azar] = null;
			 cant++;
		 }
		 System.out.println("--------------------------");
		 for (int j = 0; j < i; j++) {
			if(ninos[j] != null) {
				System.out.println("lava la loza el nino de la posicion  "+j+" : "+ninos[j]);
			} 
		 }

		leer.close();
	}// cierra metodo main

}// cierra clase
