package Capitulo7_Heranca;

public class Triangle02 extends TwoDShape02 {

	String style;
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	
	void showStyle () {
		
		System.out.println("Triangle is " + style);
		
	}
	
}
