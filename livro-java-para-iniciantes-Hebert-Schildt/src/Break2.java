
// L� a entrada at� um q ser recebido

public class Break2 {

	public static void main(String[] args)
	
	throws java.io.IOException {
		
		System.out.println ("Programa rodando la�o infinito at� pressed q!");
		
		char ch;
		
		for (;;) { // la�o infinito
		
			System.out.println ("rodando");
			
			ch = (char) System.in.read(); //obt�m um char
			
			if (ch == 'q') break;
		}
		System.out.println ("You pressed q! - congratulations");
		
	}

}	
