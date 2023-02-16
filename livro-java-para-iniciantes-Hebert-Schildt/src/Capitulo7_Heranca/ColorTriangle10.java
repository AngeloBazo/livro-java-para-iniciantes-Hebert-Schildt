package Capitulo7_Heranca;

public class ColorTriangle10 extends Triangle10 {

	private String color;

	public ColorTriangle10(String c, String s, double w, double h) {
		super(s, w, h);
		color = c;
	}

	String getColor() {
		return color;
	}

	void showColor() {
		System.out.println("Color is " + color);
	}

}
