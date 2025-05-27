package day_04;

/*Scrivi un programma Java 
* che calcola il valore massimo e il valore minimopresenti in un array di interi 
*/
public class ArrayMinMax {

	public static void main(String[] args) {

		int[] numeri = {12, 5, 8, 20, 3, 17, 6};

        
        int minimo = numeri[0];
        int massimo = numeri[0];

      
        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] < minimo) {
                minimo = numeri[i];
            }
            if (numeri[i] > massimo) {
                massimo = numeri[i];
            }
        }

        System.out.println("Valore minimo: " + minimo);
        System.out.println("Valore massimo: " + massimo);	
	}

}
