
public class Electrodomesticos {

	private float precioBase;
	private String color;
	private char consumoEnergetico;
	private float peso;
	
	public static final String [] COLORES_POR_DEFECTO = {"Blanco","Negro","Rojo","Azul","Gris"};	
	public static final char [] CONSUMO_POR_DEFECTO = {'A','B','C','D','E','F'};	
	public static final float PESO_POR_DEFECTO = 5;
	public static final float PRECIO_POR_DEFECTO=100;
	
	public Electrodomesticos() {
		
		this.precioBase=PRECIO_POR_DEFECTO;
		this.color=COLORES_POR_DEFECTO[0];
		this.consumoEnergetico=CONSUMO_POR_DEFECTO[5];
		this.peso=PESO_POR_DEFECTO;
		
	}
	
	public Electrodomesticos (float precioBase, float peso) {
		
		this.precioBase=precioBase;
		this.color=COLORES_POR_DEFECTO[0];
		this.consumoEnergetico=CONSUMO_POR_DEFECTO[5];
		this.peso=peso;
		
	}
	
	public Electrodomesticos (float precioBase,String color,char consumoEnergetico, float peso) {
		
		this.color=comprobarColor(color);
		this.consumoEnergetico=comprobarConsumoEnergetico(consumoEnergetico);
		this.peso=peso;
		this.precioBase=precioBase;
		
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	@Override
	public String toString() {
		return "Electrodomesticos [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

	public float getPeso() {
		return peso;
	}
	
	private char comprobarConsumoEnergetico(char letra) {
		
		for (int i=0;i<CONSUMO_POR_DEFECTO.length;i++) {
			
			if (letra==CONSUMO_POR_DEFECTO[i]) {
				
				return CONSUMO_POR_DEFECTO[i];
				
			}
			
		}
		
		return CONSUMO_POR_DEFECTO[5];
	}
	
	private String comprobarColor(String color) {
		
		for (int i=0;i<COLORES_POR_DEFECTO.length;i++) {
			
			if (color.equalsIgnoreCase(COLORES_POR_DEFECTO[i])) {
				
				return COLORES_POR_DEFECTO[i];
				
			} 
			
		}
		
		return COLORES_POR_DEFECTO[0];
		
	}
	
	public void precioFinal() {
		
		float precioLetra=0;		
		float precioPeso=0;
			
			switch (consumoEnergetico) {	
			case 'A':
				precioLetra=100;
				break;
			case 'B':
				precioLetra=80;
				break;
			case 'C':
				precioLetra=60;
				break;
			case 'D':
				precioLetra=50;
				break;
			case 'E':
				precioLetra=30;
				break;
			case 'F':
				precioLetra=10;
				break;
			}

		
		if (peso<19) {
			precioPeso=10;
		} if (peso>=20 && peso<50) {
			precioPeso=50;
		} if (peso>=20 && peso<80) {
			precioPeso=80;
		} else if (peso>=80){
			precioPeso=100;
		}
		
		final float PRECIO_FINAL=precioLetra+precioPeso+precioBase;
		
		System.out.println("El precio final del producto es de: "+PRECIO_FINAL+" €.");
	}

}
