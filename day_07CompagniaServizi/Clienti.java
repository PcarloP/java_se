package day_07CompagniaServizi;

public abstract class Clienti {

	protected String nome;
	protected String cognome;
	protected double prezzoDaPagare;

	public Clienti(String nome, String cognome, double prezzoDaPagare) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.prezzoDaPagare = prezzoDaPagare;
	}
	
	public abstract void calcoloSpese()	;
	
	@Override
	public String toString() {
		return "Clienti [nome= " + nome + ", cognome= " + cognome + ", prezzoDaPagare= " + prezzoDaPagare + "]";
	}

}
