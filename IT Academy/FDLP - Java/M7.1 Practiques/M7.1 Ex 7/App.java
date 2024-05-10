import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String caracter = pedirString("Introduce un caracter");
		int numero = pedirInt("Introduce un numero");
		dibujoCuadrado(caracter, numero);
	}

	
	
	
	static String pedirString(String texto)	{
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		String n1 = input.nextLine();
		return n1;	
	}
	
	static int pedirInt(String texto)	{
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		int n2 = input.nextInt();
		return n2;	
	}
	
	static void dibujoCuadrado(String caracter, int numero) {
		
		for (int i = 1; i<=numero; i++ ){
			
			for (int j = 1; j<=numero; j++) {
				
				System.out.print(caracter);
			}
			
			System.out.println(caracter);
		}
		
		
	}
	
		
	
	
}
