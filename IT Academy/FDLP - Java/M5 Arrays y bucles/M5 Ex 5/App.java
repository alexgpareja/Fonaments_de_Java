import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class
public class App {
	
public static void main(String[] args) { //the main method 
	Scanner input = new Scanner(System.in); //crea un scanner object
	
		
	String nombre;
	int edad;
	String tituloUni;
	String paro;
	
	ArrayList <String> listaBecados = new ArrayList();
	
	
	
		int alumnosBecados = 0;
		while (alumnosBecados<6) {
			
			System.out.println("Como te llamas?");
	        nombre = input.nextLine();
			
	        System.out.println("Cuantos años tienes?");
	        edad = input.nextInt();
			input.nextLine();
			
	        System.out.println("Dispones de titulo universitario? (responder con si o no)");
	        tituloUni = input.nextLine();
	        
	        System.out.println("Estas en paro? (responder con si o no)");
	        paro = input.nextLine();
	        
	        
	        
	        		if ( 
	        			((edad>=18) && tituloUni.equalsIgnoreCase("si") ) 
	        			|| ((edad>=18) && paro.equalsIgnoreCase("si"))  
	        		)
	        		{
							System.out.println("Tienes acceso a la beca");
						
							listaBecados.add(nombre);
							alumnosBecados++;
					}
	        		
	        		else   {  
	      			  System.out.println("No tienes acceso a la beca");
	      		  }
	        
	        		if (alumnosBecados>=5) {
	        			
	        			System.out.println(listaBecados.get(alumnosBecados));
	        		}
	      
	        
		}
	
	

	
	
		  
}


	
}
	
