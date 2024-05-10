
import java.util.Scanner;  // Import the Scanner class
public class App {
	
	  public static void main(String[] args) { //the main method
		  
		  Scanner input = new Scanner(System.in); //crea un scanner object
		  
		  System.out.println("¿Cual es tu nombre?"); //preguntamos al user su nombre
		  
		  String userName = input.nextLine(); //Java lee la respuesta del user
		  
		  System.out.println("¿Y tu apellido?"); //preguntamos al user su apellidos
		  
		  String userSurname = input.nextLine(); // Java lee la respuesta del user
		  
		  System.out.println("Introduce tu edad"); // preguntamos al user su edad
		  
		  int edad = input.nextInt(); //Java lee un numeral input
		  
		  //Ahora las respuestas las imprimimos en pantalla
		  
		  System.out.println("Tu nombre es " + userName + " " + userSurname); //sumo la respuesta del userName y el userSurname para tener nombre y apellido juntos
		  System.out.println("Tienes " + edad + " años");
		  System.out.println("Gracias por tus datos");
		  
		  
		  
	  }

}
