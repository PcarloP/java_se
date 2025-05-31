package day_06;

/*La classe dell'asilo sta imparando a coltivare le piante. 
*L'insegnante ha pensato che sarebbe stata una buona idea dare alla classe dei semi da piantare 
* e far crescere nella terra. A questo scopo, ibambini hanno messo delle piccole tazze lungo i davanzali 
* delle finestre e hanno piantato un tipo dipianta in ogni tazza. I bambini hanno potuto scegliere 
* i loro preferiti tra quattro tipi di semidisponibili: erba, trifoglio, ravanelli e violette. 
 */

public class GiardinoDellAsilo {

	public static void main(String[] args) {
		
	String[] bambini = { "Alice","Bob","Charlie","David","Eve","Fred","Ginny",
			             "Harriet","Ileana","Joseph","Kincaid","Larry"};
		
		
	String riga1 = "ggccrreeggccrreeggccrree";
	String riga2 = "ggccrreeggccrreeggccrree";
		
		
		for(int i=0; i < bambini.length;i++) {
			System.out.print(bambini[i] + "\t");
			System.out.print(riga1.charAt(2 * i));
		    System.out.print(riga1.charAt(2 * i + 1));
		    System.out.print(riga2.charAt(2 * i));
		    System.out.print(riga2.charAt(2 * i + 1));
		    System.out.println();
		}
		

		
		
	}

}
