import java.util.Scanner;  // Import the Scanner class

public class App {

	
	public static void main(String[] args) {
	
	
			int numero1;
			int numero2;
			char operador;
			
	
	
		
		Scanner input = new Scanner(System.in); //crea un scanner object
		
		System.out.println("Dime el primer numero");
		
		numero1 = input.nextInt();
		
		System.out.println("Dime el segundo numero");
		
		numero2 = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Dame el operador");
		
		operador = input.nextLine().charAt(0);
		
		
		
		switch(operador) {
		
		case '+':
			System.out.println(sumar(numero1, numero2));
			break;
			
		
		case '-':
			System.out.println(restar(numero1, numero2));
			break;
			
		case '*':
			System.out.println(multiplicar(numero1, numero2));
			break;
		
		case '/':
			System.out.println(dividir(numero1, numero2));
			break;
	}
	
}
		static int sumar(int numero1, int numero2) {
		
		int resultado = numero1 + numero2;
		
		return resultado;
		
		}
			
	
	
	
		static int restar(int numero1, int numero2) {
		
		int resultado = numero1 - numero2;
		
		return resultado;
		
		}



		static int multiplicar(int numero1, int numero2) {
		
		return  numero1 * numero2;
		
		}
	
	
	
		static double dividir(int numero1, int numero2) {
		
		int resultado = numero1 / numero2;
		
		return (double)resultado;
		
		}

	
	

	
	
	
	
	
	
}	

