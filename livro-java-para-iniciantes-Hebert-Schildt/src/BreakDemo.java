
public class BreakDemo {

	public static void main(String[] args) {
		
		// usando break para sair de um laço
		
		int num = 100;
		
		// executa o laço enquanto i ao quadrado é menor do que num
		
		for (int i=0; i<num; i++) {
			
			if (i*i >= num) break; // encerra o laço se i*i >=100
			
			System.out.println(i + " ");
		}
			
			System.out.println ("Loop complete.");
		}
			
		}
