package Classes;

public class ClasseInterna01 {

	public static void main(String[] args) {

		int x = 10;

		class ClasseInterna02 {

			int y = 20;

			int meuMetodoInterno(int j) {

				int jj = y + j + x;

				return jj;

			}

		}

		ClasseInterna02 obj01 = new ClasseInterna02();

		System.out.println("X:" + x);

		System.out.println("Y:" + obj01.y);

		System.out.println("Meu Método com passagem de 100: " + obj01.meuMetodoInterno(100));

		
		int oo = obj01.meuMetodoInterno(500);
		
		System.out.print("oo:" + oo);
		
		
	}
}
