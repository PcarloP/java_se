package day_08CodiceISBN;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci codice ISBN valido (10 caratteri):");
        String isbn = scanner.nextLine();

        // Rimuovi spazi o trattini se presenti (opzionale)
        isbn = isbn.replace(" ", "").replace("-", "");

        // Gestione del carattere 'X' alla fine
        if (isbn.charAt(isbn.length() - 1) == 'x' || isbn.charAt(isbn.length() - 1) == 'X') {
            isbn = isbn.substring(0, isbn.length() - 1) + "10";
        }

        int somma = 0;
        for (int i = 10, j = 0; i >= 1; i--, j++) {
            int cifra;
            if (isbn.charAt(j) == 'X' || isbn.charAt(j) == 'x') {
                cifra = 10;
            } else {
                cifra = isbn.charAt(j) - '0';
            }
            somma += cifra * i;
        }

        if (somma % 11 == 0) {
            System.out.println("ISBN è valido");
        } else {
            System.out.println("ISBN non valido");
        }

        scanner.close();
    }
}
