package Capitulo7_Heranca;

public class Shapes2 {

	public static void main(String[] args) {

		Triangle02 t1 = new Triangle02();
		Triangle02 t2 = new Triangle02();

		t1.setWidth(4.0);
		t1.setHeight(4.0);
		t1.style = "filled";

		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.style = "outlined";

		System.out.println("info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());

		System.out.println();

		System.out.println("info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());

	}

}
