package ArraysMultidimensionais;

public class ArrayIrregular01 {

	public static void main(String[] args) {
		
		int t, i;
		
		int [] [] table = new int [3][];
		
		table [0] = new int [4];
		table [1] = new int [4];
		table [2] = new int [4];

		for (t = 0; t < 3; t++) {
			for (i = 0; i < 4; i++) {
				table[t][i] = i;
				System.out.print(table[t][i] + "\t");

			}
			System.out.println();
		}
		
	}

}
