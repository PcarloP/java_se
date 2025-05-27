package day_03;
/*Calcolo dell'area di un trapezio 
* Implementa un programma che chieda all'utente di inserire la lunghezza delle basi e l'altezza di un trapezio
* e calcoli la sua area utilizzando leformule geometriche.
*/

import java.util.Scanner;

public class AreaTrapezio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("inserisci la lunghezza della base minore del trapezio");
		double baseMinore = input.nextDouble();
		
		System.out.println("inserisci la lunghezza della base maggiore del trapezio");
		double baseMaggiore = input.nextDouble();
		
		System.out.println( "inserisci l'altezza del trapezio " );
		double altezzaTrapezio = input.nextDouble();
		
		double area = ((baseMinore + baseMaggiore) * altezzaTrapezio) /2 ;
		System.out.println(" l'area del trapezio è : " + area);
		
		input.close();
	}

}
