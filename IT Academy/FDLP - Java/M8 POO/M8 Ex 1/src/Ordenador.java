
public class Ordenador {
	
	private String brand;
	private String model;
	private String processor;
	private int ram;
	private int memory;


//metode constructor
	public Ordenador (String brand, String model){
	
		this.brand = brand;
		this.model = model;
		processor = "Default Proc";
		ram = 16;
		memory = 256;
	
	}
	
	public Ordenador (String brand, String model, String processor, int ram, int memory){
		
		this.brand = brand;
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.memory = memory;
		
	}
	
//gettings
	
	public String getBrand() {
		return brand;	
	}
	
	public String getModel() {
		return model;
	}
	
	public String getProcessor() {
		return processor;
	}
	
	public int getRam() {
		return ram;
	}
	
	public int getMemory() {
		return memory;
	}
	
//settings	
	
	public void setBrand(String newBrand) {
		this.brand = newBrand;
	}
	
	public void setModel (String newModel) {
		this.model = newModel;
	}
	
	public void setProcessor (String newProcessor) {
		this.processor = newProcessor;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	
//metodes de la clase
	

	
	public void printAllComponents() {
		
		System.out.println("La marca es " +brand);
		System.out.println("El modelo es " +model );
		System.out.println("El procesador es " +processor);
		System.out.println("La memoria RAM es de " +ram + "GB");
		System.out.println("El espacio de almacenamiento es de " +memory + "GB");
	}
	

	public String toString() {
		
		return "La marca es " +brand + ". El modelo es " +model + ". El procesador es " +processor +". La memoria RAM es de " +ram + "GB" + ". El espacio de almacenamiento es de " +memory + "GB";
	}
	
}