
public class IfAlinhado1 {

	public static void main(String[] args) {
		
		int i = 0;
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int j = 10;
		int k = 101;
				
		if (i == 10) {
			
			if (j<20) a = b; 
			
			System.out.println ("teste if 1");
			
			if (k>100) c = d;
			
			System.out.println ("teste if 2");
			
			//else // = c;  esse else é referente a if (k > 100)

			System.out.println ("teste if 3");				
		
		}
		
		else a = d; //esse if é referente a if (i ==10)
		System.out.println ("teste if 4");
		
	}

}
