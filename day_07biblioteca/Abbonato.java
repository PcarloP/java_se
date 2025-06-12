package day_07bibbioteca;

public class Abbonato {
	private String nome;
	private String cognome;

	public Abbonato(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Abbonato [nome=" + nome + ", cognome=" + cognome + "]";
	}

}
