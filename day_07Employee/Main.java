package day_07Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee dipendente = new Employee("jgdf5dq","carlo",1200);
		Employee dipendente2 = new Employee("cfv","antonio",1300);

		System.out.println(dipendente);
		System.out.println(dipendente2);
		
		
		DipendenteController.raiseSalary(dipendente, 0.10);
		   System.out.println( dipendente );
		
		
		
	}
	
}
