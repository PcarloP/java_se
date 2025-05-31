package day_07veicoli;

public class Camion extends Veicolo {

	private int capacitaMassima;

	public Camion(String marca, String modello, String targa, int numeroPosti, int capacitaMassima) {
		super(marca, modello, targa, numeroPosti);
		this.capacitaMassima = capacitaMassima;
	}

	public int getCapacitaMassima() {
		return capacitaMassima;
	}

	public void setCapacitaMassima(int capacitaMassima) {
		this.capacitaMassima = capacitaMassima;
	}

	@Override
	public String toString() {
		return super.toString() + ", capacitaMassima= " + capacitaMassima;
	}
}
