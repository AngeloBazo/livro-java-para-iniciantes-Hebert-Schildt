
// Lê a entrada até um q ser recebido

public class Break2 {

	public static void main(String[] args)
	
	throws java.io.IOException {
		
		System.out.println ("Programa rodando laço infinito até pressed q!");
		
		char ch;
		
		for (;;) { // laço infinito
		
			System.out.println ("rodando");
			
			ch = (char) System.in.read(); //obtém um char
			
			if (ch == 'q') break;
		}
		System.out.println ("You pressed q! - congratulations");
		
	}

}	
