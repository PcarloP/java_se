package day_07Tennis;

public class Main {

	public static void main(String[] args) {
		
		Campo campo = new Campo();
		
		 // Prenotazioni
        campo.addPren(9, 11, "Luca");
        campo.addPren(12, 14, "Marco");
        campo.addPren(15, 17, "Anna");

        // Prova sovrapposizione (non verrà aggiunta)
        boolean successo = campo.addPren(10, 13, "Giulia");
        System.out.println("Prenotazione Giulia riuscita? " + successo);

        // Visualizza prenotazioni
        System.out.println(campo.toString());

        // Rimuovi una prenotazione
        campo.removePren(12, 14, "Marco");

        // Visualizza aggiornato
        System.out.println("\nDopo la rimozione:");
        System.out.println(campo);

        // Percentuale di utilizzo
        System.out.printf("Utilizzo del campo: %.2f%%\n", campo.utilizzo());
        
        
        
        
        
        
	/*	
		Tennista tennista1 = new Tennista( "Eduardo" ) ;
		Tennista tennista2 = new Tennista( "Antonio" );
		Tennista tennista3 = new Tennista( "Anna" );
		
		
		Prenotazione prenot = new Prenotazione( tennista1,10,11 );
		System.out.println(prenot);
		*/
		
		
		
		
	}

}
