package day_03;

public class InizialiGrandi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String[] c = {				
			"   ###   ",	
			"  #    # ",	
			" #       ",	
			" #       ",	
			" #       ",	
			"  #      ",	
			"   ###   "				        
		};
		String[] p = {
			
		     "######   ",	
			 "#      # ",	
			 "#      # ",	
			 "######   ",	
			 "#        ",	
		     "#        ",
		     "#        "	     
		};
	
		int larghezzaSpazzi = 80;
		
		for(int i =0; i < c.length;i++) {
			String riga = c[i] +" " +p[i];
			int spazzi = (larghezzaSpazzi-riga.length())/2;
			System.out.println( " ".repeat(spazzi ) + riga);			
		}
	}
}
