import java.util.Scanner;  // Import the Scanner class
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in); //crea un scanner object	
		
		
		System.out.println("Dime el primer numero");
		
		double num1 = input.nextDouble();
		
		
		System.out.println("Pon el signo de la operación que quieres hacer");
		
		input.nextLine();
		
		String operacion = input.nextLine();
		
		
	
		
		System.out.println("Dime el segundo numero");
		
		double num2 = input.nextDouble();
		
		
		
		 switch (operacion) {
		  
		  case "+":
		    System.out.println("La suma es " + (num1 + num2));			    
		    break;
		    
		    
		  case "-":
			    System.out.println("La resta es " + (num1 - num2));		
		 
			    break;
		
			    
		  case "*":
			    System.out.println("La multiplicación es " + (num1 * num2));			    
			    break;
			    
			    
		  case "/":
			    System.out.println("La multiplicación es " + (num1 / num2));			    
			    break;
			    
		  default:
			    System.out.println("Prueba con otra operación");
		
		 
		 
		 }
		
		
		
		
	
		
		
		
		
	}

}
