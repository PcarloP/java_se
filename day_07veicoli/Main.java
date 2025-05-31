package day_07veicoli;

public class Main {

	public static void main(String[] args) {


		Veicolo veicolo = new Veicolo("car","fwe","cwe",5);
		
		
		System.out.println(veicolo);
		
		
		Veicolo[] veicoli = new Veicolo[6];

        veicoli[0] = new Auto("Fiat", "Panda", "AA123BB", 4, 5);
        veicoli[1] = new Camion("Iveco", "Eurocargo", "CC456DD", 2, 12000);
        // Aggiungi altri veicoli a piacere

        for (Veicolo v : veicoli) {
            if (v != null) {
                System.out.println(v);
            }
        }
		
		
		
		
		
		
		
		
	}

}
