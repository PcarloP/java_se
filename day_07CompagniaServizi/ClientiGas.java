package day_07CompagniaServizi;

public class ClientiGas extends Clienti {

	private double metroCubi;
	private double costoMetroCubo;

	public ClientiGas(String nome, String cognome, double metroCubi) {
		super(nome, cognome, 0);
		this.metroCubi = metroCubi;
	}
	@Override
	public void calcoloSpese( ) {
		if(metroCubi > 0 && metroCubi <= 50) {
			costoMetroCubo = 1;
			
		}else if(metroCubi >= 50 && metroCubi <= 80) {
			costoMetroCubo = 0.80;
			
		}else {
			costoMetroCubo = 0.70;
		}
		prezzoDaPagare = metroCubi * costoMetroCubo;
	}
	@Override
	public String toString() {
		return "Clienti Gas: "+ nome +" "+ cognome+ " [metroCubi consumati = " + metroCubi + "][costo per Metro Cubo= " + costoMetroCubo +
				"][prezzo totale da pagare= "+ prezzoDaPagare +"]";
	}
	
	
	
	
	
	
	
}
