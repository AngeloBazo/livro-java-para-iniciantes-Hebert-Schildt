package Capitulo7_Heranca;

class XX {

	int a;

	public XX(int i) {
		this.a = i;
	}

public int metodotest(int uu) {
	
	int ww = uu + 100;
return ww;
}


}

class YY {

	int a;

	public YY(int i) {
		this.a = i;

	}

}

public class InconpatibleRef {

	public static void main(String[] args) {

		XX x = new XX(10);

		XX x2;

		YY y = new YY(5);
		
		x2 = x; // correto, as duas são do mesmo tipo
		
		//x2 = y; // Erro, não são do mesmo tipo
		
		System.out.println(x.metodotest(500));
		System.out.println(x2.metodotest(200));
		
			
		  System.out.println(y.a);
		


		
	}

}
