package tratamento.de.excecoes;

public abstract class TesteException01 {

	public static void main(String[] args) {

		int a = 0, b = 5;
		int c;

		try {

			c = 10 / 0;

			System.out.println("TRY - Divisão por zero");

			System.out.println(c);

			c = 10;

		} catch (Exception e) {

			System.out.println("CATCH - Divisão por zero");

			c = 5;

		}

		System.out.println(c);

		

	}

}
