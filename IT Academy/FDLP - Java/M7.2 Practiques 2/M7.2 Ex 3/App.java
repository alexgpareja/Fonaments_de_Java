import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numFilas = pedirInt("Cuantas lineas quieres imprimir?");
		String userSimbolo = pedirString("Pon el simbolo a utilizar");
		dibujarTriangulo(numFilas, userSimbolo);
		dibujarTrianguloInvertido(numFilas-1, userSimbolo);
	}
	
	
	static int pedirInt(String texto)	{
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		int n2 = input.nextInt();
		return n2;	
	}
	
	static String pedirString(String texto)	{
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		String n2 = input.nextLine();
		return n2;	
	}
	
	static void dibujarTriangulo(int numFilas, String userSimbolo) {
		
		
		for (int filas = 1; filas<=numFilas; filas++ ){  //rows filas
			
			for (int columnas = 1; columnas<filas; columnas++) { //columns
				
				System.out.print(userSimbolo + " ");
			}
			
			System.out.println(userSimbolo + " ");
			
			/* i = 1 = *
			 * i = 2 = **
			 * i = 3 = ***
			 * i = 4 = ****
			 */
		}
	}
	
	static void dibujarTrianguloInvertido(int numFilas, String userSimbolo) {
		
		
		for (int filas = 1; filas<=numFilas; filas++ ){  //rows filas
			
			for (int columnas = filas; columnas<numFilas; columnas++) { //columns
				
				System.out.print(userSimbolo + " ");
			}
			
			System.out.println(userSimbolo + " ");
		}
		
		/* i = 4 = ****
		 * i = 3 = ***
		 * i = 2 = **
		 * i = 1 = *
		 */
	}
	
	

}
