package Metodos;

public class Recursion {

	public static void main(String[] args) {
		
		Factorial f = new Factorial();
		
		System.out.println(f.factR(3));
		System.out.println(f.factR(4));
		System.out.println(f.factR(5));
		
		System.out.println("----------------");
		
		System.out.println(f.factI(3));
		System.out.println(f.factI(4));
		System.out.println(f.factI(5));
		

	}

}
