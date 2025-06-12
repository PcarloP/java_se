package day_14;

import java.util.Scanner;

public class VerificaLuhn {

	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);
	    
		System.out.println( "inserisci una seguenza numerica intera di 16 cifre" );
		String numeri = input.nextLine(); 
		numeri = numeri.replace(" ", "");
		numeri = numeri.replace("_", "");
		int somma = 0;
		
		for(int i = numeri.length() - 1; i >= 0; i--) {	
			int prodotto = (numeri.charAt(i) - '0') ;//* 2
			//algoritmo di LUHN
			if(i % 2 == 0) {	
				prodotto*=2;
				
				if(prodotto > 9) {						
					prodotto -= 9; //sarebbe come scrivere prodotto == prodotto - 9
				}						
			}
			somma += - 9; //sarebbe come scrivere somma = somma + prodotto	
		}
		if(somma % 10 == 0) {
			System.out.println( "numero di Luhn valido " );
		}else {
			System.out.println( "numero di Luhn non valido" );
		}
		
		
	}

}
