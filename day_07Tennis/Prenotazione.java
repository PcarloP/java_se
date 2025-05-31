package day_07Tennis;

public class Prenotazione {

	private Tennista  tennista;
	private  int inizioOrario;
	private  int fineOrario;
	
	public Prenotazione() {
		super();
	}

	public Prenotazione(Tennista tennista, int inizioOrario, int fineOrario) {
		super();
		this.tennista = tennista;
		this.inizioOrario = inizioOrario;
		this.fineOrario = fineOrario;
	}

	public Tennista getTennista() {
		return tennista;
	}

	public void setTennista(Tennista tennista) {
		this.tennista = tennista;
	}

	public int getInizioOrario() {
		return inizioOrario;
	}

	public void setInizioOrario(int inizioOrario) {
		this.inizioOrario = inizioOrario;
	}

	public int getFineOrario() {
		return fineOrario;
	}

	public void setFineOrario(int fineOrario) {
		this.fineOrario = fineOrario;
	}

	@Override
	public String toString() {
		return "Prenotazione [tennista= " + tennista + ", inizioOrario= " + inizioOrario + ", fineOrario= " + fineOrario
				+ "]";
	}


	
	
}
