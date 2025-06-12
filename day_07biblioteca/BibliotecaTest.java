package day_07bibbioteca;

public class Main {

	public static void main(String[] args) {
		
       
        Abbonato ab1 = new Abbonato("Mario", "Rossi");

        // Creo una data di scadenza
        Data dataScadenza = new Data(15, 6, 2025);

        // Creo un libro associato all'abbonato e con la data di scadenza
        Libro libro1 = new Libro("Il Signore degli Anelli", ab1, dataScadenza);

        // Stampo le informazioni
        System.out.println("Libro: " + libro1.getTitolo());
        System.out.println("Prestato a: " + libro1.getAbbonato().getNome() + " " + libro1.getAbbonato().getCognome());
        System.out.println("Data scadenza prestito: " + libro1.getDataScadenza());

        // Uso il metodo nextDay per aggiornare la data scadenza e stampare di nuovo
        libro1.getDataScadenza().nextDay();
        System.out.println("Data scadenza aggiornata: " + libro1.getDataScadenza());
		

	}

}
