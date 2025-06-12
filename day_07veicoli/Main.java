package day_07veicoli;

public class Main {

	public static void main(String[] args) {


		Veicolo veicolo = new Veicolo("car","fwe","cwe",5);
		
		
		System.out.println(veicolo);
		
		
		Veicolo[] veicoli = new Veicolo[6];

		veicoli[0] = new Veicolo("Toyota", "Yaris", "AB123CD", 5);
        veicoli[1] = new Auto("Fiat", "Panda", "EF456GH", 4, 5);
        veicoli[2] = new Camion("Iveco", "Eurocargo", "IJ789KL", 2, 12000);
        veicoli[3] = new Auto("Volkswagen", "Golf", "MN012OP", 5, 3);
        veicoli[4] = new Camion("Mercedes", "Actros", "QR345ST", 2, 18000);
        veicoli[5] = new Veicolo("Ford", "Focus", "UV678WX", 5);


        for (Veicolo v : veicoli) {
            if (v != null) {
                System.out.println(   v  );
            }
        }
		
		
	}

}
