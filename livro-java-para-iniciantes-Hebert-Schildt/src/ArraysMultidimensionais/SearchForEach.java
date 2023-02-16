package ArraysMultidimensionais;

public class SearchForEach {

	public static void main(String[] args) {

		int[] nums = { 9, 8, 5, 2, 3, 6 };

		System.out.print("Array: ");
		
		for (int array : nums)
			System.out.print(array + " - ");

		System.out.println();
		
		int val = 6;

		int posicao = -1;

		boolean found = false;

		for (int x : nums) {
			posicao++;
			if (x == val) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Value found! - Number: " + val);
			System.out.println("In position : " + posicao);
		}

	}

}
