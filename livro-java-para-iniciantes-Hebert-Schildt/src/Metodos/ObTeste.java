package Metodos;

public class ObTeste {

	public static void main(String[] args) {

		ObTesteClasse ob1 = new ObTesteClasse();
		ObTesteClasse ob2 = new ObTesteClasse();
		ObTesteClasse ob3 = new ObTesteClasse();

		System.out.println(ob1.passarObj());

		System.out.println("------------------------");
		System.out.println(ob2.passarOb1(ob1));
		System.out.println(ob3.passarOb1(ob1));

		if (ob2.passarOb1(ob1) == ob3.passarOb1(ob1)) {

			System.out.println("True");
		} else
			System.out.println("False");

	}

}
