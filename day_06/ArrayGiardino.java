package day_06;

public class ArrayGiardino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] bambini = { "Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph",
				"Kincaid", "Larry" };

		String riga1 = "ggccrreeggccrreeggccrree";
		String riga2 = "ggccrreeggccrreeggccrree";

		String[][] semiBambini = new String[12][4];

		for (int i = 0; i < bambini.length; i++) {
			semiBambini[i][0] = String.valueOf(riga1.charAt(2 * i));
			semiBambini[i][1] = String.valueOf(riga1.charAt(2 * i + 1));
			semiBambini[i][2] = String.valueOf(riga2.charAt(2 * i));
			semiBambini[i][3] = String.valueOf(riga2.charAt(2 * i + 1));
		}

		for (int i = 0; i < bambini.length; i++) {
			System.out.print(bambini[i] + "\t");			
			for (int j = 0; j < 4; j++) {
				System.out.print(semiBambini[i][j]);
			}
			System.out.println();
		}

	}

}
