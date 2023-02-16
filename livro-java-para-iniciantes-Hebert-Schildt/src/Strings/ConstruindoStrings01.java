package Strings;

public class ConstruindoStrings01 {

	public static void main(String[] args) {

		String str = new String("Hello");
		System.out.println(str);

		String str2 = "Olá";
		System.out.println(str2);

		String str3 = str + " - " + str2;
		System.out.println(str3);
		
		String str4 = "Hello";
		System.out.println("Boolean: " + str4.equals(str));
		
		String str5 = "12345";
		System.out.println("Length: " +str5.length());
		
		String str6 = "ABCDEF";
		System.out.println("CharAt: " +str6.charAt(0));
		
		String str7 = "Teste001 com marmita";
		System.out.println("CompareTo: " +str.compareTo(str7));
		int result = str7.compareTo(str6);
		System.out.println(result);
		
		
		
	

	}

}
