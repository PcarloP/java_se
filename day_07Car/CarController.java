package day_07Car;

public class CarController {

	public static void AggiornaFuel(Car car , double km) {
		double consumo = km *car.getConsumoMedio();
		
		car.setFuel(car.getFuel() - consumo);
		
	}		
}
