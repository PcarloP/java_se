package day_07veicoli;

public class Auto extends Veicolo {
	private int numeroPorte;

	public Auto(String marca, String modello, String targa, int numeroPosti, int numeroPorte) {
		super(marca, modello, targa, numeroPosti);
		this.numeroPorte = numeroPorte;
	}

	public int getNumeroPorte() {
		return numeroPorte;
	}

	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}

	@Override
	public String toString() {
		return super.toString() + ", numeroPorte=" + numeroPorte;

	}
}