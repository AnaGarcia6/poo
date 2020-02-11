package poo;

public class Electrodomestico {

	//CONSTANTES

	protected final static String COLOR = "blanco";

	protected final static char CONSUMO_ENERGETICO = 'f';

	protected final static double PRECIO_BASE = 100; //PORQUE MEJOR DOUBLE?

	protected final static double PESO = 5;

	//ATRIBUTOS

	protected double precioBase;
	protected String color;
	protected char consumoEnergetico; 
	protected double peso;

	//METODOS

	private void elegirColores (String color) {
		String [] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
		
	}

	//el consumo energetico ira desde la A y F que es desde el 65 al 70

	private void valorConsumoEnergetico (char consumoEnergetico){

		if (consumoEnergetico >= 65 && consumoEnergetico <= 70) {

			this.consumoEnergetico = consumoEnergetico;
		} 
		else {

			this.consumoEnergetico = CONSUMO_ENERGETICO;

		}
	}
	
	
	//CONSTRUCTORES POR DEFECTO
	
	public Electrodomestico() {
		
		this(COLOR, CONSUMO_ENERGETICO, PRECIO_BASE, PESO);
	}
	
	//CONSTRUCTOR CON EL PRECIO Y PESO. EL RESTO POR DEFECTO
	
	public Electrodomestico(double precioBase, double peso) {
		
		this.peso = peso;
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
	}
	
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		
		this.peso = peso;
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
	}

	//CONSTRUCTOR CON TODOS LOS ATRIBUTOS 
	
	public Electrodomestico(String color, char consumoEnergetico, double precioBase2, double peso) {
		
	//this(COLOR, CONSUMO_ENERGETICO, PRECIO_BASE, PESO); no se puede poner asi porque se esta llamando a si mismo todo el rato 
	
	}
	
	//GET DE TODOS LOS ATRIBUTOS

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
}
 