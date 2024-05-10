
public class Punt {

	protected double posicioX;
	protected double posicioY;
	
	public Punt (double posicioX, double posicioY) {
		
		this.posicioX=posicioX;
		this.posicioY=posicioY;
	}
	
	public double getPosicioX() {return posicioX;}
	public double getPosicioY() {return posicioY;}
	
	public void setPosicioX(double posicioX) {this.posicioX=posicioX;}
	public void setPosicioY(double posicioY) {this.posicioY=posicioY;}
	
	public String toString() {return "X="+posicioX+" Y="+posicioY;}
}
