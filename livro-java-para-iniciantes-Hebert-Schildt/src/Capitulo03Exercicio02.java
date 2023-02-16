import java.util.Scanner;

public class Capitulo03Exercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Começar a contagem - tecla S ");

		String s = teclado.nextLine();

		if (s.equals("s")) {

			for (int count = 0;; count++) {

				System.out.println("Contador : " + count);

				System.out.println("Deseja continuar S ou N :");
				String c = teclado.nextLine();

				if (c.equals("s"))
					continue;
				else System.out.println("FIM!!!");
					break;

			}

		}

	}

}
