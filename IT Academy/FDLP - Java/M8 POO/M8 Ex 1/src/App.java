import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		menuPrincipal();
		int userSelection = pedirInt("");
		Ordenador pcUser = crearPC(userSelection);
		menuEditarPC();
		int userEditSelection = pedirInt("");
		editarPC(userEditSelection, pcUser);
		do {
			menuEditarPC();
			userEditSelection = pedirInt("");
			editarPC(userEditSelection, pcUser);
		}
		while (userEditSelection !=0);
		menuFinal();
		int userLastSelection = pedirInt("");
		eleccionFinal(userLastSelection, pcUser);
		do {
			menuFinal();
			userLastSelection = pedirInt("");
			eleccionFinal(userLastSelection, pcUser);
		}
		while (userLastSelection !=0);

	}

	public static void menuPrincipal() {
		
		System.out.println("Bienvenido User, ¿Qué quieres hacer? (escribe 1 o 2)");
		System.out.println("1.- Crear un PC a partir de la marca y modelo");
		System.out.println("2.- Crear un PC con los componentes a tu gusto");
		
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
		
	public static Ordenador crearPC(int userSelection) {
		
		Ordenador pcUser=null;
		
		switch(userSelection) {
		
			case 1: 
				pcUser = new Ordenador ("Marca A", "Modelo 1000");
				System.out.println(pcUser.toString());
				break;
			
			case 2: 
				pcUser = new Ordenador ("Marca A", "Modelo 1000", "Procesador Ultimate", 32, 1000);
				System.out.println(pcUser.toString());
				break;
				
				
			default: System.out.println("Introduce una opción válida");
		}	
			return pcUser;
	}
	
	public static void menuEditarPC() {
		
		System.out.println("¿Quieres modificar algún componente? (escribe 1, 2, 3)");
		System.out.println("1.- Procesador");
		System.out.println("2.- RAM");
		System.out.println("3.- Espacio de almacenamiento");
		System.out.println("0.- No");
	}
	
	public static Ordenador editarPC(int userEditSelection, Ordenador pcUser) {
		
			switch(userEditSelection) {
		
				case 1: 
					String userProcessor = pedirString("Escribe el procesador que quieras");
				
					pcUser.setProcessor(userProcessor);
					break;
			
				case 2: 
					int userRam = pedirInt("Escribe la RAM que quieras (4, 8, 16, 32 o 64");
					pcUser.setRam(userRam);
					break;
				
				case 3:
					int userMemory = pedirInt("Escribe la cantidad de almacenamiento que quieras (256, 512, 1000, 2000)");
					pcUser.setMemory(userMemory);
					break;
			
				case 0:
				break;
				
				default: System.out.println("Introduce una opción válida");
			}
		return pcUser;
	}


	public static void menuFinal() {
		
		System.out.println("Enhorabuena, ya has terminado. ¿Quieres hacer algo más? (escribe 1, 2, 3)");
		System.out.println("1.- Simular un programa");
		System.out.println("2.- Comprobar como queda mi PC");
		System.out.println("3.- Cambiar algún elemento");
		System.out.println("0.- No");
		
	}
	
	public static void eleccionFinal(int userLastSelection, Ordenador pcUser) {
		
		switch (userLastSelection) {
		
		case 1:
			simularPrograma();
			break;
		
		case 2:
			System.out.println(pcUser.toString());
			break;
			
		case 3:
			menuPrincipal();
			break;
			
		case 0:
			
			break;
		
		}
		
		
	}
	
	public static void simularPrograma() {
		
		String programaEjecutado = pedirString("Dime el nombre del programa");
		System.out.println("En estos momentos se está ejecutando "+programaEjecutado);
	}


}

