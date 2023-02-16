package ModificadoresDeAcesso;

public class AcessDemo01 {

	public static void main(String[] args) {
		
		MyClass01 ob = new MyClass01();
		
		ob.setAlpha(-99);
		System.out.println("ob.alpha is " + ob.getAlpha());
		
		// ob.alpha = 10; // assim não pode pq é privado
		
		ob.beta = 88;
		ob.gamma = 99;
		
		System.out.println(ob.beta);
		System.out.println(ob.gamma);
		
		
		
		
		
		
	}

}
