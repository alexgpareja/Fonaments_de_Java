import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroRandom = (int)(Math.random()*10);
		
		Scanner input = new Scanner(System.in);
		
			
		System.out.println(numeroRandom);	

		System.out.println("Dime un numero del 1 al 10");
		
		int numeroUsuario = input.nextInt();
		
		
			for (int contador = 1;   contador <=5;   contador++ ) {
				
			
				
				
					if (numeroUsuario == numeroRandom ) {
						
						System.out.println("El numero es " + numeroRandom + " y has usado " + contador + " intentos");
						
					}
					
					
					else  {
						
						System.out.println("Numero equivocado, dime un numero del 1 al 10");
						numeroUsuario = input.nextInt();
						
					}
				

					if (contador>5)	{
						
						System.out.println("Gastaste todos los intentos, el numero era " + numeroRandom);
					}
			
							
					
				
			}
			
			
	
	
	
		

		
	}
	
}	
