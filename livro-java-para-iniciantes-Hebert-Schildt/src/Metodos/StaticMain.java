package Metodos;

public class StaticMain {

	public static void main(String[] args) {

		StaticClasse ob01 = new StaticClasse();
		StaticClasse ob02 = new StaticClasse();
		

		ob01.x = 10;
		ob01.y = 5;
		
		ob02.x = 300;
		ob02.y = 500;
		

		System.out.println(ob01.x);

		System.out.println(StaticClasse.y);

		System.out.println(ob01.y);

		StaticClasse.y = 100;

		System.out.println(ob01.y);
		System.out.println(StaticClasse.y);
		
		System.out.println(ob01.x);
		System.out.println(ob02.x);

	}

}
