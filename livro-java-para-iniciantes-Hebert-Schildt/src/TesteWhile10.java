import java.util.Scanner;

public class TesteWhile10 {
	
	public static void main(String[] args) { 

		int contador;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Até quando contar: ");
		
		int ateQuando = scan.nextInt();
		
		System.out.println ("Vamos contar até: "  + ateQuando);
												
		contador = 0;
				
		while (contador <= ateQuando) {
			
			System.out.println(contador);
			
						contador ++;
						
		}
		
		System.out.println("Valor final na memória da variável contador : " + contador);
	}
}
