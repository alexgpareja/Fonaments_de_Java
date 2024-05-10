import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numFilas = pedirInt("Cuantas lineas quieres imprimir?");
		dibujarTrianguloInvertido(numFilas);
	}
	
	
	static int pedirInt(String texto)	{
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		int n2 = input.nextInt();
		return n2;	
	}
	
	
	static void dibujarTrianguloInvertido(int numFilas) {
		
		Scanner input = new Scanner(System.in);
		String userSimbolo;
		System.out.println("Pon el simbolo a utilizar");
		userSimbolo = input.nextLine();
		
		for (int i = 1; i<=numFilas; i++ ){  //rows filas
			
			for (int j = i; j<numFilas; j++) { //columns
				
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
