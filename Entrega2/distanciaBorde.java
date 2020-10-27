package entrega2_progCom;
import java.util.Scanner;
public class distanciaBorde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("------------------Distancia al Borde ----------------\n"); // T�tulo del programa
		// Explicacion del programa
		System.out.println("Mediante este programa usted puede calcular la menor distancia que debe viajar para alcanzar la frontera del rectangulo\n");
		// Declaracion de variables.
		int rLargo, rAncho, area,x,y,ver;

		System.out.print("--------- Ingresa el largo del rectangulo (a) : ");// solicita entrada
		rLargo = leer.nextInt();// lee la entrada
		System.out.print("--------- Ingresa el ancho del rectangulo (b) : ");// solicita entrada
		rAncho = leer.nextInt();// lee la entrada
		area = areaRectangulo(rLargo,rAncho);
		System.out.println("\nEl area del rectangulo es: ..."+area+"...\n");
		System.out.println("Que corresponde a los vertices:\n(0,0)\n("+rLargo+",0)\n("+rLargo+","+rAncho+")\n(0,"+rAncho+")\n");
		System.out.print("--------- Ingresa una coordenada en X de acuerdo a las especificaciones anteriores: ");// solicita entrada
		x = leer.nextInt();
		System.out.print("--------- Ingresa una coordenada en y de acuerdo a las especificaciones anteriores: ");// solicita entrada
		y = leer.nextInt();
		ver = coordenadas(x,y,rLargo,rAncho);
		
	leer.close();
	}//cierra metodo main	
	// funcion area del rectangulo 
	public static int areaRectangulo(int a, int b) {
		int area = a * b;
		return area;
	}
	// funcion para evaluar las coordenadas ingresadas 
	public static int coordenadas(int a, int b, int x, int y) {
		int x1 = x/2;
		int y1 = y/2;
		
		if(a>x || b>y) {
			System.out.print("...Error al ingresar coordenadas...\n...Fuera del rectangulo...\n...Por favor ingrese datos validos...\n");
		}else{
			System.out.print("La coordenada ingresada es: ("+a+","+b+")\n");			
			if(a<x1 && b<y1) {
				System.out.println("La frontera mas cercana:");
				System.out.println("El en eje X: "+ a + " espacios hacia la izquierda");
				System.out.println("El en eje Y: "+ b + " espacios hacia abajo");
			}else if(a>x1 && b>y1) {
				System.out.println("La frontera mas cercana:");
				System.out.println("El en eje X: "+ (x-a) + " espacios hacia hacia la derecha ");
				System.out.println("El en eje Y: "+ (y-b) + " espacios hacia arriba");
			}else if(a<x1 && b>y1) {
				System.out.println("La frontera mas cercana:");
				System.out.println("El en eje X: "+ a + " espacios hacia hacia la izquierda ");
				System.out.println("El en eje Y: "+ (y-b) + " espacios hacia arriba");
			}else if(a>x1 && b<y1) {
				System.out.println("La frontera mas cercana:");
				System.out.println("El en eje X: "+ (x-a) + " espacios hacia hacia la derecha ");
				System.out.println("El en eje Y: "+ b + " espacios hacia abajo");
			}
		}
		return a;
	}


}//cierra clase 
