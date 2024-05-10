import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userNum = pedirInt("Dime el numero del cual quieras el factorial");
		
		System.out.println("El factorial del numero " + userNum + " es " + factorial(userNum));
	}
	
	
	static int pedirInt(String texto) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;
		
		
	}
	
	static double factorial(int userNum) {
		
		double aux = 1;
		for (int i=1;   i<=userNum;   i++) {
			aux = aux * i;	
		}
		return aux;
		
	}
	
	
	

}
