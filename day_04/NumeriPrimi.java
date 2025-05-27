package day_04;

//Scrivi un programma Java che verifica se un numero dato è primo o meno. 

import java.util.Scanner;

public class NumeriPrimi {

	public static boolean èPrimo(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Inserisci un numero: ");
		int numero = input.nextInt();

		if (èPrimo(numero)) {
			System.out.println(numero + " è un numero primo.");
		} else {
			System.out.println(numero + " NON è un numero primo.");
		}

		input.close();

	}

}
