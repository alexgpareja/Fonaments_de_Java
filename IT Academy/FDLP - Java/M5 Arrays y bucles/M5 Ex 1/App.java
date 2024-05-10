import java.util.ArrayList;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("¿Cuantos nombres quieres poner en la lista?");
		
		int numeroNombres = input.nextInt();
		
		input.nextLine();
		
		
		ArrayList<String> listaNombres = new ArrayList<String>();
		
		
			
			for (   int contador = 0    ;   contador < numeroNombres   ;  contador++    ) {
				
				
				System.out.println("Escribe el nombre que quieras añadir");
				listaNombres.add(input.nextLine());
				
				
				}
		
		
		
		System.out.println(listaNombres);
		
				
	}

}
