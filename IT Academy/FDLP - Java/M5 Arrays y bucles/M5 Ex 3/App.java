import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numeroRandom = Math.ceil((Math.random() * 10));
		
		
			Scanner input = new Scanner(System.in);
			
			System.out.println("Dime un numero del 1 al 10");
			int numeroUsuario = input.nextInt();
		
	
		
					while (numeroRandom != numeroUsuario) {
						System.out.println("Dime un numero del 1 al 10");
						numeroUsuario = input.nextInt();
		
					}
			
			System.out.println("Enhorabona, el numero era " + numeroRandom);
		

		
	}
	
	

	
	
	
	

}
