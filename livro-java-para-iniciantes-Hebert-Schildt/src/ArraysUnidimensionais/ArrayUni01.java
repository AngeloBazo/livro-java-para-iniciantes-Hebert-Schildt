package ArraysUnidimensionais;

public class ArrayUni01 {

	public static void main(String[] args) {

		int[] nums = new int[5];

		int min, max;

		nums[0] = 9999999;
		nums[1] = -10;
		nums[2] = 100123;
		nums[3] = -978;
		nums[4] = 5623;

		min = max = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < min) {
				min = nums[i];
			} 
			
			if (nums[i] > max) {
				
				max = nums[i];

			}

			
		}

		System.out.println("Min : " + min);
		System.out.println("Max : " + max);
		// System.out.println(min);
		// System.out.println(max);

	}

}
