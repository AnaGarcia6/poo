package poo;


public class Lavadora extends Electrodomestico {

	//solo se puede heredad de una clase a la vez
	
		
	protected final static int PESO_DE_LA_CARGA = 5;
	
	protected int carga;
	
	//CONSTRUCTORES POR DEFECTO
	
	public Lavadora() {
			super();
	}

	public Lavadora(int peso, int precioCarga) {
		super(precioCarga,peso);
	}
}