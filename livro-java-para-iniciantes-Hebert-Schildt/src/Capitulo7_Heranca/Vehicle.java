package Capitulo7_Heranca;

public class Vehicle {

	private int passengers;
	private int fuelcap;
	private int mpg;

	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	int range() {
		return mpg * fuelcap;
	}

	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getFuelcap() {
		return fuelcap;
	}

	public void setFuelcap(int fuelcap) {
		this.fuelcap = fuelcap;
	}

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int mpg) {
		this.mpg = mpg;
	}

}
