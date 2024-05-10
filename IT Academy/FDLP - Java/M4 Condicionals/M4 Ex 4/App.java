import java.util.Scanner;  // Import the Scanner class
public class App {
	
	public static void main(String[] args) { //the main method
	
		Scanner input = new Scanner(System.in); //crea un scanner object
		  
		
		  System.out.println("¿Que mes quieres saber cuantos dias tiene?");
		  
		  String mes = input.nextLine();
		  
		  String mesMinuscula = mes.toLowerCase();
		  
		  
		  
			  switch(mesMinuscula) {
			  
			  case ("enero"):
			    System.out.println("Enero tiene 31 dias");			    
			    break;
			  
			  case "febrero":
				    System.out.println("Febrero tiene 28 dias");			    
				break;
				    
			  case "marzo":
				    System.out.println("Marzo tiene 31 dias");			    
				break;
				    
			  case "abril":
				    System.out.println("Abril tiene 30 dias");			    
				break;
				    
			  case "mayo":
				    System.out.println("Mayo tiene 31 dias");			    
				break;
				    
			  case "junio":
				    System.out.println("Junio tiene 30 dias");			    
				break;
				    
			  case "julio":
				    System.out.println("Julio tiene 31 dias");			    
				break;
				    
			  case "agosto":
				    System.out.println("Agosto tiene 31 dias");			    
				break;
				    
			  case "septiembre":
				    System.out.println("Septiembre tiene 30 dias");			    
				break;
				    
			  case "octubre":
				    System.out.println("Octubre tiene 31 dias");			    
				break;
				    
			  case "noviembre":
				    System.out.println("Noviembre tiene 30 dias");			    
				break;
				    
			  case "diciembre":
				    System.out.println("Diciembre tiene 31 dias");    
				break;
			  
			  
			  default:
				  System.out.println("Este mes no existe, por favor introduce un mes válido");
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	private static void toLowerCase(String mes) {
		// TODO Auto-generated method stub
		
	}
}
