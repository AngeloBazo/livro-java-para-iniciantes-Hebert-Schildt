
public class Guess3 {

	public static void main(String[] args) 
	
throws java.io.IOException {
		
		char ch, answer = 'k';
		
		System.out.println ("I´m thinking of a letter between A and Z. ");
		
		System.out.print("Can you guess it: " );
		
		ch = (char) System.in.read(); // obtem um char
		
		if (ch == answer) System.out.println ("*** Right***");
		
		
		else {
		
			System.out.println (".....Sorry, you're");
			
			if (ch < answer) System.out.println ("tool low");
			
			else System.out.println ("too high");	
			
		
			
		}
			
	
	}

}
