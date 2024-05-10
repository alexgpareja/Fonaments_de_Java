import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numEnter1;
		int numEnter2;
		int result = 0;
		
		Scanner input = new Scanner (System.in);
		
		
			System.out.println("Pon el primer número");
		
			numEnter1 = input.nextInt();
			
			
			System.out.println("Pon el segundo número");
			
			numEnter2 = input.nextInt();
			
			
			for (   int contador = numEnter1    ;   contador <= numEnter2   ;  contador++    ) {
				
					
				result = result + contador;
				
				}
		
		
			System.out.println(result);	
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
