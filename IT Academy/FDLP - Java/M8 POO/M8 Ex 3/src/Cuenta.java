
public class Cuenta {

	private int numCuenta;
    private double saldo;
	
	
//metode constructor
	
    public Cuenta(int numCuenta) {                         
    	this.numCuenta = numCuenta;
        saldo = 0;
    }

	
//getters
	
    public double getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
	
//setters
	
    public void setNumeroCuenta(int numCuenta) {
    	this.numCuenta = numCuenta;
    }

    public void setSaldo(double saldo) {
    	this.saldo = saldo;
    }

	
//metodes de la clase
	
    public double ingresarDinero(int cantidad) {
    	if (cantidad>0) {
    		saldo += cantidad;
    	}
    	else {System.out.println("La cantidad a ingresar no puede ser inferior a 1.");}
    	return saldo;
    }
	
	public double retirarDinero(int cantidad){
		if (saldo>=cantidad) {
			saldo -= cantidad;
		}
		else {System.out.println("No tienes suficiente dinero. Tu saldo actual es de " + saldo + "€");}
		
		return saldo;
	}
	
	public String toString() {
		return "Su número de cuenta es " + numCuenta + ". Su saldo actual es de " + saldo + "€.";
	}
}


