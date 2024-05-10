import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Edifici> listaEdificis = new ArrayList<Edifici>();
		
		
		int userSelectionMainMenu;
		int userSelectionTypeEdifici;
		String userSelectionNameEdifici;
		
		do {
			menuInicial();
			userSelectionMainMenu=pedirInt("");
			
			switch (userSelectionMainMenu) {
			
			case 1: 
				menuElegirTipoEdificio();
				userSelectionTypeEdifici=pedirInt("");
				crearEdifici(listaEdificis, userSelectionTypeEdifici);
			break;
			case 2:
				userSelectionNameEdifici=pedirString("Como se llama el edificio a buscar");
				mostrarEdifici(listaEdificis, userSelectionNameEdifici);
				break;
			case 3: 
				userSelectionNameEdifici=pedirString("Como se llama el edificio a eliminar");
				eliminarEdifici(listaEdificis, userSelectionNameEdifici);
			case 0:
				break;
			default: System.out.println("Elige una opción válida del menú.");
			}
		}
		while(userSelectionMainMenu !=0);

	}
	
	public static void menuInicial() {
		
		System.out.println("Bienvenido, ¿Qué quieres hacer? (Escribe 1, 2, 3, ...)");
		System.out.println("1.- Crear edificio");
		System.out.println("2.- Mostrar edificio");
		System.out.println("3.- Eliminar edificio");
		System.out.println("0.- Terminar programa");
	}
	
	public static void menuElegirTipoEdificio() {
		
		System.out.println("Selecciona un tipo de edificio válido (Escribe 1, 2, 3, ...)");
		System.out.println("1.- Hotel");
		System.out.println("2.- Hospital");
		System.out.println("3.- Cinema");
	}
	

	public static void crearEdifici(ArrayList<Edifici> listaEdificis, int userSelectionTypeEdifici) {
		
		switch (userSelectionTypeEdifici) {
		
		case 1: 
			Hotel userEdifici = new Hotel(pedirString("Como se llama"), pedirInt("Numero de plantas"), pedirInt("Superficie (en m2)"), pedirInt("Cuantas habitaciones tiene"));
			listaEdificis.add(userEdifici);
			break;
		case 2: 
			Hospital userEdifici2 = new Hospital(pedirString("Como se llama"), pedirInt("Numero de plantas"), pedirInt("Superficie (en m2)"), pedirInt("Cuantos enfermos hay actualmente"));
			listaEdificis.add(userEdifici2);
			break;
		case 3: 
			Cinema userEdifici3 = new Cinema(pedirString("Como se llama"), pedirInt("Numero de plantas"), pedirInt("Superficie (en m2)"), pedirInt("Cual es el aforo máximo"), pedirInt("Precio actual de la entrada"),pedirInt("Numero de asistentes en la sala/entradas vendidas"));
			listaEdificis.add(userEdifici3);
			break;
		default: System.out.println("Esta opción no existe");
		}	
	}
	
	public static void mostrarEdifici(ArrayList<Edifici> listaEdificis, String userSelectionNameEdifici)	{
		
		int positionNameEdifici=buscadorEdifici(listaEdificis, userSelectionNameEdifici);
		
		if (positionNameEdifici !=-1) { //si el nombre existe
		
			Edifici edificioSeleccionado = listaEdificis.get(positionNameEdifici);
			
			if (edificioSeleccionado instanceof Hotel) {
				System.out.println(((Hotel)edificioSeleccionado).toString());
				((Hotel)edificioSeleccionado).CalcularCostVigilancia();
				((Hotel)edificioSeleccionado).serveiHabitacions();
			}
			else if (edificioSeleccionado instanceof Hospital) {
				System.out.println(((Hospital)edificioSeleccionado).toString());
				((Hospital)edificioSeleccionado).repartirDinar();
			}
			
			else {System.out.println(((Cinema)edificioSeleccionado).toString());
			((Cinema)edificioSeleccionado).CalcularCostVigilancia();
			((Cinema)edificioSeleccionado).projectarSessio();}
		}
		else {System.out.println("No hay ningun edificio con este nombre");}
		
	}
		
	public static void eliminarEdifici(ArrayList<Edifici> listaEdificis, String userSelectionNameEdifici) {
		
		int positionNameEdifici=buscadorEdifici(listaEdificis, userSelectionNameEdifici);
		
		if (positionNameEdifici !=-1) { //si el nombre existe
		
			Edifici edificioSeleccionado = listaEdificis.get(positionNameEdifici);
			
			if (edificioSeleccionado instanceof Hotel) {
				
				listaEdificis.remove((Hotel)edificioSeleccionado);
				System.out.println("El Hotel se ha eliminado correctamente");
			}	
			else if (edificioSeleccionado instanceof Hospital) {
				
				listaEdificis.remove((Hospital)edificioSeleccionado);
				System.out.println("El Hospital se ha eliminado correctamente");
			}
			else {listaEdificis.remove((Cinema)edificioSeleccionado);
			System.out.println("El Cine se ha eliminado correctamente");}
		}
		
		else {System.out.println("No existe ningun edificio con este nombre");}
	}
	
//tools
	
	public static int buscadorEdifici (ArrayList<Edifici> listaEdificis, String userSelectionNameEdifici) {
		
		int i = 0;
		int posicionArray=-1;
		boolean encontrado=false;
		
		while (i<listaEdificis.size() && !encontrado) {
			
			if ( listaEdificis.get(i).getNom().equalsIgnoreCase(userSelectionNameEdifici)  ) {

				posicionArray = i;
				encontrado=true;
			}
			i++;
		}	
		return posicionArray;
	}
	
	
//pedida de datos	
	
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
}
