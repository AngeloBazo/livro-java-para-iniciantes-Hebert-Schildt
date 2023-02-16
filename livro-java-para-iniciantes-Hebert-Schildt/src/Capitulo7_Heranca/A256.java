package Capitulo7_Heranca;

class AA256 {

	final void meth() {
		System.out.println("final");
	}

}

class BB256 extends AA256 {

	// void meth() { // não pode sobrepor por conta do final
	// System.out.println("Ilegal");
//	}

}

public class A256 {

	public static void main(String[] args) {

		System.out.println("Teste");

	}

}
