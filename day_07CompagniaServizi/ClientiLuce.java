package day_07CompagniaServizi;

public class ClientiLuce extends Clienti {
	
	private double kwh;
	private double costoKwh;

	public ClientiLuce(String nome, String cognome, double kwh) {
		super(nome, cognome, 0);
		this.kwh = kwh;
	}

	// metodo per il calcolo dei consumi Kwh + calcolo del totale da pagare
	@Override
	public void calcoloSpese() {

		if (kwh > 0 && kwh <= 300) {
			costoKwh = 0.25;

		} else if (kwh > 300 && kwh <= 700) {
			costoKwh = 0.18;

		} else {
			costoKwh = 0.15;
		}
		prezzoDaPagare = kwh * costoKwh;
	}

	@Override
	public String toString() {

		return "Cliente Luce: " + nome + " " + cognome + " [ KWh consumati: " + kwh + " ][ Costo per KWh: " + costoKwh
				+ " ][ Totale da pagare: €" + prezzoDaPagare + "]";
	}

}
