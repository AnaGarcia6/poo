package poo;

public class Television extends Electrodomestico{

	
	//constantes 
	
	protected final static  boolean SINTONIZADOR_TDT = false;
	protected final static double RESOLUCIOn_EN_PULGADAS = 20;
	
	// atributos 
	
	private boolean sintonizadorTdt;
	private double resolucionEnPulgadas;
	
	
	//constructores 
	
	public Television() {
		
		this(PRECIO_BASE, COLOR, CONSUMO_ENERGETICO, PESO, SINTONIZADOR_TDT, RESOLUCIOn_EN_PULGADAS);
	}
	
	public Television(int peso, int precioBase) {
		
		super(precioBase, peso);
		
		this.color =COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.sintonizadorTdt = SINTONIZADOR_TDT;
		this.resolucionEnPulgadas =RESOLUCIOn_EN_PULGADAS;
	}
	
	public Television(double precioBase, String color, char consumoEnergetico, double peso, boolean sintonizadorTdt, double resolucionEnPulgadas) {
		
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucionEnPulgadas = resolucionEnPulgadas;
		this.sintonizadorTdt = sintonizadorTdt;
	}

	public boolean isSintonizadorTdt() { // es iss porque es un boolean
		return sintonizadorTdt;
	}

	public double getResolucionEnPulgadas() {
		return resolucionEnPulgadas;
	}
	
}
