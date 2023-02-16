package Capitulo7_Heranca;

class Sup { // essa � uma superclasse

	void who() {
		System.out.println("Who() in Sup");
	}
}

class Sub1 extends Sup { // subclasse

	void who() {
		System.out.println("Who() in Sub1");
	}

}

class Sub2 extends Sup { // subclasse

	void who() {
		System.out.println("Who() in Sub2");
	}

}

public class DynDispDemo {

	public static void main(String[] args) {

		Sup superOb = new Sup();
		Sub1 subOb1 = new Sub1();
		Sub2 subOb2 = new Sub2();

		Sup supRef;

		supRef = superOb;
		supRef.who();

		supRef = subOb1;
		supRef.who();

		supRef = subOb2;
		supRef.who();

	}

}
