import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class
public class App {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	ArrayList<Integer> notas = new ArrayList <Integer>(); //creamos la lista notas
	
	int notasaGuardar = pedirInt("Cuantas notas quieres añadir?"); //pedimos el numero de notas que se añadiran
	notas = pedirNotas(notasaGuardar); //pedimos las notas
	
	int acumuladoNotas = acumulador(notas); //acumulado de todas las notas
	double mediaNotas = media(acumuladoNotas, notas.size()); //calcular la media
	mensajeImprimir(mediaNotas); //imprimir la media 
	
	
	}

	
static int pedirInt(String texto)	{
	
	
	Scanner input = new Scanner(System.in);
	System.out.println(texto);
	int n1 = input.nextInt();
	return n1;
}	


static ArrayList<Integer> pedirNotas(int notasaGuardar) {
	
	int nota;
	ArrayList<Integer>   notas = new ArrayList<Integer>();
	
	
	for (int i=0;   i<notasaGuardar;    i++) {
		
		nota = pedirInt("Introduce la nota a añadir");
		
		notas.add(nota);			
	}
	return notas;
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

static void mensajeImprimir(double mediaNotas) {
		
	if (mediaNotas<7) {
		System.out.println(mediaNotas + ". La nota mitjana de la classe és bona, però els/les alumnes haurien de millorar el treball personal\"");
	}
	
	else if (mediaNotas<5) {
		System.out.println(mediaNotas + ". La nota mitjana de la classe està suspesa. Els/les alumnes haurien de preguntar els seus dubtes i treballar més.");
	}
	
	else {
		System.out.println(mediaNotas + ". Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat.");
	}

}



	
}
