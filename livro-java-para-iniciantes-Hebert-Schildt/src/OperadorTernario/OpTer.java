package OperadorTernario;

public class OpTer {

	public static void main(String[] args) {
		
		int variavelOp;
		
		int verdade = 1;
		
		int a = 100;
		int b = 200;
				
		variavelOp = verdade == 1 ? a : b; 
					
		System.out.println("verdade = " + verdade);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("variavelOp = verdade == 1 ? a : b;");
		System.out.println("variavelOp = " + variavelOp);
	}

}
