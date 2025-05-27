package day_03;

public class TipiNumerici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	byte NumeroByte =122 ;//rappresentazione  in binario01111010
	short NumeroShort = NumeroByte;//rappresentazione  in binario 00000000 01111010
	int NumeroInt = NumeroShort;//rappresentazione  in binario 00000000 00000000 00000000 01111010
	long NumeroLong = NumeroInt;//rappresentazione  in binario 00000000 00000000 00000000 00000000 00000000 00000000 01111010
	
	float NumeroFloat = NumeroLong;
	double NumeroDouble = NumeroFloat;
			
		System.out.println("numero double "+ NumeroDouble);	
		
	}

}
