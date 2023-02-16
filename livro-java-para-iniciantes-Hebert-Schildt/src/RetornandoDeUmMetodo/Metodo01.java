package RetornandoDeUmMetodo;

public class Metodo01 {

	public static void main(String[] args) {

		range();

		System.out.println(rangeReturn());

		System.out.println(rangeComParametros(10, 20));

		rangeComParametrosVoid(5, 9);
		
		int ddd = rangeComParametros(100, 200);
				
		System.out.println(ddd);

	}
	                                                                                                                                                           

	// METODOS UTILIZADOS NO MAIN:

	static void range() {
		System.out.println("Método range");
	}

	static int rangeReturn() {
		// int a = 1;
		// return a;
		return 10;
	}

	static int rangeComParametros(int a, int b) {
		return a + b;
	}

	static void rangeComParametrosVoid(int a, int b) {

		int c = a + b;

		if (c < 50) {
			System.out.println(c);
		} else

			return;// causa o encerramento imediato do método void
	}
}