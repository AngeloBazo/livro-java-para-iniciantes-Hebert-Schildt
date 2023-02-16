package Capitulo7_Heranca;

public class Shapes6 {

	public static void main(String[] args) {

		ColorTriangle10 t1 = new ColorTriangle10("blue", "outlined", 8.0, 12.0);

		ColorTriangle10 t2 = new ColorTriangle10("red", "filed", 2.0, 2.0);

		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		t1.showColor();
		System.out.println("Area is " + t1.area());

		System.out.println();

		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		t2.showColor();
		System.out.println("Area is " + t2.area());

	}

}
