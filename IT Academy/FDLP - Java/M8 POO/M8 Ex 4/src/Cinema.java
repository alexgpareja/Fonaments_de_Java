
public class Cinema extends Edifici{

	int aforamentSala;
	int preuEntrada;
	int nombreAsistents;
	
		public Cinema(String nom, int nombrePlantes, int superficie, int aforamentSala, int preuEntrada, int nombreAsistents) {	
			super(nom, nombrePlantes, superficie);
			this.aforamentSala=aforamentSala;
			this.preuEntrada=preuEntrada;
			this.nombreAsistents=nombreAsistents;
		
		}
	
	public int getAforamentSala() {return aforamentSala;}
	
	public int getPreuEntrada() {return preuEntrada;}
	
	public int getNombreAsistents() {return nombreAsistents;}
	
	
	public void setAforamentSala(int aforamentSala) {
		this.aforamentSala=aforamentSala;}
	
	public void setPreuEntrada(int preuEntrada) {
		this.preuEntrada=preuEntrada;}
	
	public void setNombreAsistents(int nombreAsistents) {
		this.nombreAsistents=nombreAsistents;}

	
	
	public void CalcularCostVigilancia() {
		
		int vigilants=getSuperficie()/3000;
		int salari=1300;
		int costVigilants=vigilants*salari;
		
		System.out.println("Són necessaris "+vigilants + " vigilants");
		System.out.println("Contractar-los tindrá un cost de "+costVigilants + "€.");
	}
	
	public void projectarSessio() {
		
		int recaptacio=0;
		if (nombreAsistents<aforamentSala) {
			recaptacio=preuEntrada*nombreAsistents;
			System.out.println("S'han recaptat "+recaptacio + "€");
		}	
		else {System.out.println("El nombre d'asistents supera la capacitat màxima de l'aforament màxim permès de la sala");}
		
	}
	
}
