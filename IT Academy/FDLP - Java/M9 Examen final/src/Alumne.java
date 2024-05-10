import java.util.ArrayList;

public class Alumne {
	
	protected int id;
	protected String nom;
	protected ArrayList<Integer> llistanotes;
	
	
	
	public Alumne (int id, String nom) {
		
		this.id=id;
		this.nom=nom;
		this.llistanotes=new ArrayList<Integer>();
	}
	
	
	
	public int getId() {return id;}
	public String getNomAlumne() {return nom;}
	public int getNotaDelLListat(int nota) {return llistanotes.get(nota);}
	
	public void setId(int id) {this.id=id;}
	public void setNom(String nom) {this.nom=nom;}
	
	
	public void insertarNota(int nota) {llistanotes.add(nota);}
	public void eliminarNotaDelLlistat(int nota) {llistanotes.remove(nota);}
	public void mostraLlistanotes(){
		for(int i = 0; i < llistanotes.size(); i++) {
			System.out.println(llistanotes.get(i));}
	}
}
