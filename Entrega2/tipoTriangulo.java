package entrega2_progCom;
import java.util.Scanner;
public class tipoTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------Calcular tipo de Triangulo por la longitud de sus lados ----------------\n"); // T�tulo del programa
		// Explicacion del programa
		System.out.println("Mediante este programa usted puede calcular el tipo de triangulo de acuerdo a la longitud de sus lados\n");
		// Declaracion de variables.
		boolean fin, opc;
		int num1,num2,num3,tipo; 
		
		do {
			System.out.print("--------- Ingresa la longitud del PRIMER lado : ");// solicita entrada
			num1 = sc.nextInt();// lee la entrada 
			System.out.print("--------- Ingresa la longitud del SEGUNDO lado : ");// solicita entrada
			num2 = sc.nextInt();// lee la entrada
			System.out.print("--------- Ingresa la longitud del TERCER lado : ");// solicita entrada
			num3 = sc.nextInt();// lee la entrada
			
			tipo = triangulo(num1,num2,num3); // llamado a funcion para conocer si es par o impar 
			
			System.out.println("--------- quieres cambiar la longitud de los lados ? -----------------------\n");// solicita entrada
			System.out.println("1. Si/true\n2. No/false\n");// solicita entrada
			opc = sc.nextBoolean();
			
			fin=opcion(opc);// llamado funcion evaluacion fin programa 
			
		}while(fin);//condicion while
        
	sc.close(); //cierra instancia objeto Scanner
	}// cierra metodo main
	
	//Funcion para hallar el  tipo de triangulo 
	public static int triangulo (int n1,int n2, int n3) {
		if(n1 == n2 && n1 == n3 ) {	    	  
			System.out.println("\nLos lados ingresados corresponden a un triangulo EQUILATERO\n");			
		}else if(n1 == n2 || n1 == n3 || n2 == n3){
			System.out.println("\nLos lados ingresados corresponden a un triangulo ISOSCELES\n");			
	    }else{
			System.out.println("\nLos lados ingresados corresponden a un triangulo ESCALENO\n");
			}
		return n1;
	}
	
	//funcion booleana fin programa
	public static boolean opcion (boolean o) {
		if(o) {
			return o = true;
		}else {
			System.out.println(".........Eso es todo !!!........");
			return o = false;
		}
	}

}//Cierra clase

