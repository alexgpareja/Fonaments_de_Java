
public class Hotel {

	private String nom;
	private int numHabs;
	private int nombrePlantes;
	private int superficieTotal;
	
	
//metode constructor
	
	public Hotel(String nom, int numHabs, int nombrePlantes, int superficieTotal) {
		
		this.nom = nom;
		this.numHabs = numHabs;
		this.nombrePlantes = nombrePlantes;
		this.superficieTotal = superficieTotal;
	}
	
//getters
	
	public String getNom() {
		return nom;	
	}
	
	public int getNumHabs() {
		return numHabs;	
	}
	
	public int getNombrePlantes() {
		return nombrePlantes;	
	}
	
	public int getSuperficieTotal() {
		return superficieTotal;	
	}
	
//setters
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setNumHabs(int numHabs) {
		this.numHabs = numHabs;
	}
	
	public void setNombrePlantes(int nombrePlantes) {
		this.nombrePlantes = nombrePlantes;
	}
	
	public void setSuperficieTotal(int superficieTotal) {
		this.superficieTotal = superficieTotal;
	}
	
//metodes de la classe
	
	public void calcularMantenimiento() {
		
		int personasMantenimiento = numHabs/20;
		
		int costeMantenimiento = personasMantenimiento+1500;
		
		System.out.println("Para atender "+ numHabs + " habitaciones, hacen falta "+personasMantenimiento + " personas");
		System.out.println("El coste del mantenimiento será de "+costeMantenimiento);		
	}
	
	public String toString() {
		
		return "El Hotel se llama " +nom+"."
				+" Tiene " +numHabs + " habitaciones. "
						+ "El número de plantas es " +nombrePlantes +"."
								+ " La superfície total es de " +superficieTotal + ".";
	}
}



