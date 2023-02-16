
public class Exercicio10TesteCap7 {
	public static void main(String[] args) 
		throws java.io.IOException {

		char ch;
		int changes = 0;
		
		System.out.println("Enter period to stop.");
		
		do {  
			
			ch = (char) System.in.read(); // leia

			if (ch >= 'a' & ch <= 'z') {
				ch -=32;
				changes++;
				
				System.out.println(ch); // escreva
	
			} 	
	
			else if (ch >= 'A' & ch <= 'Z') {
				ch += 32;
				changes ++;
				System.out.println(ch);
			}
	
		} while (ch != '.'); 
	
		System.out.println("case changes: " + changes); 
		
		}
		
	}
	
		
		
		
/*		char ch;
		char op;
		
		do {

		System.out.println("Digite um caractere do teclado em letra maiuscula ou minuscula: ");
		ch = (char) System.in.read(); 
		System.out.println("O caractere digitado foi: " + ch);
		
		
					

		System.out.println ("\nDeseja fazer novamente?  Digite:\n 'S' para SIM \n 'N' para NÃO\n");
		op = (char) System.in.read(); 
		
	} while (op != 'N');
		
	System.out.println ("Bye, Bye, Babe! See you later!"); */
			

