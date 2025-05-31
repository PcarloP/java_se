package day_07Assicurazione;

import java.time.LocalDate;

public class Archivio {

	public static void main(String[] args) {
	
    
		Cliente bruno = new Cliente( " cf1 ","bruno ", " rossi", LocalDate.of(1998 , 6 , 3 ));
		Cliente carlo = new Cliente( " dfj ","carlo ", " verdi", LocalDate.of( 1990 , 3 , 5 ));
		Cliente anna = new Cliente( " ghj ","anna ", " marroni", LocalDate.of( 1999 , 4 , 5 ));
	/* 	 
		System.out.println(bruno);
		System.out.println(carlo);
		System.out.println(anna);
	*/	
		System.out.println();
		
		Veicolo veicolo1 = new Veicolo( "targa1",bruno );
		Veicolo veicolo2 = new Veicolo( "targa2",carlo );
		Veicolo veicolo3 = new Veicolo( "targa3",anna );
		
		System.out.println(veicolo1);
		System.out.println(veicolo2);
		System.out.println(veicolo3);
	
	    System.out.println("\n oggetti array : \n");
		 
		Veicolo[] archivio = {veicolo1,veicolo2,veicolo3};
		
		for(int i = 0; i < archivio.length;i++) {
			System.out.println(archivio[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
