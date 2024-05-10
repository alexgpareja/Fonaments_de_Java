import java.util.ArrayList;
public class Cliente {

	private String nombre;
	private String apellido;
	private ArrayList <Cuenta> cuentasUsuario;
	
	
	public Cliente (String nombre, String apellido) {
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.cuentasUsuario = new ArrayList<Cuenta>();
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getNombreApellido() {
		return nombre+" "+ apellido;
	}
	
	public ArrayList<Cuenta> getCuentasUsuario() {
		return cuentasUsuario;
	}
	
	
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public void setApellido(String nuevoApellido) {
		apellido = nuevoApellido;
	}
	public void agregarCuenta(Cuenta newAccount) {
		cuentasUsuario.add(newAccount);
	}
	
	public void eliminarCuenta(int numCuenta) {
		cuentasUsuario.remove(numCuenta);
	}
	
	public int buscadorPosicionCuenta (int userAccount) {
		
		int i = 0;
		int posicionArray=-1;
		boolean encontrado=false;
		
		while (i<cuentasUsuario.size() && !encontrado) {
			
			if ( userAccount == cuentasUsuario.get(i).getNumCuenta() )  {
				posicionArray = i;
				encontrado=true;
			}	
			i++;
		}
		return posicionArray;
	}
	
	public String toString() {
		
		return "El cliente se llama " +nombre+" "+ apellido+". Su(s) cuenta(s) es/son " + cuentasUsuario;
	}

}
