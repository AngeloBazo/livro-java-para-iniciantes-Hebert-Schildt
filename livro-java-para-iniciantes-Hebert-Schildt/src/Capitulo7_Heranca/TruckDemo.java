package Capitulo7_Heranca;

public class TruckDemo {

	public static void main(String[] args) {

		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000);
		double gallons;
		int dist = 252;

		gallons = semi.fuelneeded(dist);

		System.out.println("Semi can carry " + semi.getCargocap() + " punds.");

		System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");

		gallons = pickup.fuelneeded(dist);

		System.out.println("Semi can carry " + pickup.getCargocap() + " punds.");

		System.out.println("To go " + dist + " miles semi needs " + gallons +  " gallons of fuel.\n");

	}

}
