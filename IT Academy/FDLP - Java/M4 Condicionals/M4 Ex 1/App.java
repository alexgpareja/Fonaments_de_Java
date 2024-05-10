import java.util.Scanner;  // Import the Scanner class
public class App {
	
	  public static void main(String[] args) { //the main method
		  
		  Scanner input = new Scanner(System.in); //crea un scanner object
		  
		  System.out.println("Por favor, introduzca nombre y apellido"); //preguntamos al user su nombre
		  
		  String userName = input.nextLine(); //Java lee la respuesta del user
		  
		  
		  System.out.println("Por favor, introduzca su edad"); // preguntamos al user su edad
		  
		  int edad = input.nextInt(); //Java lee un numeral input
		  
		  if ( edad <=17) {
			  
			  System.out.println("Tu nombre es " + userName + ", eres menor de edad.");
			  
		  }
		  
		  else {
			  
			  System.out.println("Tu nombre es " + userName + ", eres mayor de edad.");
		  }
		    
		  
	  }

}
