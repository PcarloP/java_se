package day_07CompagniaServizi;

	public class ClientiMobile extends Clienti {

	    private int gigaByte;
	    private double costoFisso;

	    public ClientiMobile(String nome, String cognome, int gigaByte) {
	        super(nome, cognome, 0);
	        this.gigaByte = gigaByte;
	    }

	    @Override
	    public void calcoloSpese() {
	        if (gigaByte < 30) {
	            costoFisso = 8;
	        } else if (gigaByte <= 80) {
	            costoFisso = 12;
	        } else {
	            costoFisso = 15;
	        }
	        prezzoDaPagare = costoFisso;
	    }

	    @Override
	    public String toString() {
	        return "Cliente Mobile: [" + nome + " " + cognome +
	               "][Giga consumati: " + gigaByte +
	               "][Prezzo fisso: €" + costoFisso +
	               "][Totale da pagare: €" + prezzoDaPagare + "]";
	    }
	}
	
	
	
	
	

