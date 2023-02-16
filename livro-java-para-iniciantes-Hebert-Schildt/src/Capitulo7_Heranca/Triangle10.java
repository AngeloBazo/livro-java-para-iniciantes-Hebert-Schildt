package Capitulo7_Heranca;

public class Triangle10 extends TwoDShape10 {

	private String style;

	Triangle10() {

		super();
		style = "nome";
	}

	Triangle10(String s, double w, double h) {

		super(w, h);

		style = s;
	}

	Triangle10 (double x){
	super(x);	
	style = "filled";
	}
	
	double area() {

		return getWidth() * getHeight() / 2;

	}

	void showStyle() {
		System.out.println("Triangle is " + style);
	}

}
