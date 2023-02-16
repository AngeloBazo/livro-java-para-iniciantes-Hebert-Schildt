package interfaces;

public class DefaultMethodDemo {

	public static void main(String[] args) {

		MyIFImp obj = new MyIFImp();

		System.out.println("User: \t" + obj.getUserID());

		System.out.println("Admin: \t" + obj.getAdminID());
		
		System.out.println();

		MyIFImp2 obj2 = new MyIFImp2();

		System.out.println("User: \t" + obj2.getUserID());

		System.out.println("Admin: \t" + obj2.getAdminID());

	}

}
