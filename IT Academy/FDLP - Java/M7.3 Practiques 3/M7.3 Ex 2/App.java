import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String mensajeUser = pedirString("Escribe algo y reviertelo");
		
		String resultadoReverso = "";
		
		reversor(mensajeUser, resultadoReverso);
		
		
	
	}
		
	static String pedirString(String texto) {
			
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		String text1 = input.nextLine();
		return text1;	
		}
	
	static void reversor(String mensajeUser,String resultadoReverso ) {
		
		
		for (int i = mensajeUser.length() - 1; i >= 0;  i--   ) {
			
		resultadoReverso+= mensajeUser.charAt(i);
			
		}
		
		System.out.println(resultadoReverso);
		
	}
		
		

}


