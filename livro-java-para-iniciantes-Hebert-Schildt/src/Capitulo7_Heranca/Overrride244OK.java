package Capitulo7_Heranca;

class A243 {

	int i, j;

	A243(int a, int b) {

		i = a;
		j = b;

	}

	void show() {
		System.out.println("i and j : " + i + " " + j);
	}
}

class B244 extends A243 {

	int k;

	public B244(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	void show() {
		System.out.println("k: " + k);
	}

}




public class Overrride244OK {

	public static void main(String[] args) {

		B244 subOb = new B244(1, 2, 3);
		
		subOb.show();
		
		A243 objA243 = new A243(100, 500);
		
		objA243.show();
		
		 System.out.println("teste");

	}

}
