package day_07Car;

public class Car {

	private String targa;
	private String marca;
	private String modello;
	private double fuel;
	private double consumoMedio;

	// costruttore defailt
	public Car() {
		super();

	}

	// costruttore parametrico
	public Car(String targa, String marca, String modello, double fuel, double consumoModello) {
		super();
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.fuel = fuel;
		this.consumoMedio = consumoMedio;

	}

	public String getTarga() {
		return this.targa;
	}

	public void setTarga(String targa) {
		 this.targa = targa;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		 this.marca = marca;
	}

	public String getModello() {
		return this.modello;
	}

	public void setModello(String modello) {
		 this.modello = modello;
	}

	public double getFuel() {
		return this.fuel;
	}

	public void setFuel(double fuel) {
		 this.fuel = fuel;
	}

	public double getConsumoMedio() {
		return this.consumoMedio;
	}

	public void setConsumoMedio(double consumoMedio) {
		 this.consumoMedio = consumoMedio;
	}

	/*
	 * public static void main(String[] args) { Car panda = new Car(); Car ferrari =
	 * new Car("1245", "ferrari", "f50", 100.0, 1); Car bmw = new Car("g080", "bmw",
	 * "m4", 60.0, 0.8);
	 * 
	 * }
	 */
	
	public String toString() {
		return "["  + " targa : " + this.targa + " marca : " + this.marca +
				" modello :" + this.modello + " fuel :" + this.fuel + " ConsumoMedio : " + this.consumoMedio + "]";
	}
	
	
	
	

}
