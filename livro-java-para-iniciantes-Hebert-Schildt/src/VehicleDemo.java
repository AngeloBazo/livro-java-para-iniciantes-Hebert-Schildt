// programa que sua a classe Vehicle
class Vehicle {

	int passangers; // n passageiros
	int fuelcap; // cap de armz de combust em galoes
	int mpg; // consumo em milhas/galão
}

// essa classe declara um objeto de tipo Vehicle

class VehicleDemo {
	
	public static void main(String args[]) {
	
		Vehicle minivan = new Vehicle();
	
		int range;

		// atribui valores a cada campo de minivan
		minivan.passangers = 7;
		minivan.fuelcap = 16; // observe o uso do operador ponto para o acesso a um membro
		minivan.mpg = 21;

		// calcula a autonomia presumindo um tanque cheio de gasolina
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passangers + " with a range of " + range);

	}
}