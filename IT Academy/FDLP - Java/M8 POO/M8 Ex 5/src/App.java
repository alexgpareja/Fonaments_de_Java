
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Cercle cercle;
		Cercle cercle2;
		
		System.out.println("Introduce los datos del primer circulo");
		double x =pedirDouble("x=");
		double y =pedirDouble("y=");
		double radi=pedirDouble("radi=");
		cercle=crearCercle(x,y,radi);
		
		System.out.println("Introduce los datos del segundo circulo");
		x =pedirDouble("x=");
		y =pedirDouble("y=");
		radi=pedirDouble("radi=");
		cercle2=crearCercle(x,y,radi);
		
		System.out.println("Cercle 1= "+cercle.getCentre()+" radi= "+cercle.getRadi());
		System.out.println("Cercle 2= "+cercle2.getCentre()+" radi= "+cercle.getRadi());

		System.out.println("La distancia entre els centres es= "+ cercle.distanciaCentres(cercle2));
		System.out.println("Els cercles son iguals= "+ cercle.equals(cercle2));
		System.out.println("Els cercles son concentrics= "+ cercle.sonConcentrics(cercle2));
		System.out.println("Els cercles tenen el mateix radi= "+ cercle.tenenIgualRadi(cercle2));
		System.out.println("Els cercles son tangents= "+ cercle.sonTangents(cercle2));
		System.out.println("Els cercles son secants= "+ cercle.sonSecants(cercle2));
		System.out.println("Els cercles es toquen= "+ cercle.esToquen(cercle2));
		
	}
	
	

	public static Cercle crearCercle(double x, double y, double radi) {
		
		Punt punto = new Punt(x,y);
		Cercle cercle = new Cercle(punto,radi);
		return cercle;
	}
	
	
 	public static double pedirDouble(String texto) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		double n1 = input.nextDouble();
		return n1;	
	}

}
