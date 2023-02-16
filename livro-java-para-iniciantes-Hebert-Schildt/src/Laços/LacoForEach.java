package Laços;

public class LacoForEach {

	public static void main(String[] args) {
		
		
		int [] nums = {9, 10, 29, 28, 1, 4, 8};
		
		int sum = 0;
		
		
		int tamArray = nums.length;
		
		System.out.print("Array nums : ");
		for (int x: nums) {
			
			sum+=x;
		System.out.print(x + " - ");
		
		}
		
		System.out.println();
		
		System.out.println("Soma dos n do array : " + sum);
		
		System.out.println("Tamanho do array : " + tamArray);
	}

}
