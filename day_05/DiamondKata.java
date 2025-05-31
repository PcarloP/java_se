package day_05;

/*Il kata di diamante prende come input una lettera e la emette a forma di diamante. 
*Datauna lettera, stampa un diamante che inizia con 'A', con la lettera fornita nel punto più largo.
*RequisitiLa prima riga contiene una 'A'.L'ultima riga contiene una 'A'.
*Tutte le righe, tranne la prima e l'ultima, hanno esattamente due lettere identiche.
*Tutte le file hanno tanti spazi finali quanti spazi principali. 
*(Questo potrebbe essere 0).Il diamante è simmetrico orizzontalmente.Il diamante è simmetrico verticalmente.
*Il diamante ha forma quadrata (larghezza uguale altezza).Le lettere formano una forma a diamante.
*La metà superiore ha le lettere in ordine crescente.La metà inferiore ha le lettere in ordine decrescente.
*I quattro angoli ( contenenti gli spazi) sono triangoli.
*/

public class DiamondKata {

    public static void printDiamond(char letter) {
        int size = letter - 'A';
        int width = size * 2 + 1;

        // Parte superiore inclusa la riga centrale
        for (int i = 0; i <= size; i++) {
            char currentChar = (char) ('A' + i);
            printLine(currentChar, i, size);
        }

        // Parte inferiore
        for (int i = size - 1; i >= 0; i--) {
            char currentChar = (char) ('A' + i);
            printLine(currentChar, i, size);
        }
    }

    private static void printLine(char currentChar, int position, int size) {
        int outerSpaces = size - position;
        int innerSpaces = position == 0 ? 0 : position * 2 - 1;

        // Spazi esterni
        for (int i = 0; i < outerSpaces; i++) {
            System.out.print(" ");
        }

        // Prima lettera
        System.out.print(currentChar);

        // Spazi interni + seconda lettera se non è la 'A'
        if (position != 0) {
            for (int i = 0; i < innerSpaces; i++) {
                System.out.print(" ");
            }
            System.out.print(currentChar);
        }

        // Spazi esterni (non necessari ma rendono tutto simmetrico se si vuole gestire stringhe)
        System.out.println();
    }

    public static void main(String[] args) {
        printDiamond('C');  // Prova con la lettera C
    }
}
