import java.util.Scanner;

public class TesteWhile10 {
	
	public static void main(String[] args) { 

		int contador;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("At� quando contar: ");
		
		int ateQuando = scan.nextInt();
		
		System.out.println ("Vamos contar at�: "  + ateQuando);
												
		contador = 0;
				
		while (contador <= ateQuando) {
			
			System.out.println(contador);
			
						contador ++;
						
		}
		
		System.out.println("Valor final na mem�ria da vari�vel contador : " + contador);
	}
}
