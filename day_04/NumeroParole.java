package day_04;

/*Scrivi un programma Java che calcola il numero di parole presenti in unastringa data.
*  Si considera una parola come una sequenza di caratteriseparati da spazi 
*/
import java.util.Scanner;       

public class NumeroParole {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);

		
        
        System.out.print("Inserisci una frase: ");       
        String input = scanner.nextLine();

        // trim() Rimuove spazi iniziali e finali , .split("\\s+") poi divide la stringa in base agli spazi
        String[] parole = input.trim().split("\\s+");

        //.isEmpty() Controlla se la stringa è vuota
        int numeroParole = (input.trim().isEmpty()) ? 0 : parole.length;

        
        System.out.println("Numero di parole: " + numeroParole);
        
        scanner.close();


	}

}
