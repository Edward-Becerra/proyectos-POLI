package entrega2_progCom;
import java.util.Scanner;
public class numerosPrimos {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("------------------ Numeros primos ----------------\n"); // T�tulo del programa
			// Explicacion del programa
			System.out.println("Mediante este programa usted puede observar si el numero ingresado es primo o no\n");
			// Declaracion de variables.
			int numero;
			System.out.print("--------- Por favor digite un numero : ");// solicita entrada
			numero = sc.nextInt();// lee la entrada
			primo(numero);
			
		sc.close();
	}//cierra metodo main	
	// funcion primo 
	public static int primo(int a) {
		int num = 0,i;
		
		for (i = 1;i <= a; i++) {
				if(a % i == 0) {
					num++;
				}
			}
			if(num != 2) {
				System.out.print("................"+a+" NO es primo................");
			}else {
				System.out.print("................"+a+" ES primo................");
			}
		return a;
	}
}// cierra clase
