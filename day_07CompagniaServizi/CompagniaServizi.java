package day_07CompagniaServizi;

import java.util.ArrayList;

public class CompagniaServizi {

	public static void main(String[] args) {
		
        ArrayList<Clienti> clienti = new ArrayList<>();
		
        clienti.add(new ClientiLuce("Mario", "Rossi", 250));
        clienti.add(new ClientiLuce("Anna", "Verdi", 750));
        clienti.add(new ClientiGas("Luca", "Bianchi", 45));
        clienti.add(new ClientiGas("Paola", "Neri", 85));
        clienti.add(new ClientiFisso("Giulia", "Moretti", "STANDARD"));
        clienti.add(new ClientiFisso("Alessandro", "Ferrari", "SUPERSPECIAL"));
        clienti.add(new ClientiMobile("Francesca", "Gialli", 90));
        clienti.add(new ClientiMobile("Davide", "Blu", 350));
		
        ClientiLuce cliente1 = new ClientiLuce("Mario", "Rossi", 450);
		cliente1.calcoloSpese();
		System.out.println(cliente1);
		
		
		ClientiGas clienteGas = new ClientiGas("Luisa", "Bianchi", 75);
        clienteGas.calcoloSpese();
        System.out.println(clienteGas);

        for(Clienti cliente : clienti) {
            
            cliente.calcoloSpese();  
            System.out.println();
            System.out.println(cliente);
		
        }
		
	}

}
