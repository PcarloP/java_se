package day_07Employee;

public class DipendenteController {

	
	public static void raiseSalary(Employee empl,double byPercent) {
		
		
		double incremento = empl.getStipendio()* (1 + byPercent);	
		empl.setStipendio( incremento + empl.getStipendio());
		
	}
			
}
