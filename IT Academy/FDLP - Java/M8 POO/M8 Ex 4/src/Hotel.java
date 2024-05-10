
public class Hotel extends Edifici{

	private int numHabs;
	
	public Hotel(String nom, int nombrePlantes, int superficie, int numHabs) {
		super(nom, nombrePlantes, superficie);
		this.numHabs=numHabs;
	}
	
	public int getNumHabs() {return numHabs;}
	
	public void setNumHabs(int numHabs) {
		this.numHabs = numHabs;
	}
	
	
	public void CalcularCostVigilancia() {
		
		int vigilants=getSuperficie()/1000;
		int salari=1300;
		int incentivo=500;
		int costVigilants=vigilants*salari+incentivo;
		
		System.out.println("Són necessaris "+vigilants + " vigilants");
		System.out.println("Contractar-los tindrá un cost de "+costVigilants + "€.");
	}

	public void serveiHabitacions() {
		
		int personasMantenimiento = numHabs/20;
		int salari=1000;
		int costeMantenimiento = personasMantenimiento*salari;
		
		System.out.println("Para atender "+ numHabs + " habitaciones, hacen falta "+personasMantenimiento + " personas");
		System.out.println("El coste del mantenimiento será de "+costeMantenimiento);	
	}
	
	public String toString() {
		
		return super.toString()+" Té " + numHabs + " habitacions";
	}
}
