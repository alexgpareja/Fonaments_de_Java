import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int userNum = pedirInt("Dime un numero del 1 al 10");	
	int resultados = tablaMultiplicar(userNum);

	}

static int pedirInt(String texto)	{
		
	Scanner input = new Scanner(System.in);
	System.out.println(texto);
	int n1 = input.nextInt();
	return n1;	
}

static int tablaMultiplicar(int userNum) {
	
	
	for (int i=1;    i<=10;   i++) {
		
		System.out.println(userNum + " * " + i + " = " + (userNum * i));
	}
	
	return userNum;
}
}
