import java.util.Scanner;  // Import the Scanner class
public class App {
	
	  public static void main(String[] args) { //the main method
		  
		  Scanner input = new Scanner(System.in); //crea un scanner object
		  
	
		  System.out.println("¿Eres mayor de edad?"); // preguntamos al user su edad
		  
		  String edad = input.nextLine(); //Java lee un numeral input
		  
		  //input.nextLine(); //clean buffer
		  
		  
		  System.out.println("¿Tienes titulo universitario?");
		  
		  String tituloUni = input.nextLine();
		  
	
		  
		  System.out.println("¿Estás en paro?");
		  
		  String paro = input.nextLine();
		  
		  
		
		  
		  
		  if 	( 
				  (edad.equalsIgnoreCase("si") && tituloUni.equalsIgnoreCase("si")) 
				  
				|| (edad.equalsIgnoreCase("si") && paro.equalsIgnoreCase("si"))
						)
				
						{
			  
			  System.out.println("Tienes acceso a la beca");  
			  
		  }
		  
		  else   {  
			  
			  System.out.println("No tienes acceso a la beca");
		 
		  }
		  
		
		  
	  }	  
		 
		  
	
 }

