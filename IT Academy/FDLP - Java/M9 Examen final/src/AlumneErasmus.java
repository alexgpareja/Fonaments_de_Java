
public class AlumneErasmus extends Alumne {

	private String passaport;
	
	
	
	public AlumneErasmus(int id, String nom, String passaport) {
		super(id, nom);
		this.passaport=passaport;
	}

	
	
	public String getPassaport() {return passaport;}
	public void setPassaport(String passaport) {this.passaport=passaport;}
	
	
	
	public double calcularNotaFinal() {
		
		int nota;
		int suma=0;
		for (int i=0; i<llistanotes.size(); i++) {
			if (llistanotes.get(i) %2==0) {
				
				nota=llistanotes.get(i)*2;
				llistanotes.set(i, nota);
			}
			else {nota=llistanotes.get(i)/2;
			llistanotes.set(i, nota);
			}
			suma+=llistanotes.get(i);
		}
		double media= suma/llistanotes.size();
		return media;
		
	}
	
	public String presentarse() {
		return "Em dic "+nom + " i soc l'alumne numero " + id + ", amb passaport "+ passaport + " i una mitjana de "+calcularNotaFinal();
		
	}
	
	
}
