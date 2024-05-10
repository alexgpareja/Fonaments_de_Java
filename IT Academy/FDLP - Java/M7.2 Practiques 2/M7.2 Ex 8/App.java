import java.util.Scanner;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> sucesionFibonacci = new ArrayList<Integer>();
		int userNum = pedirInt("Introduce un número");
		int fibonacci = calculoSucesionFibonacci(userNum);
		//imprimirResultado(sucesionFibonacci);
	}

	
	static int pedirInt(String texto) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;	
	}
	
	
	static int calculoSucesionFibonacci(int userNum) {
		
		ArrayList<Integer> sucesionFibonacci = new ArrayList<Integer>();
		int a = 0;
		int b = 1;
		int c;
		
		for (int i = 0; i<userNum; i++) {
			
			System.out.println(a);
			sucesionFibonacci.add(a);
			c = a+b;
			a = b;
			b = c;
		}
		
		return a;
	}
	
	
	static void imprimirResultado(ArrayList<Integer> sucesionFibonacci) {
		
		System.out.println(sucesionFibonacci);
		
	}
}
