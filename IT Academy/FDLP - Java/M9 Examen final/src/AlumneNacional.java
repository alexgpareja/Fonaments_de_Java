
public class AlumneNacional extends Alumne{

	private String dni;
	
	
	
	public AlumneNacional(int id, String nom, String dni) {
		super(id, nom);
		this.dni=dni;
	}

	
	
	public String getDni() {return dni;}
	public void setDni(String dni) {this.dni=dni;}
	
	
	
	public double calcularNotaFinal() {
		
			
		int nota;
		int suma=0;
		for (int i=0; i<llistanotes.size(); i++) { 
			if (llistanotes.get(i) >=5) {//dividimos entre 2 las notas que sean 5 o más
				nota=llistanotes.get(i)/2;
				llistanotes.set(i, nota);
			}
			suma+=llistanotes.get(i); //se van sumando todos los elementos
		}
		double media= suma/llistanotes.size();
		return media;
			
	}
	
	public String presentarse() {
		return "Em dic "+nom + " i soc l'alumne numero " + id + ", amb DNI "+ dni + " i una mitjana de "+calcularNotaFinal();
		
	}
	
	
	
}
