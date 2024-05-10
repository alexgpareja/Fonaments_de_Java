import java.util.ArrayList;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
	
		int numeros = pedirInt("Cuantos números quieres añadir al array?");
		bucle(numeros);
	
	
	}
	
	
	static int pedirInt(String texto)	{
		
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;
	}
	
	
	static void bucle(int numeros) {
		
		int userNum;
		int sumaPar = 0;
		int sumaImpar = 0;
		for (int i = 0; i < numeros; i++) {
			
			userNum = pedirInt("Ingresa un número");
			
			if (userNum % 2 == 0) {
				sumaPar = userNum + sumaPar;
			}
			
			else {
				sumaImpar = userNum + sumaImpar;
			}	
		}
		
		System.out.println("La suma de pares es " + sumaPar);
		System.out.println("La suma de impares es " + sumaImpar);
	}
	
	

}
