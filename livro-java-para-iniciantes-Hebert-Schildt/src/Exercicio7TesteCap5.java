
public class Exercicio7TesteCap5 {

	public static void main(String[] args) {
		
		
		boolean running = true;
		int x = 1;
		int y = 2;
		
		for (int i=0; i<10; i++) {
		
			while (running) {
		
				if (x <y) break;
				
			}
		System.out.println( "after while");
		}
		
		System.out.println( "after for");

	}

}
