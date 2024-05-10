import java.util.Scanner;  // Import the Scanner class
public class App {
	
	  public static void main(String[] args) { //the main method
		  
		  Scanner input = new Scanner(System.in); //crea un scanner object
		  
		  System.out.println("Dime un número"); //preguntamos al user un numero
		  
		  int userNumA = input.nextInt(); //java lee el numeral input A escrito por el user
		  float decimalUserNumA = userNumA; //convierto su respuesta entera a decimal
		  
		  System.out.println("Dime otro número"); //preguntamos otro num a user
		  
		  int userNumB = input.nextInt(); // java lee el numeral input b del user
		  float decimalUserNumB = userNumB; //convierto su respuesta entera a decimal
		  
		  System.out.println("Un último número va"); //preguntamos otro num a user
		  
		  int userNumC = input.nextInt(); // java lee el numeral input c del user
		  float decimalUserNumC = userNumC; //convierto su respuesta entera a decimal
		  
		  float userNumSuma = decimalUserNumA + decimalUserNumB + decimalUserNumC;
		  
		  //Ahora imprimimos en pantalla
		  
		  System.out.println("La media es " + (userNumSuma / 3));
		  
		  
	  }
}	  
	  