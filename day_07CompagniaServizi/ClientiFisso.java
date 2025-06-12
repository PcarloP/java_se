package day_07CompagniaServizi;

public class ClientiFisso extends  Clienti {
	
	private String tipoCliente;
	
	public ClientiFisso(String nome, String cognome, String tipoCliente) {
		super(nome, cognome, 0); 
		this.tipoCliente = tipoCliente.toUpperCase(); 
	}
	
	@Override
	public void calcoloSpese() {
		if (tipoCliente.equals("STANDARD")) {
			prezzoDaPagare = 30;
		} else if (tipoCliente.equals("SPECIAL")) {
			prezzoDaPagare = 50;
		} else if (tipoCliente.equals("SUPERSPECIAL")) {
			prezzoDaPagare = 60;
		} else {
			System.out.println("Tipo cliente non valido: " + tipoCliente);
			prezzoDaPagare = 0;
		}
	}

	@Override
	public String toString() {
		return "Cliente Fisso: [" + nome + " " + cognome +
		       "][Tipo: " + tipoCliente +
		       "][Totale da pagare: €" + prezzoDaPagare + "]";
	}
}
	

