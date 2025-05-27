package day_04;

/*Scrivi un programma Java 
*che calcola la media dei valori presenti in unarray di numeri in virgola mobile (double).
*/

public class MediaArray {

	public static void main(String[] args) {
	
		double[] numeri = {50.3, 15.5, -45.6, 20.34, 33.0, 45.6};
        double somma = 0.0;

        for (double numero : numeri) {
            somma += numero;
        }

        double media = somma / numeri.length;
        System.out.println("la media compresa nell array è :"+ media);
		
				
	}

}
