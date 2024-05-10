import java.util.Scanner;
import java.util.ArrayList;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> edades = new ArrayList <Integer>();
		 
		
		//pedimos el numero de personas
		int personas = pedirInt("Introduce el numero de personas");
		
		//pedimos las edades
		edades = pedirEdades(personas);
		
		
		//acumulado de todas las edades
		int acumuladoEdades = acumulador(edades);
		
		
		//calcular la media
		double mediaEdades = media(acumuladoEdades, edades.size());
		
		//imprimir
		mensajeImprimir(mediaEdades);
		
	}	
		
		
	static int pedirInt(String texto)	{
		
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;
	}
		
		
	static ArrayList<Integer> pedirEdades(int personas) {
		
		int edad;
		ArrayList<Integer>   edades = new ArrayList<Integer>();
		
		
		for (int i=0;   i<personas;    i++) {
			
			edad = pedirInt("Introduce la edad de la persona");
			
			if (edad>=120) {
				
				System.out.println("La edad no es correcta");
			}
			
			else {edades.add(edad);
				
			}
			
		}
		
		return edades;
		
		
	}	
	
	
	static int acumulador(ArrayList<Integer> numeros) {
		
		int sumaNumeros = 0;
		
		for (int x=0;  x <numeros.size();       x++) {
			
			sumaNumeros += numeros.get(x);
			
		}	
			
		return 	sumaNumeros;
			
			
	}
	
	
	static double media(int acumulado, int numElementos) {
		
		return acumulado/numElementos;
		
	}
		
	
	static void mensajeImprimir(double mediaEdades) {;
		System.out.println("La media de edad es " +mediaEdades);
		
	}
	
	

}

