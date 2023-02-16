package interfaces;

public class IConstD implements IConst {

	public static void main(String[] args) {

		int nums[] = new int[MAX];

		for (int i = MIN; i < 11; i++) {
			if (i >= MAX)
				System.out.println(ERRORMSG);
			else {
				nums[i] = i;
				System.out.println(nums[i] + " ");
			}
		}

		IConstD obj01 = new IConstD();
		
		System.out.println(obj01.testarMetodo());
		
	}

	String msg;
	
	@Override
	public String testarMetodo() {
		msg = "testarMetodo()";
		return msg;
	}
}
