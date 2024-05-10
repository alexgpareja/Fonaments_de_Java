import java.util.Scanner;
import java.util.ArrayList;
public class App {

	
	
	public static void main(String[] args) {
		
		ArrayList<Hotel> listaHoteles = new ArrayList<Hotel>();
		
		System.out.println("Bienvenido, para empezar debes crear un hotel");
		Hotel userHotel = crearHotel(listaHoteles);
		int userSelection;
		do {
			menuPrincipal();
			 userSelection = pedirInt("");
			
			switch (userSelection) {
	
			case 1:
				crearHotel(listaHoteles);
				break;
			case 2:
				String hotelaver = pedirString("¿Que hotel quieres ver?");
				verHotel(listaHoteles, hotelaver);
				break;
			case 3:
				String hotelaeditar = pedirString("¿Que hotel quieres editar");
				editarHotel(listaHoteles, hotelaeditar);
				break;
			case 4:
				String hotelaeliminar = pedirString("¿Que hotel quieres eliminar?");
				eliminarHotel(listaHoteles, hotelaeliminar);
				break;
			case 5:
				verTodosHoteles(listaHoteles);
				break;
			case 0:
				System.out.println("Programa terminado");
				break;
			default: System.out.println("Elige una opción válida");
			}
		}
		while (userSelection !=0);
		

	
	}

	
	public static String pedirString(String texto) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		String text1 = input.nextLine();
		return text1;	
		}
	
	public static int pedirInt(String texto) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;	
		}		

	
	public static Hotel crearHotel(ArrayList<Hotel> listaHoteles) {
		
		Hotel userHotel = new Hotel(
				pedirString("¿Como se llama el hotel?"),
				pedirInt("¿Cuantas habitaciones tiene?"),
				pedirInt("¿Cuantas plantas tiene?"),
				pedirInt("¿Cual es la superfície total del hotel?"));
		
		listaHoteles.add(userHotel);
		return userHotel;
	}
	
	public static void eliminarHotel(ArrayList<Hotel> listaHoteles, String hotelaeliminar) {
		
		int i = 0;
		boolean hotelEncontrado = false;
		do {
			if (hotelaeliminar.equals( listaHoteles.get(i).getNom() ) ) {
				
				listaHoteles.remove(i);
				hotelEncontrado = true;
			}
			i++;
		}
		while (i<listaHoteles.size() && hotelaeliminar.equals( listaHoteles.get(i).getNom() ) );	
		
		if (hotelEncontrado == true) {
			System.out.println("El hotel se ha eliminado correctamente");
		}
		else {System.out.println("El hotel no se ha podido encontrar");}
	}
	
	
	public static void editarHotel(ArrayList<Hotel> listaHoteles, String hotelaeditar) {
		
		int i = 0;
		boolean hotelEncontrado = false;
		do {
			if (hotelaeditar.equals( listaHoteles.get(i).getNom() ) ) {

				hotelEncontrado = true;
			}
			i++;
		}
		while (i<listaHoteles.size() && hotelaeditar.equals( listaHoteles.get(i).getNom() ) );	
		
		if (hotelEncontrado == true) {
			
			int userNumHabs = pedirInt("¿Cuantas habitaciones tiene?");
			listaHoteles.get(i-1).setNumHabs(userNumHabs);
			int userNumPlants = pedirInt("¿Cuantas plantas tiene?");
			listaHoteles.get(i-1).setNombrePlantes(userNumPlants);
			int userSuperficieTotal = pedirInt("¿Cual es la superfície total del hotel?");
			listaHoteles.get(i-1).setSuperficieTotal(userSuperficieTotal);

			
		}
		else {System.out.println("El hotel no se ha podido encontrar");}
	
	}
	
	public static void verHotel(ArrayList<Hotel> listaHoteles, String hotelaver) {
		
		int i = 0;
		boolean hotelEncontrado = false;
		do {
			if (hotelaver.equals( listaHoteles.get(i).getNom() ) ) {

				hotelEncontrado = true;
			}
			i++;
		}
		while (i<listaHoteles.size() && hotelaver.equals( listaHoteles.get(i).getNom() ) );	
		
		if (hotelEncontrado == true) {
			System.out.println(listaHoteles.get(i-1));
			listaHoteles.get(i-1).calcularMantenimiento();
		}
	}
	
	public static void verTodosHoteles(ArrayList<Hotel> listaHoteles) {
		
		System.out.println(listaHoteles.toString());	
	}
	
	public static void menuPrincipal() {
		
		System.out.println("¿Qué quieres hacer ahora? (escribe 1, 2, 3, 4)");
		System.out.println("1.- Crear un Hotel");
		System.out.println("2.- Ver un Hotel");
		System.out.println("3.- Modificar Hotel");
		System.out.println("4.- Eliminar Hotel");
		System.out.println("5.- Ver todos los Hoteles");
		System.out.println("0.- Terminar");
	
	}
	
	
}
