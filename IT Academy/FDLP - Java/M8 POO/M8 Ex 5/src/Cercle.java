
public class Cercle {

	protected Punt centre;
	protected double radi;
	protected double area;
	protected double circumference;
	
	public Cercle(Punt centre, double radi) {
		
		this.centre=centre;
		this.radi=radi;
		area=Math.PI*radi*radi;
		circumference= Math.PI * 2*radi;
	}
	
	public Punt getCentre() {return centre;}
	public double getRadi() {return radi;}
	public double getArea() {return area;}
	public double getCircumference() {return circumference;}
	public double getDistanciaCentre(Cercle altreCercle) {
		double distanciaCentre = distanciaCentres(altreCercle);
		return distanciaCentre;
	}
	
	public void setCentre(Punt centre) {this.centre=centre;}
	public void setRadi(double radi) {this.radi=radi;}

	public double distanciaCentres(Cercle altreCercle) {
		
		double x1= centre.getPosicioX();
		double x2= altreCercle.centre.getPosicioX();
		double y1= centre.getPosicioY();
		double y2= altreCercle.centre.getPosicioY();
		double distanciaCentre;
		
		double x = x2-x1;
        double y = y2-y1;
        
       distanciaCentre = Math.sqrt(x*x + y*y);
       return distanciaCentre;
	
	}
	
	public boolean equals(Cercle altreCercle) {
		
		boolean soniguales=false;
		if (area==altreCercle.getArea()) {
			soniguales=true;
		}
			return soniguales;
	}
	
	public boolean sonConcentrics(Cercle altreCercle) {

		boolean sonconcentrics=false;
		if (distanciaCentres(altreCercle)==0) {
			sonconcentrics=true;
		}
			return sonconcentrics;
	}
	
	public boolean tenenIgualRadi(Cercle altreCercle) {

		boolean igualradi=false;
		if (radi == altreCercle.getRadi()) {
			igualradi=true;
		}
			return igualradi;
	}
	
	public boolean sonTangents(Cercle altreCercle) {

		boolean sontangents=false;
		if (getDistanciaCentre(altreCercle) == (radi + altreCercle.getRadi())) {
			sontangents=true;
		}
			return sontangents;
	}
	
	public boolean sonSecants(Cercle altreCercle) {

		boolean sonsecants=false;
		if (getDistanciaCentre(altreCercle) < (radi + altreCercle.getRadi())
				&& getDistanciaCentre(altreCercle) > Math.abs(radi - altreCercle.getRadi())) {
			sonsecants=true;
		}
			return sonsecants;
	}
	
	public boolean esToquen(Cercle altreCercle) {

		boolean estoquen=false;
		if (radi+altreCercle.getRadi()>getDistanciaCentre(altreCercle)) {
			estoquen=true;
		}
			return estoquen;
	}

}
