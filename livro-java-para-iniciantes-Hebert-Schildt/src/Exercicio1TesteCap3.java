
public class Exercicio1TesteCap3 {

	public static void main(String[] args) 
	
	throws java.io.IOException {

		char ch;
		int spaces  = 0;
		
		System.out.println("Enter a period to stop .");
		
		do { 
			ch = (char) System.in.read();
			if (ch == ' ') spaces ++;
		} while (ch != '.');
		System.out.println("Spaces: " + spaces);
						
		}
}
		
		
		/*char letraDigitada;
		
		do { 	
			
		System.out.print("Digite um caracter do teclado :");
		
		letraDigitada = (char) System.in.read();
		
		System.out.println("Caracter diditado: " + letraDigitada); 
				
		System.out.println("Digite novo caracter ou '.' para sair :");
		
		} while (letraDigitada != '.');
				
			System.out.println ("Bye, Bye, Babe! See you later!");
		
		}

}*/
