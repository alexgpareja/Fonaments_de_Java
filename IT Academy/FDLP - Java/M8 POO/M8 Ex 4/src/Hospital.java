
public class Hospital extends Edifici{

	private int nombreMalalts;
	
	public Hospital(String nom, int nombrePlantes, int superficie, int nombreMalalts) {
		super(nom, nombrePlantes, superficie);
		this.nombreMalalts=nombreMalalts;
	}
	
	
	public int getNombreMalalts() {return nombreMalalts;}
	
	public void setNombreMalalts(int nombreMalalts) {
		this.nombreMalalts=nombreMalalts;
		}
	
	
	public void repartirDinar() {
		
		int racions=3;
		racions=nombreMalalts*racions;
		
		System.out.println("S'estan repartint "+ racions + " racions.");
		
	}
	
	public String toString() {
		
		return super.toString()+" En aquest moment té " + nombreMalalts + " malalts";
	}

}
