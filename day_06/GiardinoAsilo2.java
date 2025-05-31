package day_06;

public class GiardinoAsilo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] bambini = { "Alice","Bob","Charlie","David","Eve","Fred","Ginny",
				             "Harriet","Ileana","Joseph","Kincaid","Larry" };

		String giardino = "VRCGVVRVCGGCCGVRGCVCGCGVVRCCCGCRRGVCGCRVVCVGCGCV";

		String giardino1 = giardino.substring(0, 24);
		String giardino2 = giardino.substring(24, 48);

		for (int i = 0; i < bambini.length; i++) {
			System.out.print(bambini[i] + "\t");
			System.out.print(giardino1.charAt(2 * i));
			System.out.print(giardino1.charAt(2 * i + 1));
			System.out.print(giardino2.charAt(2 * i));
			System.out.print(giardino2.charAt(2 * i + 1));
			System.out.println();
		}
	}
}