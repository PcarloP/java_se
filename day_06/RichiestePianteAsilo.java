package day_06;

import java.util.*;

public class RichiestePianteAsilo {

	public static void main(String[] args) {

		String[] bambini = { "Alice", "Bob","Charlie","David","Eve","Fred","Ginny", 
				             "Harriet","Ileana","Joseph","Kincaid","Larry" };

		String giardino = "VRCGVVRVCGGCCGVRGCVCGCGVVRCCCGCRRGVCGCRVVCVGCGCV";
		String giardino1 = giardino.substring(0, 24);
		String giardino2 = giardino.substring(24, 48);

		Map<String, List<String>> semiBambini = new HashMap<>();

		for (int i = 0; i < bambini.length; i++) {
			List<String> piante = new ArrayList<>();
			
			piante.add(traduciPianta(giardino1.charAt(2 * i)));
			piante.add(traduciPianta(giardino1.charAt(2 * i + 1)));
			piante.add(traduciPianta(giardino2.charAt(2 * i)));
			piante.add(traduciPianta(giardino2.charAt(2 * i + 1)));
			semiBambini.put(bambini[i], piante);
		}

		System.out.println("Piante di Alice:\t" + semiBambini.get("Alice"));
		System.out.println("Piante di Bob:  \t" + semiBambini.get("Bob"));
	}
	
	public static String traduciPianta(char codice) {
		switch (codice) {
		case 'V':
			return "Violetta";
		case 'R':
			return "Ravanello";
		case 'C':
			return "Trifoglio";
		case 'G':
			return "Erba";
		default:
			return "Sconosciuta";
		}

	}

}
