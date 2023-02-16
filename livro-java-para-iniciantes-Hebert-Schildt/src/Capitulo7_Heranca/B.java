package Capitulo7_Heranca;

public class B extends A {

	int i;

	B(int a, int b) {
		super.i = a;
		i = b;
	}

	void show() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("in in subclass: " + i);
	}

}
