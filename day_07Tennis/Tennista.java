package day_07Tennis;

public class Tennista {

	private String nome;
	
	
	public Tennista() {
		super();
	}

	public Tennista(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	@Override
	public String toString() {
		return "Tennista [nome= " + nome + "]";
	}
	

	
}
