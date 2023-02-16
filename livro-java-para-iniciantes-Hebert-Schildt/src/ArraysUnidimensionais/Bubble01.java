package ArraysUnidimensionais;

public class Bubble01 {

	public static void main(String[] args) {

		int[] nums = { 9, 7, 5, 3, 4, 2, 6, 0, 1, 8 };

		int a, b, t;
		int size = 10;

		System.out.println("Array original :");

		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " - ");

		for (a = 1; a < size; a++)
			
			for (b = size - 1; b >= a; b--) {

				if (nums[b - 1] > nums[b]) {

					t = nums[b - 1];
					nums[b - 1] = nums[b];
					nums[b] = t;

				}

			}

		System.out.println("\n");

		System.out.println("Array classificado :");

		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " - ");

	}

}
