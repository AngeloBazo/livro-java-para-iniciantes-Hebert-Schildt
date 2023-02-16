package Capitulo7_Heranca;

public class TwoDShape10 {

	private double width;
	private double height;

	TwoDShape10() {
		width = height = 0.0;
	}

	TwoDShape10(double w, double h) {

		width = w;
		height = h;
	}

	TwoDShape10(double x) {
		width = height = x;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}

}
