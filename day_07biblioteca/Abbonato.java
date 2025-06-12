package day_07biblioteca;

import java.util.Objects;

public class Abbonato {
	private String cf;
	private String nome;
	private String cognome;
	
	public Abbonato() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Abbonato(String cf, String nome, String cognome) {
		super();
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
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
	public int hashCode() {
		return Objects.hash(cf, cognome, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Abbonato other = (Abbonato) obj;
		return Objects.equals(cf, other.cf) && Objects.equals(cognome, other.cognome)
				&& Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "Abbonati [cf=" + this.cf + ", nome=" + this.nome + ", cognome=" + this.cognome + "]";
	}


}