
public class testBike {

	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.color = "black";
		b.startBike();
		
		makeHonda m = new makeHonda();
		m.color = "Blue";
		m.startBike();
		m.tyreType();

		Bike b1 = new makeHonda();
		b1.startBike();
		b1.stopBike();
	}

}
