import java.util.Scanner;  // Import the Scanner class
public class App {
	
	  public static void main(String[] args) { //the main method
		  
		  Scanner input = new Scanner(System.in); //crea un scanner object
		  
		  System.out.println("Dime un número"); //preguntamos al user un numero
		  
		  int userNumA = input.nextInt(); //java lee el numeral input A escrito por el user
		  
		  System.out.println("Dime otro número"); //preguntamos otro num a user
		  
		  int userNumB = input.nextInt(); // java lee el numeral input b del user
		  
		  //Ahora imprimimos en pantalla posibles resultados
		  
		  
		  System.out.println("La suma es " + (userNumA + userNumB));
		  System.out.println("La resta es " + (userNumA - userNumB));
		  System.out.println("La multiplicación es " + (userNumA * userNumB));
		  System.out.println("La división es " + (userNumA / userNumB));
		  
	  }

}
