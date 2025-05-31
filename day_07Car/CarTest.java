package day_07Car;

public class CarTest {

	public static void main(String[] args) {
	
		Car panda = new Car();
		Car ferrari = new Car("1245","ferrari","f50",100.0,1);
        Car bmw = new Car( "yz594", "bmw", "sport",25.0, 2 );
		
	//	System.out.println( "targa ferrari" + ferrari.getTarga());
		ferrari.setTarga( "aaaa" );
		//System.out.println( "targa ferrari" + ferrari.getTarga());
      //  panda.setTarga("ds125zy");
       // System.out.println("targa panda :"+ panda.getTarga());
        
        System.out.println(ferrari);
        CarController.AggiornaFuel(ferrari,10);
        System.out.println(ferrari);
        //dal punto di vista logica non e corretto la dintassi si 
        CarController contr = new CarController();
        
        System.out.println(bmw);
	}
}
