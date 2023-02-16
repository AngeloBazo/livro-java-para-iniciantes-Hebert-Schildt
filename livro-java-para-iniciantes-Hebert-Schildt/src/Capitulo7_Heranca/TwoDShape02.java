package Capitulo7_Heranca;

public class TwoDShape02 {

	private double width;
	private double height;

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
	
	
	void showDim () {
		System.out.println("Width and height are " + width + " and " + height);
		
	}

}
