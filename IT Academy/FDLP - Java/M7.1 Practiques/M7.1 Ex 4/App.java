import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int userNum1 = pedirInt("Dime un numero");
		int userNum2 = pedirInt("Dime otro numero");
		negatiu(userNum1, userNum2);
	}
	
	
static int pedirInt(String texto)	{
		
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;
	}		

static void negatiu(int userNum1, int userNum2) {

	if (userNum1 <0 && userNum2 <0) {
		
	}
	
	else if (userNum1 <0 || userNum2 <0) {
		System.out.println("Un dels dos números és negatiu");
}

}
}
