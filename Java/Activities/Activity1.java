package activities;


public class Activity1 {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		Car toyota  = new Car();
		toyota.make=2014;
		toyota.transmission="Manual";
		toyota.color="Black";
		
		toyota.displayCharacteristics();
		toyota.accelarate();
		toyota.brake();
	}

}
