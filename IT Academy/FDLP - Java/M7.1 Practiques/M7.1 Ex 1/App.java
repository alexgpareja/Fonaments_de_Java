import java.util.Scanner;  // Import the Scanner class
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota1 = pedirInt("Introduce la primera nota");
		int nota2 = pedirInt("Introduce la segunda nota");
		int nota3 = pedirInt("Introduce la tercera nota");
		int media = suma(nota1, nota2, nota3);
		
		System.out.println("La media de tus notas es "+ suma(nota1, nota2, nota3));
		System.out.println(observaciones(media));
		

	}

	
static int pedirInt(String texto)	{
		
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;
	}

static int suma(int nota1, int nota2, int nota3) {
	
	int media = (nota1 + nota2 + nota3)/3;
	return media;
	
}

static int observaciones(int media) {
	
	if (media<5) {
		System.out.println("No has superat el curs. Has de recuperar.");
	}
	
	else if (media>7) {
		System.out.println("Enhorabona! Has superat el curs! Passa ja al següent nivell!");
	}
	
	else {
		System.out.println("Enhorabona! Has aprovat, però hauries de continuar practicant.");
	}
	
	return media;
}
	
	
}
