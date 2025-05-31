package day_05;

/*La Congettura di Collatz o problema 3x+1 può essere riassunta come segue:
*Prendi qualsiasi numero intero positivo n. Se n è pari, dividi n per 2 per ottenere n / 2.
*Se n è dispari, moltiplicare n per 3 e aggiungere 1 per ottenere 3n + 1. Ripetere il processoindefinitamente. 
*La congettura afferma che non importa con quale numero inizi, alla fine raggiungerai sempre 1.
*Dato un numero n, restituire il numero di passi necessari per raggiungere 1.
*/

public class CollatzConjecture {

	public static int collatzSteps(int n) {
		
		int steps = 0;
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			steps++;
		}
		return steps;
	}

	public static void main(String[] args) {

		int n = 12; 
		int result = collatzSteps(n);
		System.out.println("Numero di passaggi per arrivare a 1 partendo da " + n + ": " + result);

	}

}
