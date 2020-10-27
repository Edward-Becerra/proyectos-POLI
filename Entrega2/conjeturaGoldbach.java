package entrega2_progCom;
import java.util.Scanner;
public class conjeturaGoldbach {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("------------------ Conjetura de Goldbach ----------------\n"); // Titulo del programa
			// Explicacion del programa
			System.out.println("Demostracion de la conjetura de Goldbach para N numero\n");
			// Declaracion de variables.
			int numero, primo1=0, primo2=0;
			boolean num = false;
			System.out.print("--------- Por favor digite un numero PAR  mayor que 2 : ");// solicita entrada
			numero = sc.nextInt();// lee la entrada
			if(numero<=2 || numero%2 != 0)
				System.out.print("--------- Numero ingresado no es valido ------------");
			else {
				do {
					for (int n1=0; (n1<numero && num==false); n1++) {					
						if (verPrimo(n1) && n1%2 != 0){
							for (int n2=0; (n2<numero && num==false); n2++) {
								if (verPrimo(n2) && n2%2 != 0) {	
									if (n1 + n2 == numero) {
										primo1 = n1;
										primo2 = n2;
										num = true;
									}
								}
							}
						}
					}
				}
				while (num == false);
				if (num) {
					System.out.println(" La conjetura de Goldbach para el n�mero " + numero + " = " + primo1 + " + " + primo2);
					}else {
						System.out.println("La conjetura de Goldbach no se cumple para el n�mero " + numero);
					}
					
				}
			 sc.close();
			 }// cierra metodo main
         

	
// funcion para hallar numero primo 
    public static boolean verPrimo(int valor) {
		boolean primo = false;
		int contador = 0;//Contador de divisores		
		for (int i = 1; i <= valor; i++) {
			if (valor%i == 0) {
				contador++;
			}
		}		
		if (contador <= 2) {
			primo = true;
		}else 
			primo = false;		
		return primo;
	}
	}//cierra clase

