package day_05;

public class DiamanteData {


    public static void main(String[] args) {
    	
        char letteraFinale = 'E'; 
        stampaDiamante(letteraFinale);
    }

    public static void stampaDiamante(char letteraFinale) {
        int altezza = letteraFinale - 'A';
        int larghezza = 2 * altezza + 1;

        for (int i = 0; i <= altezza; i++) {
            stampaRiga(i, altezza);
        }

        for (int i = altezza - 1; i >= 0; i--) {
            stampaRiga(i, altezza);
        }
    }

    public static void stampaRiga(int riga, int altezza) {
        char lettera = (char) ('A' + riga);
        int spaziEsterni = altezza - riga;
        int spaziInterni = riga == 0 ? 0 : 2 * riga - 1;

        // Spazi esterni
        for (int i = 0; i < spaziEsterni; i++) {
            System.out.print("·");
        }

        // Prima lettera
        System.out.print(lettera);

        // Spazi interni e seconda lettera
        if (spaziInterni > 0) {
            for (int i = 0; i < spaziInterni; i++) {
                System.out.print("·");
            }
            System.out.print(lettera);
        }

        // Spazi esterni
        for (int i = 0; i < spaziEsterni; i++) {
            System.out.print("·");
        }

        System.out.println();
    }
}
