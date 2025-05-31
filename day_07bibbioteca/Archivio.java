package day_07bibbioteca;

import java.util.ArrayList;

public class Archivio {

	private ArrayList<Abbonato> abbonati;
	private ArrayList<Libro> libri;
	private Data dataAttuale;

	public Archivio(Data dataIniziale) {
		this.abbonati = new ArrayList<>();
		this.libri = new ArrayList<>();
		this.dataAttuale = dataIniziale;
	}

	public void nuovoLibro(String unTitolo) {
		Libro libro = new Libro(unTitolo, null, null);
		libri.add(libro);
	}

	// Aggiunge un nuovo abbonato alla lista
	public void nuovoUtente(String unNome, String unCognome) {
		Abbonato abbonato = new Abbonato(unNome, unCognome);
		abbonati.add(abbonato);
	}

	// Cerca un abbonato e restituisce l'indice (o -1 se non trovato)
	public int trovaUtente(String unNome, String unCognome) {
		for (int i = 0; i < abbonati.size(); i++) {
			Abbonato abb = abbonati.get(i);
			if (abb.getNome().equals(unNome) && abb.getCognome().equals(unCognome)) {
				return i;
			}
		}
		return -1;
	}

	// Calcola la data di scadenza aggiungendo 30 giorni alla data attuale
	public Data scadenza(Data date) {
		Data nuova = new Data(date.getDay(), date.getMonth(), date.getYear());
		for (int i = 0; i < 30; i++) {
			nuova.nextDay();
		}
		return nuova;
	}

	// Presta un libro a un utente, se disponibile
	public int presta(Libro unLibro, Abbonato unUtente) {
		if (unLibro.getAbbonato() != null) {
			return -1; // Libro già prestato
		}
		Data scadenza = scadenza(dataAttuale);
		unLibro.setAbbonato(unUtente);
		unLibro.setDataScadenza(scadenza);
		return 0; // Prestito avvenuto
	}

	// Avanza la data di un giorno
	public void aggiorna() {
		dataAttuale.nextDay();
	}

	// Conta quanti libri sono prestati a un determinato abbonato
	public int numLibri(Abbonato unAbb) {
		int count = 0;
		for (Libro libro : libri) {
			if (libro.getAbbonato() != null && libro.getAbbonato().getNome().equals(unAbb.getNome())
					&& libro.getAbbonato().getCognome().equals(unAbb.getCognome())) {
				count++;
			}
		}
		return count;
	}

	public Data getDataAttuale() {
		return dataAttuale;
	}

}
