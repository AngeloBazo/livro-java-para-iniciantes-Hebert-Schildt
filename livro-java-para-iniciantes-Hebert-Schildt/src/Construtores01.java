
public class Construtores01 {

	int x;

	Construtores01() {
		this.x = 10;
	}



@Override
	public String toString() {
		return "Construtores01 [x=" + x + "]";
	}



public static void main (String [] args) {

	Construtores01 t1 = new Construtores01();
	Construtores01 t2 = new Construtores01();
	
	
	System.out.println(t1.x + " " + t2.x);
	System.out.println(t1.toString());
	
}
}