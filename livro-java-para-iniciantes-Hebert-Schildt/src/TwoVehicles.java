// programa que sua a classe Vehicle02
class Vehicle02 {

	int passangers; // n passageiros
	int fuelcap; // cap de armz de combust em galoes
	int mpg; // consumo em milhas/galão
}

// essa classe declara um objeto de tipo Vehicle

class TwoVehicles {
	public static void main(String args[]) {

		Vehicle02 minivan = new Vehicle02();
		Vehicle02 sportscar = new Vehicle02();
		
		Vehicle02 motocicleta;
		motocicleta = new Vehicle02();

		int range1, range2;

		// atribui valores a cada campo de minivan
		minivan.passangers = 7;
		minivan.fuelcap = 16; // observe o uso do operador ponto para o acesso a um membro
		minivan.mpg = 21;

		// atribui valores a cada campo de sportscar
		sportscar.passangers = 2;
		sportscar.fuelcap = 14; // observe o uso do operador ponto para o acesso a um membro
		sportscar.mpg = 12;

		// calcula a autonomia presumindo um tanque cheio de gasolina

		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportscar.fuelcap * sportscar.mpg;

		System.out.println("Minivan can carry " + minivan.passangers + " with a range of " + range1);

		System.out.println("Sportscar can carry " + sportscar.passangers + " with a range of " + range2);

	motocicleta.fuelcap = 500;
	
	System.out.println("Fluelcap da motocicleta " + motocicleta.fuelcap);
	
	
	}
}