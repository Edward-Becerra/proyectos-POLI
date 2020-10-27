package entrega1_progCom;
import java.util.Scanner; // importar libreria 

public class ofertas{ // inicia la clase ofertas
	public static void main(String[]args) { // inicia metodo main 
	
		Scanner leer = new Scanner(System.in); // se  instancia  la clase scanner 
		System.out.println("------------------Programa Ofertas----------------\n"); // T�tulo del programa
		// Explicaci�n del programa
		System.out.println("Mediante este programa usted puede calcular en que tienda Belen puede comprar 3 camisetas por el menor precio\n");
		boolean fin  = false;
		do{
			
			System.out.println("-------------------Digite el valor de precios de :\nA\nB\nC\n-----------------------\n");// solicita entrada
			// captura entradas de A,B,C
			double a = leer.nextDouble();
			double b = leer.nextDouble();
			double c = leer.nextDouble();
			// declaracion de algunas variables que se van a usar a lo largo del programa
			double promo_1 = 3*a;
			double promo_2 = (3*b)- b;	
			String a1 = "ShopStore";
			String b1 = "AdiStore";
			String c1 = "ArtStore";
			
			
			System.out.println("-------------------Digite el valor de descuento (D) -----------------------\n");// Mensaje solicita entrada
			double d = leer.nextDouble(); // captura entrada D
			
			double total_1 = (promo_1- shopStore(a,d));
			double total_2 = 2*b;
			double total_3 = 3*c;
			
			//System.out.println("--------Precios:\nA: "+a+"\nB: "+b+"\nC: "+c+"\n-----------------------\n");
			//System.out.println("-------------------El descuento D es: " + d + "-----------------------\n");
			System.out.println("-----------------------------------------Escoje una opcion: ---------------------------------------------");
			System.out.println("1. Ir a " + a1);
			System.out.println("2. Ir a " + b1);
			System.out.println("3. Ir a " + c1);		
			System.out.println("4. Conocer el menor precio a pagar por 3 Camisetas ");
			int opcion = 0;
			opcion = leer.nextInt();// Captura opcion del usuario 		

			switch (opcion){// evalua opciones 
			case 1:
		
					System.out.println(a1);
					System.out.println("-------------------Bienvenido a ShopStore -----------------------\n");
					System.out.print("Por la compra de 3 camisetas de: $"+ a +" recibe un descuento de: " + d + "% en el valor total de la compra.\n");
					System.out.println("El precio de 3 camisetas es : $"+ promo_1 +"\nMenos el descuento: $" + shopStore(a,d));
					System.out.println("El total a pagar en "+ a1 + " es de: $" + total_1);
					System.out.println("---------------------------------------------------------------------");

			break;
			case 2:
				
				System.out.println(b1);
				System.out.println("-------------------Bienvenido a AdiStore-----------------------\n");
				System.out.print("Por la compra de 2 camisetas de: $"+ b +" lleva OTRA completamente Gratis!!!\n");
				System.out.println("El precio de 3 camisetas es normalmente: $"+ (3*b) +"\nAhorra: $" + adiStore(promo_2,b));
				System.out.println("El total a pagar en "+ b1 + " es de: $" + total_2 );
				System.out.println("---------------------------------------------------------------------");
				
			break;
			case 3:
				
				System.out.println(c1);
				System.out.println("-------------------Bienvenido a ArtStore-----------------------\n");// solicita entrada
				System.out.println("------��� Lleva las mejores prendas exclusivas de moda al mejor precio!!!! -----------------------\n");// solicita entrada
				System.out.println("El precio de 3 camisetas es : $"+ c );
				System.out.println("El total a pagar en "+ c1 + " es de: $" + total_3 );
				System.out.println("---------------------------------------------------------------------");
				
			break;
			case 4: 
				
				System.out.println("A continuacion la tienda donde pagaria menos por 3 camisetas con los precios ingresados");
				System.out.println("---------Precios---------\nA: $"+a+"\nB: $"+b+"\nC: $"+c+"\n-----------------------\n");
				System.out.println("El total a pagar por 3 camisetas en "+ a1 + " es de: $" + total_1);
				System.out.println("El total a pagar por 3 camisetas en "+ b1 + " es de: $" + total_2);
				System.out.println("El total a pagar por 3 camisetas en "+ c1 + " es de: $" + total_3);
				System.out.println("---------------------------------------------------------------------");
				double menorP = 0;
					if(total_1 < total_2 && total_1 < total_3) {
						menorP = total_1;
						System.out.println("El menor precio a pagar es: $" + total_1 + " que corresponde a " + a1 );
						System.out.println("---------------------------------------------------------------------");
					}else if(total_2 < total_1 && total_2 < total_3) {
						menorP = total_2;
						System.out.println("El menor precio a pagar es: $" + total_2 + " que corresponde a " + b1 );
						System.out.println("---------------------------------------------------------------------");
					}else if (total_3 < total_1 && total_3 < total_2) {
						menorP = total_3;
						System.out.println("El menor precio a pagar es: $" + total_3 + " que corresponde a " + c1 );
						System.out.println("---------------------------------------------------------------------");
					}				
			break;
			default: 
				System.out.println("------Opcion invalida---------");
			break;
		}//cierra switch				
        
		System.out.print("Quieres probar con otros precios?\n1.Si\n2.No\n");
		int opc = leer.nextInt();
		
		if(opc == 1) {
			fin = true;
		}else if(opc == 2) {
			fin = false;
		}else {
			System.out.println("------Opcion invalida---------");
		}
		}while(fin); //fin ciclo while		
		System.out.println("\n-------------------Eso es todo!------------------");	// fin del programa
	leer.close(); // Cierra instancia Clase Scanner 
		
	}//cierra metodo main
	
	//Metodo ShopStore para calcular el descuento en la tienda 1
	static double shopStore(double promo_1, double d) { 
		return (promo_1*(d/100));
	}
	//Metodo AdiStore para calcular el ahorro en la tienda 2
	static double adiStore(double promo_2, double b) {
		return (b*3) - promo_2 ; 
		}

}//cierra clase programa