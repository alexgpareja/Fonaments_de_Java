import java.util.ArrayList;

public class Curs {
	
	private String nom;
	private ArrayList<Alumne>llistaAlumnes;
	
	public Curs(String nom) {
		
		this.nom=nom;
		this.llistaAlumnes= new ArrayList<Alumne>();
	}
	
	
	public String getNomCurs() {return nom;}
	
	
	public void insertaAlumne(Alumne alumne) {llistaAlumnes.add(alumne);}
	public void eliminaAlumne(int posicio ) {llistaAlumnes.remove(posicio);}
	public int buscaAlumne (int posicioBuscar) {
			
			int i = 0;
			int posicionArray=-1;
			boolean encontrado=false;
			
			while (i<llistaAlumnes.size() && !encontrado) {
				
				if ( posicioBuscar == llistaAlumnes.get(i).getId() )  {
					posicionArray = i;
					encontrado=true;
				}	
				i++;
			}
			return posicionArray;
		}
	public void mostraNomAlumnes (){
		for(int i = 0; i < llistaAlumnes.size(); i++) {
			System.out.println(llistaAlumnes.get(i).getNomAlumne());
        }
	}
}
