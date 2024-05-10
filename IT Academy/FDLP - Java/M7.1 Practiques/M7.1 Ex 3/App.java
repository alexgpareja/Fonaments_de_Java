import java.util.Scanner;

//L’usuari/ària ha d'introduir un número i el programa ha de mostrar per pantalla si el número és parell o imparell.



public class App {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userNum = pedirInt("Dime un numero");
		parimpar(userNum);
	
	}
	
	
static int pedirInt(String texto)	{
		
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;
	}		

static void parimpar(int userNum) {

		if (userNum %2 ==0) {
			System.out.println(userNum + " es par");
		}
		
		else {
			System.out.println(userNum + " es impar");
		}
		
}

}
