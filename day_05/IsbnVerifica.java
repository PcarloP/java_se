package day_05;

public class IsbnVerifica {

    public static boolean isValidISBN10(String isbn) {
        // Rimuove i trattini
        isbn = isbn.replace("-", "");
        
        // Controlla la lunghezza
        if (isbn.length() != 10) {
            return false;
        }
        
        // Controlla i primi 9 caratteri: devono essere cifre
        for (int i = 0; i < 9; i++) {
            if (!Character.isDigit(isbn.charAt(i))) {
                return false;
            }
        }
        
        // Controlla l'ultimo carattere: cifra o 'X'
        char lastChar = isbn.charAt(9);
        if (!(Character.isDigit(lastChar) || lastChar == 'X')) {
            return false;
        }
        
        // Calcola la somma ponderata
        int total = 0;
        for (int i = 0; i < 9; i++) {
            total += (isbn.charAt(i) - '0') * (10 - i);
        }
        
        // Gestisce il carattere di controllo
        if (lastChar == 'X') {
            total += 10;
        } else {
            total += (lastChar - '0');
        }
        
        // Controlla la validità
        return total % 11 == 0;
    }

    public static void main(String[] args) {
        String[] testISBNs = {
            "3-598-21508-8",  // valido
            "3-598-21507-X",  // valido
            "3-598-21507-9",  // non valido
            "3598215088",     // valido senza trattini
            "359821507X",     // valido senza trattini con X
            "3598215079"      // non valido senza trattini
        };
        
        for (String isbn : testISBNs) {
            System.out.println(isbn + ": " + isValidISBN10(isbn));
        }
    }
}
