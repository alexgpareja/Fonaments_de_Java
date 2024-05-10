import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		menuPrincipal();
		int eleccionUser = pedirInt("Introduce un numero del menú");
		opcionesMenu(eleccionUser);
		
	}

	
	
	static void menuPrincipal() {
		
		System.out.println("Menu Principal");
		System.out.println("1.- Quadrat");
		System.out.println("2.- Triangle");
		System.out.println("3.- Rectangle");
		System.out.println("4.- Cercle");
		System.out.println("0.- Sortir del programa");
	}
	
	static int pedirInt(String texto) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;	
	}
	
	
	static void opcionesMenu(int eleccionUser) {
		
		switch (eleccionUser) {
		
		case 1:
			cuadrado();
			break;
			
		case 2:
			triangulo();
			break;
			
		case 3:
			rectangulo();
			break;
			
		case 4:
			circulo();
			break;
			
		case 0:
			
			break;
			
		default:
		    System.out.println("Esa opción no esta disponible actualmente.");
		}
		
	}
	
	
	static void triangulo() {
		
		Scanner input = new Scanner(System.in); 
		
		 System.out.println("ingrese la base del triangulo");
		 double base = input.nextDouble();
		 System.out.println("introduce la altura del triangulo");
		 double altura = input.nextDouble();
		 double area =( base*altura)/2;
		 System.out.println("el area del triangulo es: "+area);
		
	}
	
	
	static void rectangulo() {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("ingrese la base del rectangulo");
	    double baserec = input.nextDouble();
	    System.out.println("introduce la altura del rectangulo");
	    double alturarec = input.nextDouble();
	    double arearec = baserec*alturarec;
	    System.out.println("el area del rectangulo es: "+arearec);
	}
	
	
	static void circulo() {
		
		double pi = 3.1416;
		Scanner input = new Scanner(System.in); 
		
		System.out.println("ingrese el radio del circulo");
	    double radio = input.nextDouble();
	    double areacir =pi*radio*radio;
	    System.out.println("el area del circulo es: "+areacir);
	}
	
	
	static void cuadrado() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ingrese la base del cuadrado");
	    double basecua = input.nextDouble();
	    System.out.println("introduce la altura del cuadrado");
	    double alturacua = input.nextDouble();
	    double areacua = basecua*alturacua;
	    System.out.println("el area del cuadrado es: "+areacua);
	}
	
}
