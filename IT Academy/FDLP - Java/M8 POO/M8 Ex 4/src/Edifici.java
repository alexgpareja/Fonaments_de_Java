
public class Edifici {

//atributs	
	
	protected String nom;
	protected int nombrePlantes;
	protected int superficie;
	
//metode constructor
	
	public Edifici(String nom, int nombrePlantes, int superficie) {
		
		this.nom=nom;
		this.nombrePlantes=nombrePlantes;
		this.superficie=superficie;
	}
	
//getters	
	
	public String getNom() {return nom;}
	public int getNombrePlantes() {return nombrePlantes;}
	public int getSuperficie() {return superficie;}
	
//setters
	
	
//metodes de la clase
	
	public void netejar() {
		
		double tempsDeNetejaMin = superficie/5; // (x) minuts
		if (nombrePlantes>1) {
			tempsDeNetejaMin=0.5*nombrePlantes;}
		double tempsDeNeteja=tempsDeNetejaMin/60; // (x) hores
		double costMensualNeteja=tempsDeNetejaMin*30; // diners al mes, 1€ x min
		
		System.out.println("Per netejar l'edifici es trigara(n)" + tempsDeNeteja + " hores");
		System.out.println("El cost serà de"+costMensualNeteja +"€.");
	}
	
	public void CalcularCostVigilancia() {
		int vigilants=superficie/1000;
		int salari=1300;
		int costVigilants=vigilants*salari;
		//modificar el metode segons la necessitat de la classe
		
		System.out.println("Són necessaris "+vigilants + " vigilants");
		System.out.println("Contractar-los tindrá un cost de "+costVigilants + "€.");
	}
	
	public String toString() {
		
		return nom+ ", de "+superficie + " m2 i "+ nombrePlantes + " plantes.";
	}

}
