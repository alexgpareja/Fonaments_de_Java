import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		int menuUserSelection;
		String nombreCliente;
		String apellidoCliente;
		
		do {
			menuPrincipal();
			menuUserSelection = pedirInt("");
			
			switch (menuUserSelection) {
			
			case 1:
				nombreCliente = pedirString("Introduce tu nombre");
				apellidoCliente = pedirString("Introduce tu apellido");
				crearCliente(listaClientes, nombreCliente, apellidoCliente);
				break;
			case 2:
				nombreCliente = pedirString("Introduce tu nombre");
				apellidoCliente = pedirString("Introduce tu apellido");
				eliminarCliente(listaClientes, nombreCliente, apellidoCliente);
				break;
			case 3:
				nombreCliente = pedirString("Introduce tu nombre");
				apellidoCliente = pedirString("Introduce tu apellido");
				crearCuenta(listaClientes, nombreCliente, apellidoCliente);
				break;
			case 4:
				nombreCliente = pedirString("Introduce tu nombre");
				apellidoCliente = pedirString("Introduce tu apellido");
				eliminarCuenta(listaClientes, nombreCliente, apellidoCliente);
				break;
			case 5:
				nombreCliente = pedirString("Introduce tu nombre");
				apellidoCliente = pedirString("Introduce tu apellido");
				operarCuentaCliente(listaClientes, nombreCliente, apellidoCliente);
				break;
			case 0:
				System.out.println("Programa terminado");
				break;
			default: System.out.println("Elige una opción válida");	
			}
		}
		while (menuUserSelection !=0);

		System.out.println(listaClientes.toString());
	}

//menus
	
	public static void menuPrincipal() {
		
		System.out.println("Bienvenido, ¿Qué quieres hacer? (escribe 1, 2, 3, 4, 5)");
		System.out.println("1.- Crear cliente");
		System.out.println("2.- Eliminar cliente");
		System.out.println("3.- Crear cuenta");
		System.out.println("4.- Eliminar cuenta");
		System.out.println("5.- Operar");
		System.out.println("0.- Terminar");
	}

	public static void menuOperarCuenta() {
		
		System.out.println("¿Qué operacion quieres hacer? (escribe 1, 2,)");
		System.out.println("1.- Ingresar saldo");
		System.out.println("2.- Retirar saldo");
		System.out.println("3.- Ver mi saldo");
		System.out.println("0.- Terminar");
	}
	
//funciones
	
	public static void crearCliente(ArrayList<Cliente> listaClientes, String nombreCliente, String apellidoCliente) {
		
		if (buscadorPosicionCliente(listaClientes, nombreCliente, apellidoCliente) ==-1) {
			Cliente titular = new Cliente(nombreCliente, apellidoCliente); 
			listaClientes.add(titular);
			System.out.println("El usuario se ha creado correctamente");
		}
		else {System.out.println("Este cliente ya existe");}
		
	}

	public static void eliminarCliente(ArrayList<Cliente> listaClientes, String nombreCliente, String apellidoCliente) {
		
		int posicionNombreApellidoCliente = buscadorPosicionCliente(listaClientes, nombreCliente, apellidoCliente);
		
		if (buscadorPosicionCliente(listaClientes, nombreCliente, apellidoCliente) !=-1) {
			listaClientes.remove(posicionNombreApellidoCliente);
			System.out.println("El cliente se ha eliminado correctamente.");
		}
		else {System.out.println("El cliente no existe.");}
	}
	
	public static void crearCuenta(ArrayList<Cliente> listaClientes, String nombreCliente, String apellidoCliente) {
		
		int posicionNombreApellidoCliente = buscadorPosicionCliente(listaClientes, nombreCliente, apellidoCliente);
		
		if (posicionNombreApellidoCliente !=-1) { //si el cliente existe
			
			Cliente clienteSeleccionado = listaClientes.get(posicionNombreApellidoCliente);
			int numeroCuenta = pedirInt("Introduce un número de cuenta (este será tu identificador)");
			int indexCuenta = clienteSeleccionado.buscadorPosicionCuenta(numeroCuenta);
		
		
			if (indexCuenta == -1) { //si la cuenta no existe, se crea
				Cuenta cuenta = new Cuenta(numeroCuenta);
				clienteSeleccionado.agregarCuenta(cuenta);
				System.out.println("Cuenta creada con éxito.");
			}
			else {System.out.println("Esta cuenta ya existe.");}
		}
		else {System.out.println("Error. Este cliente no existe.");}
	}
	
	public static void eliminarCuenta(ArrayList<Cliente> listaClientes, String nombreCliente, String apellidoCliente) {
		
		int posicionNombreApellidoCliente = buscadorPosicionCliente(listaClientes, nombreCliente, apellidoCliente);
		
		if (posicionNombreApellidoCliente !=-1) { //si el cliente existe
			
			Cliente clienteSeleccionado = listaClientes.get(posicionNombreApellidoCliente);
			int numeroCuenta = pedirInt("Introduce tu número de cuenta ");
			int indexCuenta = clienteSeleccionado.buscadorPosicionCuenta(numeroCuenta);
		
		
			if (indexCuenta != -1) { //si la cuenta  existe, se elimina
				clienteSeleccionado.eliminarCuenta(indexCuenta);
				System.out.println("Cuenta eliminada con éxito.");
			}
			else {System.out.println("Esta cuenta no existe.");}
		}
		else {System.out.println("Error. Este cliente no existe.");}
	}

	public static void operarCuentaCliente(ArrayList<Cliente> listaClientes, String nombreCliente, String apellidoCliente) {
	
		int posicionNombreApellidoCliente = buscadorPosicionCliente(listaClientes, nombreCliente, apellidoCliente);
		
		if (posicionNombreApellidoCliente !=-1) { //si el cliente existe
			
			Cliente clienteSeleccionado = listaClientes.get(posicionNombreApellidoCliente);
			int numeroCuenta = pedirInt("Introduce un número de cuenta");
			int indexCuenta = clienteSeleccionado.buscadorPosicionCuenta(numeroCuenta);
		
		
			if (indexCuenta != -1) {
				
				int userSelectionOperar;
					do {
						menuOperarCuenta();
						userSelectionOperar = pedirInt("");
						
						switch (userSelectionOperar) {
						
							case 1:
								listaClientes.get(posicionNombreApellidoCliente).getCuentasUsuario().
								get(indexCuenta).ingresarDinero(pedirInt("Introduce la cantidad que deseas añadir a tu cuenta"));
								break;
							case 2:
								listaClientes.get(posicionNombreApellidoCliente).getCuentasUsuario().
								get(indexCuenta).retirarDinero(pedirInt("Introduce la cantidad que deseas retirar de tu cuenta"));
								break;
							case 3:
								listaClientes.get(posicionNombreApellidoCliente).getCuentasUsuario().
								get(indexCuenta).getSaldo();
							case 0:
								break;
							default: System.out.println("Introduce una opción válida");
						}
					}
					while (userSelectionOperar !=0);
			}		
		}
	
	}
	
//tools
	
	public static int buscadorPosicionCliente (ArrayList<Cliente> listaClientes, String nombreCliente, String apellidoCliente) {
		
		int i = 0;
		int posicionArray=-1;
		boolean encontrado=false;
		
		while (i<listaClientes.size() && !encontrado) {
			
			if ( listaClientes.get(i).getNombre().equalsIgnoreCase(nombreCliente)
				&& listaClientes.get(i).getApellido().equalsIgnoreCase(apellidoCliente)  ) {

				posicionArray = i;
				encontrado=true;
			}
			i++;
		}	
		return posicionArray;
	}

//pedir datos
	
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
