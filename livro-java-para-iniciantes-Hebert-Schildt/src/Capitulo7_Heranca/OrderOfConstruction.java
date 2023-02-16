package Capitulo7_Heranca;

class A238 {

	A238() {
		System.out.println("A");
	}

	void metodosteste10(){
		System.out.println("metodosteste10");
	}
	
	int metodosteste10(int w){
		
		return w + 100;
	}
	
}

class B238 extends A238 {

	B238() {
		System.out.println("B");
	}

}

class C238 extends B238 {

	C238() {
		System.out.println("C");
	}

}

public class OrderOfConstruction {

	public static void main(String[] args) {

		C238 c = new C238();
		
		c.metodosteste10();
		System.out.println(c.metodosteste10(500));

	}

}
