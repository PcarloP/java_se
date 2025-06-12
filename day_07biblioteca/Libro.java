package day_07bibbioteca;

public class Libro {
	private String titolo;
	private Abbonato abbonato;;
	private Data dataScadenza;

	public Libro() {
		super();
	}

	public Libro(String titolo, Abbonato abbonato, Data dataScadenza) {
		super();

		this.titolo = titolo;
		this.abbonato = abbonato;
		this.dataScadenza = dataScadenza;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Abbonato getAbbonato() {
		return abbonato;
	}

	public void setAbbonato(Abbonato abbonato) {
		this.abbonato = abbonato;
	}

	public Data getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(Data dataScadenza) {
		this.dataScadenza = dataScadenza;
	};

}
