package day_02;

import java.util.Scanner;

public class AreaCerchio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
		
		
		System.out.println("Inserisci il raggio del cerchio: "); 
		double raggio = input.nextDouble();
		double area = Math.PI * raggio * raggio;
	     
		System.out.println("l'area del cerchio è: " + area); 
		input.close(); 
		

	
	}

}
