package entrega1_progCom;
import java.util.Scanner;

public class ascci {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		for(char i=0;i<255; i++) {
			System.out.println(i + "   =   " + (int)i );
		}// Ciclo for para ver los codigos ASCCI
		// llamado a la funcion 
		gato();
	}// cierra metodo main
	// funcion para imprimir el codigo ASCCI
public static void gato() {
	System.out.println((char)9+"           "+(char)95+""+(char)95+""+(char)95+""+(char)95);
	System.out.println((char)9+""+(char)9+" "+(char)40+" "+(char)109+""+(char)101+""+(char)111+""+(char)119+""+(char)33+" "+(char)41);
	System.out.println((char)9+""+(char)124+""+(char)92+""+(char)95+""+(char)95+""+(char)47+""+(char)124+"    "+(char)41+""+(char)47+""+(char)173+""+(char)173+""+(char)173+""+(char)173+""+(char)173);
	System.out.println("        "+(char)40+""+(char)95+" "+(char)94+""+(char)173+""+(char)94+""+(char)41);
	System.out.println("   "+(char)95+"    "+(char)41+"    "+(char)40);
	System.out.println((char)40+""+(char)40+"     "+(char)47+"      "+(char)92+"          "+(char)40+" "+(char)40+" "+(char)40);
	System.out.println(" "+(char)40+"  "+(char)41+"   "+(char)124+""+(char)124+"   "+(char)124+""+(char)124+"           "+(char)41+" "+(char)41+" "+(char)41);
	System.out.println(" "+(char)44+"   "+(char)44+"  "+(char)44+""+(char)44+"   "+(char)44+""+(char)44+"           "+(char)40+" "+(char)40+" "+(char)40);
	
	System.out.println(" "+(char)175+""+(char)175+""+(char)175+""+(char)175+"   "+(char)175+""+(char)175+"   "+(char)175+""+(char)175+ "           "+(char)187+""+(char)43+""+(char)43+""+(char)43+""+(char)176+""+(char)62);
	
}
}// cierra clase 
