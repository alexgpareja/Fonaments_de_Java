import java.util.Scanner;  // Import the Scanner class
public class App {
	
	  public static void main(String[] args) { //the main method
		  
		  Scanner input = new Scanner(System.in); //crea un scanner object
		  
	
		  System.out.println("Por favor, introduzca su edad"); // preguntamos al user su edad
		  
		  int edad = input.nextInt(); //Java lee un numeral input
		  
		  if ( edad <=5) {
			  
			System.out.println("Vas a preescolar.");
			  
		  }	 
		  
		  else if (edad >=6 && edad <=11)
			  
			  System.out.println("Vas a primaria.");  
		  
		  else if (edad >=12 && edad <=15)
			  
			  System.out.println("Vas a la ESO.");
		  
		  else if (edad >=16 && edad <=17)
			  
			  System.out.println("Vas a bachillerato.");
		  
		  else {
			  
			  System.out.println("Vas a FP o universidad.");
		  }
			  
		  
	

	  }
}	  
