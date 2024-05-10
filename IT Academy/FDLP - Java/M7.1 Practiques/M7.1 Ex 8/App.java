import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double gradosC = pedirDouble("Pon el numero de ºC a convertir en ºF");
		double gradosF = (9/5.0)* gradosC + 32;
		System.out.println(gradosC + "ºC = " + gradosF + "ºF." );
	}

	
	static double pedirDouble(String texto)	{
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		double n1 = input.nextDouble();
		return n1;
}
	
	
	
	
}