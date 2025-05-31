package day_05;

/*Determinare se una parola o una frase è un isogramma.
* Un isogramma (noto anche come "parola non modello") 
* è una parola o una frasesenza una lettera ripetuta, 
* tuttavia spazi e trattini possono apparire più volte
*/
import java.util.HashSet;
import java.util.Scanner;

public class Isogramma {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Inserisci una parola o frase: ");
		String frase = scanner.nextLine();

		if (èIsogramma(frase)) {
			System.out.println("✅ È un isogramma!");
		} else {
			System.out.println("❌ Non è un isogramma.");
		}

		scanner.close();
	}

	public static boolean èIsogramma(String frase) {
		HashSet<Character> lettereViste = new HashSet<>();

		for (char c : frase.toLowerCase().toCharArray()) {
			if (Character.isLetter(c)) {
				if (lettereViste.contains(c)) {
					return false; // lettera già vista
				}
				lettereViste.add(c);
			}
			// Spazi e trattini vengono ignorati automaticamente
		}

		return true; // nessuna lettera ripetuta
	}
}