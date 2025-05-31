package day_07Tennis;

import java.util.ArrayList;

public class Campo {

	private ArrayList<Prenotazione> prenotazioni = new ArrayList<>();

	public Campo() {
		prenotazioni = new ArrayList<>();
	}

	public boolean addPren(int inizio, int fine, String nome) {

		// Controllo validità orari
		if (inizio >= fine || inizio < 0 || fine > 24) {
			return false;
		}

		// Controlla sovrapposizione con prenotazioni esistenti
		for (Prenotazione p : prenotazioni) {
			if (!(fine <= p.getInizioOrario() || inizio >= p.getFineOrario())) {
				// Sovrapposizione trovata: campo non disponibile
				return false;
			}
		}

		// Se non c'è sovrapposizione, aggiungi la nuova prenotazione
		Tennista tennista = new Tennista(nome);

		// Aggiunge la nuova prenotazione
		Prenotazione nuovaPren = new Prenotazione(tennista, inizio, fine);
		prenotazioni.add(nuovaPren);
		return true;
	}

	// metodo per eliminare la prenotazione
	public boolean removePren(int inizio, int fine, String nome) {
		for (Prenotazione p : prenotazioni) {
			if (p.getTennista().getNome().equals(nome) && p.getInizioOrario() == inizio && p.getFineOrario() == fine) {

				prenotazioni.remove(p);
				return true;
			}
		}
		return false;
	}

	public double utilizzo() {
		int oreTotali = 0;
		for (Prenotazione p : prenotazioni) {
			oreTotali += p.getFineOrario() - p.getInizioOrario();
		}
		return (oreTotali / 24.0) * 100;
	}

	@Override
    public String toString() {
        if (prenotazioni.isEmpty()) {
            return "Nessuna prenotazione.";
        }
	
        StringBuilder sb = new StringBuilder("Prenotazioni del campo:\n");
        for (Prenotazione p : prenotazioni) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
	
	
	
	
	
	
	
}
